package Difficulty_Easy;

import java.util.Iterator;

public class Q997_Find_the_Town_Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		int n = 4;
		System.out.println(check(trust,n));
	}

	private static int check(int[][] trust, int n) {
		// TODO Auto-generated method stub
		if(trust.length < n-1) {
			return -1;
		}
		int[] indegrees = new int[n+1];
		int[] outdegrees = new int[n+1];
		for(int[] v : trust) {
			outdegrees[v[0]]++;
			indegrees[v[1]]++;
		}
		for (int i = 1; i <= n; i++) {
			if(indegrees[i] == n-1 && outdegrees[i] == 0) {
				return i;
			}
		}
		return -1;
	}

}
