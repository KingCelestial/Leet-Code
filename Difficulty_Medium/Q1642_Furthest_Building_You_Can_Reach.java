package Difficulty_Medium;

import java.util.*;

public class Q1642_Furthest_Building_You_Can_Reach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
		int bricks = 10, ladders = 2;
		Queue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < heights.length - 1; i++) {
			
			int climb = heights[i + 1] - heights[i];
			
			if (climb <= 0) {
				continue;
			}
			
			pq.add(climb);
			
			if (pq.size() <= ladders) {
				continue;
			}

			bricks = bricks - pq.remove();
			
			if (bricks < 0) {
				System.out.println(i);
			}
		}
		System.out.println(heights.length - 1);
	}

}
