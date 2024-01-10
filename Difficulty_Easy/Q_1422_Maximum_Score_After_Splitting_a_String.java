package Difficulty_Easy;

public class Q_1422_Maximum_Score_After_Splitting_a_String {
	public static void main(String[] args) {
		String s = "011101";
		maximumScore(s);
	}

	private static void maximumScore(String s) {
		// TODO Auto-generated method stub
		int ones = 0;
		int tempScore = s.charAt(0)=='0' ? 1 : 0;
		int score = tempScore;
		for(int i=1; i<s.length()-1;i++) {
			if(s.charAt(i)=='0') {
				tempScore+=1;
			}
			
			else {
				ones++;
				tempScore--;
			}
			
			if(tempScore>score) {
				score = tempScore;
			}
		}
		
		ones += (s.charAt(s.length()-1)=='1' ? 1 : 0);
		
		System.out.println(ones + score);
	}
}
