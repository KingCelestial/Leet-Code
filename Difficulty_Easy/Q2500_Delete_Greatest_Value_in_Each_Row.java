package Difficulty_Easy;
import java.util.*;
public class Q2500_Delete_Greatest_Value_in_Each_Row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,2,4},{3,3,1}};
		int sum=0;
		for (int i = 0; i < grid.length; i++) {
			Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
			for (int j = 0; j < grid[0].length; j++) {
				pq.add(grid[i][j]);
			}
			sum += pq.remove();
		}
		System.out.println(sum);
	}

}
