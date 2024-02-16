package Difficulty_Easy;
import java.util.*;
public class Q1207_Unique_Number_of_Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		Set<Integer> set = new HashSet<>();
		for(int n : map.values()) {
			if(set.contains(n)) {
				System.out.println(false);
				break;
			} else {
				set.add(n);
			}
		}
		System.out.println(true);
	}

}
