package Difficulty_Easy;

import java.util.*;

public class Q1464_Maximum_Product_of_Two_Elements_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 7 };
		Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		int maximumProduct = (pq.remove() - 1) * (pq.remove() - 1);
		System.out.println(maximumProduct);
	}

}
