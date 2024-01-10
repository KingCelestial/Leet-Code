package Contests;

public class Q10017_Maximum_Area_of_Longest_Diagonal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dimensions = {{4,10},{4,9},{9,3},{10,8}};
		double maxSqrt = 0;
		int area = 0;
		for (int i = 0; i < dimensions.length; i++) {
			int recArea = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
			double sqrt = Math.sqrt(recArea);
			if(sqrt > maxSqrt) {
				area = dimensions[i][0]*dimensions[i][1];
				maxSqrt=sqrt;
			} else if(sqrt == maxSqrt) {
				int tempArea = dimensions[i][0]*dimensions[i][1];
				area = Math.max(area, tempArea);
			}
		}
		System.out.println(maxSqrt+" "+area);
	}

}
