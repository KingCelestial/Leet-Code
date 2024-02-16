package Contests;

public class Q100215_Number_of_Changing_Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AaAaAaaA";
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			int x = Math.abs((int) (s.charAt(i) - s.charAt(i-1)));
			if(x!=32 && x!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
