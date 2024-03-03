package Difficulty_Medium;

public class Q201_Bitwise_AND_of_Numbers_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 9, right = 12;
		int shift = 0;
		while(left<right) {
			left>>=1;
			right>>=1;
			++shift;
		}
		System.out.println(right<<shift);
	}

}
