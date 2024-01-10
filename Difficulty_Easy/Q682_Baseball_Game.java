package Difficulty_Easy;
import java.util.*;
public interface Q682_Baseball_Game {
	public static void main(String[] args) {
		String[] str = {"5","2","C","D","+"};
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < str.length; i++) {
			if(str[i]=="C") {
				st.pop();
			} else if(str[i]=="D") {
				int temp1 = st.pop();
				int temp2 = 2*(temp1);
				st.push(temp1);
				st.push(temp2);
			} else if(str[i]=="+") {
				int temp1 = st.pop();
				int temp2 = st.pop();
				st.push(temp2);
				st.push(temp1);
				st.push(temp1+temp2);
			}else {
				st.push(Integer.parseInt(str[i]));
			}
		}
		int sum=0;
		for(int n : st) {
			sum +=n;
		}
		System.out.println(sum);
	}
}
