package Difficulty_Easy;
import java.util.*;
public class Q412_Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		List<String> ll = new ArrayList<>();
		int i = 1;
		while(i != n) {
	
			if(i%15 == 0) {
				ll.add("FizzBuzz");
			}
			else if(i%5 == 0) {
				ll.add("Buzz");
			}
			else if(i%3 == 0) {
				ll.add("Fizz");
			}else {
				ll.add(String.valueOf(i));
			}
			
			i++;
		}
		System.out.println(ll);
	}

}
