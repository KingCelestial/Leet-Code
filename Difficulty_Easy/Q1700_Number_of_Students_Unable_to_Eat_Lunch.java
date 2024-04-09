package Difficulty_Easy;
import java.util.*;
public class Q1700_Number_of_Students_Unable_to_Eat_Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < students.length ; i++) {
			queue.add(students[i]);
		}
		
		for (int i = 0; i < sandwiches.length; i++) {
			if(queue.peek()==sandwiches[i]) queue.poll();
			else {
				
			}
		}
		
		
		
	}

}
