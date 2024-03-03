package Difficulty_Easy;
import java.util.*;
public class Q1971_Find_if_Path_Exists_in_Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6,  source = 0, destination = 5;
		int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
		if(source == 0 && destination == 0) {
			System.out.println("true");
		}
		Map<Integer,Set<Integer>> map = new HashMap<>();
		for(int i=0; i<n;i++) {
			map.put(i, new HashSet<>());
		}
		for(int[] v : edges) {
			map.get(v[0]).add(v[1]);
		}
		System.out.println(map.get(source).contains(destination) || map.get(destination).contains(source));
	}

}
