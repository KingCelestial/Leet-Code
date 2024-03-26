package Difficulty_Easy;

import java.util.Iterator;

public class Q1732_Find_the_Highest_Altitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gain = {-5,1,5,0,-7};
		int netGain = 0;
		int max = 0;
		for (int i = 0; i < gain.length; i++) {
			netGain+=gain[i];
			if(netGain > max) max = netGain;
		}
		System.out.println(max);
	}

}
