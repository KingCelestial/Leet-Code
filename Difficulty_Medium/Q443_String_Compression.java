package Difficulty_Medium;

public class Q443_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a', 'b', 'c'};
		StringBuilder str = new StringBuilder();
		for(int i =0;i<chars.length;) {
			char c = chars[i];
			int cnt = 1;
			while(i+1<chars.length && c == chars[i+1]) {
				i++;
				cnt++;
			}
			str.append(c);
			if(cnt>1) {
				str.append(cnt);
			}
			i++;
		}
		
		char[] arr = str.toString().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			chars[i] = arr[i];
		}
	}

}
