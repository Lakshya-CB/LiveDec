package Lec_39;

public class Edit_Distance {
	public static void main(String[] args) {

	}

	public int minDistance(String word1, String word2) {
		if (word1.isEmpty() && word2.isEmpty()) {
			return 0;
		}
		if (word1.isEmpty()) {
			return word2.length();
		}
		if (word2.isEmpty()) {
			return word1.length();
		}

		if (word1.charAt(0) == word2.charAt(0)) {
			return minDistance(word1.substring(1), word2.substring(1));
		} else {
			int spE = minDistance(word1, word2.substring(1));
			int spD = minDistance(word1.substring(1), word2);
			int spR = minDistance(word1.substring(1), word2.substring(1));

			return Math.min(spE, Math.min(spD, spR)) + 1;
		}
	}

	public int minDistance(String word1, int idx1, String word2, int idx2) {

		if (idx1 == word1.length() || idx2 == word2.length()) {
			return Math.max(word1.length() - idx1, word2.length() - idx2);
		}

		if (word1.charAt(idx1) == word2.charAt(idx2)) {
			return minDistance(word1, idx1 + 1, word2, idx2 + 1);
		} else {
			int spE = minDistance(word1, idx1, word2, idx2 + 1);
			int spD = minDistance(word1, idx1 + 1, word2, idx2);
			int spR = minDistance(word1, idx1 + 1, word2, idx2 + 1);

			return Math.min(spE, Math.min(spD, spR)) + 1;
		}
	}

	public int minDistanceTD(String word1, int idx1, String word2, int idx2, Integer[][] dp) {

		if (idx1 == word1.length() || idx2 == word2.length()) {
			return Math.max(word1.length() - idx1, word2.length() - idx2);
		}

		if (word1.charAt(idx1) == word2.charAt(idx2)) {

			dp[idx1][idx2] = minDistanceTD(word1, idx1 + 1, word2, idx2 + 1, dp);
			return dp[idx1][idx2];
		} else {
			int spE = minDistanceTD(word1, idx1, word2, idx2 + 1, dp);
			int spD = minDistanceTD(word1, idx1 + 1, word2, idx2, dp);
			int spR = minDistanceTD(word1, idx1 + 1, word2, idx2 + 1, dp);
			dp[idx1][idx2] = Math.min(spE, Math.min(spD, spR)) + 1;
			return Math.min(spE, Math.min(spD, spR)) + 1;
		}
	}

	public int minDistanceBU(String word1, String word2) {
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];
		for (int idx1 = word1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = word2.length(); idx2 >= 0; idx2--) {
				if (idx1 == word1.length() || idx2 == word2.length()) {
					dp[idx1][idx2] = Math.max(word1.length() - idx1, word2.length() - idx2);
					continue;
				}
//				dp[idx1][idx2]
				if (word1.charAt(idx1) == word2.charAt(idx2)) {
					dp[idx1][idx2] = dp[idx1 + 1][idx2 + 1];

				} else {
					int spE = dp[idx1][idx2 + 1];
					int spD = dp[idx1 + 1][idx2];
					int spR = dp[idx1 + 1][idx2];
					dp[idx1][idx2] = Math.min(spE, Math.min(spD, spR)) + 1;
				}
			}
		}
		return dp[0][0];
	}
}