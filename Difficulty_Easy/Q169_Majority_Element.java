package Difficulty_Easy;
import java.util.*;
public class Q169_Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,1,2,2};
		int count = 1;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		int maxkey = 0;
		int maxValue = Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxValue) {
				maxkey = entry.getKey();
				maxValue = entry.getValue();
			}
		}
		System.out.println(maxkey);
	}

}
