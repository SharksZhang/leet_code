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

		LinkedList<String> queue = new LinkedList<>();
		queue.add(beginWord);
		visit.add(beginWord);
		int level = 0;
		while (!queue.isEmpty()){
			level ++;
			int curLevelCount = queue.size();
			for (int i = 0; i < curLevelCount; i++) {

				String curWord = queue.poll();
				if(curWord.equals(endWord)){
					return level;
				}
				List<String> nextWords = generateNextWords(curWord, set);
				for (String word : nextWords) {
					if(!visit.contains(word)){
						visit.add(word);
						queue.add(word);
					}
				}
			}
		}
		return 0;
	}

	private List<String> generateNextWords(String curWord, Set<String> set) {
		LinkedList<String> result = new LinkedList<>();
		char[] chars = curWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char temp = chars[i];
			for (char ch = 'a'; ch<= 'z'; ch++){
				chars[i] = ch;
				String newWord = new String(chars);
				if (set.contains(newWord)) {
					result.add(newWord);
				}
			}
			chars[i] = temp;
		}
		return result;
	}
}
