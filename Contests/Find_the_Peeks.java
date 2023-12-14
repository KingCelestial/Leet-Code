package Contests;

import java.util.*;

public class Find_the_Peeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,4};
		peeks(arr);
	}
	
	public static void peeks(int[] arr) {
		List<Integer> ll = new ArrayList<>();
		for(int i=1; i<arr.length-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				ll.add(i);
		}
	}
		System.out.println(ll);
}

}
