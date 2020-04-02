package wordladder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution1 {
	int result = Integer.MAX_VALUE;

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>(wordList);
		HashSet<String> tmpSet = new HashSet<>();
		tmpSet.add(beginWord);
		find(beginWord, endWord, set, tmpSet);
		return result == Integer.MAX_VALUE ? 0 : result ;

	}

	public void find(String currentWord, String endWord, Set<String> set, HashSet<String> tmpSet) {
		if (currentWord.equals(endWord)) {
			result = Math.min(result, tmpSet.size());
//			System.out.println("result = " + result);
		}
		Set<String> nextWords = generateNextWords(currentWord, set);
		for (String nextWord : nextWords) {
			if (set.contains(nextWord) && !tmpSet.contains(nextWord)) {
//				System.out.print("currentWord = " + currentWord +" ");
//				System.out.println("nextWord = " + nextWord);
				tmpSet.add(nextWord);
				find(nextWord, endWord, set, tmpSet);
				tmpSet.remove(nextWord);
			}
		}
	}

	private Set<String> generateNextWords(String curWord, Set<String> set) {
		Set<String> result = new HashSet<>();
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) != curWord.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				result.add(word);
			}
		}
		return result;
	}
}
