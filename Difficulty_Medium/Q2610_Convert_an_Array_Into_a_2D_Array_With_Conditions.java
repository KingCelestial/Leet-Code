package Difficulty_Medium;
import java.util.*;
import java.util.Map.Entry;
public class Q2610_Convert_an_Array_Into_a_2D_Array_With_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,1,2,3,1};
		List<List<Integer>> ll = new ArrayList<>();
		Map<Integer,Integer> map= new HashMap<>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		while(!map.isEmpty()) {
			List<Integer> temp = new ArrayList<>();
			List<Map.Entry<Integer, Integer>> entriesToRemove = new ArrayList<>();
			for(Map.Entry<Integer,Integer> entry : map.entrySet()){
				temp.add(entry.getKey());
				entry.setValue(entry.getValue() - 1);
				if(entry.getValue() == 0) {
					entriesToRemove.add(entry);
				}
			}
			for(Map.Entry<Integer,Integer> entry : entriesToRemove){
				map.remove(entry.getKey());
			}
			ll.add(temp);
		}
		
		System.out.println(ll);
	}

}
