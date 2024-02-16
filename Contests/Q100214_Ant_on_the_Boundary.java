package Contests;

public class Q100214_Ant_on_the_Boundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,-5};
		int sum=0;
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(sum==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
