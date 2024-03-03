package Difficulty_Easy;

public class Q461_Hamming_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 4;
//		System.out.println(Integer.bitCount(x^y));
		int ans = x^y;
		int count=0;
		while(ans!=0) {
			count++;
			ans = ans&(ans-1);
		}
		System.out.println(count);
	}

}
