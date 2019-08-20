package wordladder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


class Solution {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>(wordList);
		if (!set.contains(endWord)) {
			return 0;
		}
		HashSet<String> visit = new HashSet<>();
		visit.add(beginWord);
		return find(beginWord, endWord, set, visit);

	}

	public int find(String beginWord, String endWord, Set<String> set, HashSet<String> visit) {

		LinkedList<Pair> queue = new LinkedList<>();
		Pair beginPair = new Pair(beginWord, 1);
		queue.add(beginPair);
		visit.add(beginWord);

		while (!queue.isEmpty()){
			Pair pair = queue.poll();
			if(pair.word.equals(endWord)){
				return pair.level;
			}
			Set<String> nextWords = generateNextWords(pair.word, set);
			for (String word : nextWords) {
				if(!visit.contains(word)){
					visit.add(word);
					queue.add(new Pair(word, pair.level + 1));
				}
			}
		}
		return 0;

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
	private class Pair {
		String word;
		int level;

		public Pair(String word, int level) {
			this.word = word;
			this.level = level;
		}
	}
}
