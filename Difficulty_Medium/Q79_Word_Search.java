package Difficulty_Medium;

import java.util.*;

public class Q79_Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean ans =Search(board,word,i,j,0);
					if(ans==true) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);
	}
	public static boolean Search(char[][] board, String word, int i, int j, int idx) {
		if(word.length()==idx) {
			return true;
		}
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(idx)) {
			return false;
		}
		int[] r = {-1,1,0,0};
		int[] c = {0,0,1,-1};
		board[i][j] = '*';
		for(int k=0;k<c.length;k++) {
			boolean ans = Search(board,word,i+r[k],j+c[k],idx+1);
			if(ans) {
				return true;
			}
		}
		board[i][j]=word.charAt(idx);
		return false;
	}

}
