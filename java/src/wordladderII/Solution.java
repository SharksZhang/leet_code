package wordladderII;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


class Solution {

	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>(wordList);
		if (!set.contains(endWord)) {
			return new LinkedList<>();
		}
		return find(beginWord, endWord, set);

	}

	public List<List<String>> find(String beginWord, String endWord, Set<String> set) {
		List<List<String>> result = new LinkedList<>();
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(new Node(beginWord));
		boolean complete = false;
		while (!queue.isEmpty() && !complete) {
			int curLevelCount = queue.size();
			for (int i = 0; i < curLevelCount; i++) {
				Node curNode = queue.poll();
				List<String> nextWords = generateNextWords(curNode.word, set);

				for (String nextWord : nextWords) {
					Node nextNode = new Node(nextWord);
					if (set.contains(nextWord) &&!hasVisited(curNode, nextNode)) {
						if (nextWord.equals(endWord)) {
							result.add(generateResultList(curNode, nextWord));
							complete = true;
						}else{
							nextNode.parent = curNode;
							queue.add(nextNode);
						}
					}
				}
			}
		}
		return result;
	}

	private boolean hasVisited(Node parent, Node child) {
		while (parent != null){
			if(parent.word == child.word){
				return true;
			}
			parent = parent.parent;
		}
		return false;
	}

	private List<String> generateResultList(Node curWord, String nextWord) {
		List<String> result = new LinkedList<>();
		result.add(nextWord);
		while (curWord != null) {
			result.add(curWord.word);
			curWord = curWord.parent;
		}
		Collections.reverse(result);
		return result;
	}

	private List<String> generateNextWords(String curWord, Set<String> set) {
		LinkedList<String> result = new LinkedList<>();
		char[] chars = curWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char temp = chars[i];
			for (char ch = 'a'; ch <= 'z'; ch++) {
				chars[i] = ch;
				String newWord = new String(chars);
				if (!newWord.equals(curWord) &&set.contains(newWord)) {
					result.add(newWord);
				}
			}
			chars[i] = temp;
		}
		return result;
	}

	private class Node {
		Node parent;

		String word;

		public Node(String word) {
			this.word = word;
		}
	}
}
