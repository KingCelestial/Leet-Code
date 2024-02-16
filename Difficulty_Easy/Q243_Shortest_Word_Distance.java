package Difficulty_Easy;

public class Q243_Shortest_Word_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "practice";
		int i1 =-1, i2=-1;
		int mind = wordsDict.length;
		for (int i = 0; i < wordsDict.length; i++) {
			if(wordsDict[i].equals(word1)) {
				i1=i;
			}
			else if(wordsDict[i].equals(word2)) {
				i2=i;
			}
			
			if( i1 != -1 && i2 != -1) {
				mind= Math.min(mind, Math.abs(i1 -i2));
			}
		}
		System.out.println(mind);
	}

}
