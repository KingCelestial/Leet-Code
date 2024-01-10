package Difficulty_Easy;

import java.util.*;

public class Q1496_Path_Crossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "NES";
		path(s);
	}

	private static void path(String s) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		Set<String> visited = new HashSet<>();
		visited.add("0,0");
		
		for(char direction : s.toCharArray()) {
			if(direction == 'E') {
				x++;
			}
			
			else if(direction == 'W') {
				x--;
			}
			
			else if(direction == 'N') {
				y++;
			}
			
			else if(direction == 'S') {
				y--;
			}
			
			String currentPosition = x + ","+ y;
			if(visited.contains(currentPosition)) {
				System.out.println(true);
			}
			
			visited.add(currentPosition);
			
		}
		
		System.out.println(false);
		
	}
	

}
