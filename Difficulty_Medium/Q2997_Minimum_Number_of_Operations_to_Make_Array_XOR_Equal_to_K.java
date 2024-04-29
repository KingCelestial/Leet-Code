package Difficulty_Medium;

public class Q2997_Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,4};
		int k = 1;
		int finalXor=0;
		for(int num: nums) {
			finalXor = finalXor ^ num;
		}
		System.out.println(Integer.bitCount(finalXor ^ k));
	}

}
