package Contests;
import java.util.*;
public class Q100256_Latest_Time_You_Can_Obtain_After_Replacing_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "??:1?";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='?') {
				if(i==0 && (s.charAt(i+1)=='0' || s.charAt(i+1)=='1')) {
					sb.append(1);
				}
				if(i==0 && (s.charAt(i+1)!='0' || s.charAt(i+1)!='1')) {
					sb.append(0);
				}
				if(i==1 && s.charAt(i-1)=='0') {
					sb.append(9);
				}
				if(i==1 && (s.charAt(i-1)=='1' || s.charAt(i-1)=='?')) {
					sb.append(1);
				}
				
				if(i==3) {
					sb.append(5);
				}
				
				if(i==4) {
					sb.append(9);
				}
				
				
			}else {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
