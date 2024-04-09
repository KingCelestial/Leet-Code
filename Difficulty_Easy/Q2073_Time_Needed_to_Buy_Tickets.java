package Difficulty_Easy;
import java.util.*;
public class Q2073_Time_Needed_to_Buy_Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tickets = { 2, 3, 2 };
		int k = 2;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}
		
		int time=0;
		
		while(!queue.isEmpty()) {
			time++;
			int front = queue.poll();
			tickets[front]--;
			
			if(k==front && tickets[front]==0) {
				System.out.println(time);
				break;
			}
			
			if(tickets[front]!=0) {
				queue.add(front);
			}
		}
	}

}
