package Difficulty_Easy;

public class Q520_Detect_Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "uZfa";
		
		if(word.length() == 1) {
			System.out.println(true);
		}
		
		if((int)(word.charAt(0)) > 91) {
			for (int i = 0; i < word.length(); i++) {
				if((int)(word.charAt(i)) < 91) {
					System.out.println(false);
				}
			}
			System.out.println(true);
		} else {
			if((int)(word.charAt(1)) > 91) {
				for (int i = 1; i < word.length(); i++) {
					if((int)(word.charAt(i)) < 91) {
						System.out.println("false");
					}
				}
				System.out.println(true);
			} else {
				for (int i = 0; i < word.length(); i++) {
					if((int)(word.charAt(i)) > 91) {
						System.out.println("false");
					}
				}
				System.out.println(true);
			}
		}
	}

}
