package Contests;

public class Q100221_Maximum_Number_of_Operations_With_the_Same_Score_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,6,1,4};
		int e1 = 0;
		int e2 = 1;
		int sum=nums[e1]+nums[e2];
		int count=0;
		while(e2<nums.length && nums.length>=2 && nums[e1]+nums[e2] == sum) {
			count++;
			e1+=2;
			e2+=2;
		}
		System.out.println(count);
	}

}
