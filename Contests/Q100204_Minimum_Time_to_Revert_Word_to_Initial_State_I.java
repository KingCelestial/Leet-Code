package Contests;

public class Q100204_Minimum_Time_to_Revert_Word_to_Initial_State_I {

	public static void main(String[] args) {
        // Example 1
        String word1 = "abab";
        int k1 = 2;
        System.out.println(minimumTimeToRevert(word1, k1)); // Output: 2

        // Example 2
        String word2 = "abacaba";
        int k2 = 4;
        System.out.println(minimumTimeToRevert(word2, k2)); // Output: 1

        // Example 3
        String word3 = "abcbabcd";
        int k3 = 2;
        System.out.println(minimumTimeToRevert(word3, k3)); // Output: 4
    }

    public static int minimumTimeToRevert(String word, int k) {
        int n = word.length();
        int si = 0;
        int ei = n - 1;

        if (word.charAt(si) != word.charAt(ei)) {
            // If the first and last characters are different
            return (n + k - 1) / k;
        } else {
            // If the first and last characters are the same
            while (si < ei && word.charAt(si) == word.charAt(ei)) {
                si++;
                ei--;
            }
            ei++;

            return (ei + k - 1) / k;
        }
    }
}
