package Difficulty_Hard;
import java.util.*;
public class Q41_First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,8,9,11,12};
		boolean[] bool = new boolean[nums.length+1];
		for(int num: nums) {
			if(num>0 && num<=nums.length) {
				bool[num] = true;
			}
		}
		for(int i=1;i<=nums.length;i++) {
			if(!bool[i]) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(nums.length+1);
	}

}
