package Difficulty_Medium;

import java.util.*;

public class Q1481_Least_Number_of_Unique_Integers_after_K_Removals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 1, 1, 3, 3, 2 };
		int k = 3;
		Map<Integer, Integer> map = new HashMap<>();
		for (int v : arr) {
			map.put(v, map.getOrDefault(v, 0) + 1);
		}
		LinkedList<Integer> ll = new LinkedList(map.values());
		Collections.sort(ll);
		int elements = 0;
		for (int i = 0; i < ll.size(); i++) {
			elements += ll.get(i);
			if(elements > k) {
				System.out.println(ll.size()-i);
				break;
			}
		}
		System.out.println(0);
	}

}
