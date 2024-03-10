package Difficulty_Easy;
import java.util.*;
public class Q349_Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		int i =0,j=0;
		Set<Integer> set = new HashSet<>();
		for(int v: nums1) {
			set.add(v);
		}
		Set<Integer> ans = new HashSet<>();
		while(i<nums2.length) {
			if(set.contains(nums2[i])) {
				ans.add(nums2[i]);
			}
			i++;
		}
		int[] result = new int[ans.size()];
		for(int v: ans) {
			result[j] = v;
			j++;
		}
		
	}

}
