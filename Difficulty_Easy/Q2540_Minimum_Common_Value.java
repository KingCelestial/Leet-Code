package Difficulty_Easy;
import java.util.*;
public class Q2540_Minimum_Common_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3}, nums2 = {2,4};
		Set<Integer> set = new HashSet<>();
		for(int v: nums1) {
			set.add(v);
		}
		for(int v: nums2) {
			if(set.contains(v)) {
				System.out.println(v);
			}
		}
		System.out.println(-1);
	}

}
