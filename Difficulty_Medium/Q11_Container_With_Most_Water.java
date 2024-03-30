package Difficulty_Medium;

public class Q11_Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,1};
		int left=0, right=height.length-1, totalWater=0;
		while(left<right) {
			int temp = height[left]<height[right] ? height[left] : height[right];
			totalWater = Math.max(totalWater, temp*(Math.abs(left-right))) ;
			if(height[left] < height[right]) {
				left++;
			} else if(height[left] == height[right]) {
				left++;
				right--;
			} else {
				right--;
			}
		}
		System.out.println(totalWater);
	}

}
