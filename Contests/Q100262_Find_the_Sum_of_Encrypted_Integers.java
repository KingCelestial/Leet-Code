package Contests;

import java.util.Iterator;

public class Q100262_Find_the_Sum_of_Encrypted_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,21,31};
		int ans=0;
		for (int i = 0; i < nums.length; i++) {
			ans +=check(nums[i]);
		}
		System.out.println(ans);
	}

	private static int check(int i) {
		// TODO Auto-generated method stub
		int max = 0;
		int count = 0;
		int mul = 1;
		int sum =0;
		while(i!=0) {
			int temp = i%10;
			if(temp> max) max = temp;
			i /= 10;
			count++;
		}
		while(count!=0) {
			sum += (max*mul);
			mul *= 10;
			count--;
		}
		return sum;
	}

}
