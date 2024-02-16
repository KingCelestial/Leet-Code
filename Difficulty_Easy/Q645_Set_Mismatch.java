package Difficulty_Easy;
import java.util.*;
public class Q645_Set_Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2};
		Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int i =1;
		for(int n : nums) {
			if(set.contains(n)) {
				ans[0] = n;
			}
			set.add(n);
			if(!set.contains(i)) {
				ans[1] = i;
			}
			i++;
		}
		for (int j = 0; j < ans.length; j++) {
			System.out.println(ans[j]);
		}
	}

}
