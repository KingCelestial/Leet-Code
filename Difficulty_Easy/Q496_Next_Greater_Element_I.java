package Difficulty_Easy;

import java.util.*;

public class Q496_Next_Greater_Element_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		Stack<Integer> st = new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();
		int[] res = new int[nums1.length];
		
		for(int num : nums2) {
			while(!st.isEmpty() && num > st.peek()) {
				map.put(st.pop(), num);
			}
			st.push(num);
		}
		System.out.println(map);
		
		int i = 0;
		for(int num : nums1) {
			res[i++] = map.getOrDefault(num, -1);
		}
		
	}

}
