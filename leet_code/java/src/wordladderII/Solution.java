package wordladderII;

import java.util.Collections;
import java.util.HashMap;
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
		LinkedList<Node> queue = new LinkedList<>();
		int level =0;
		HashMap<String, Integer> visited = new HashMap<>();
		visited.put(beginWord, 1);
		HashMap<String, Node> wordNodeMap=new HashMap<>();
		queue.add(new Node(beginWord));
		boolean found = false;
		while (!queue.isEmpty() && !found) {
			int curLevelCount = queue.size();
			level++;
			for (int i = 0; i < curLevelCount; i++) {
				Node curNode = queue.poll();
				List<String> nextWords = generateNextWords(curNode.word, set);

				for (String nextWord : nextWords) {
					Node nextNode = null ;

					if (wordNodeMap.containsKey(nextWord)) {
						nextNode = wordNodeMap.get(nextWord);
					}else if (set.contains(nextWord)){
						nextNode = new Node(nextWord);
						wordNodeMap.put(nextWord, nextNode);
					}
					if (set.contains(nextWord) && (!visited.containsKey(nextWord) || level <visited.get(nextWord))) {
						if (nextWord.equals(endWord)) {
							found = true;
						}else{
							queue.add(nextNode);
							visited.put(nextWord, level + 1);
						}
							nextNode.parents.add(curNode);
					}
				}
			}
		}
		List<List<String>> result = new LinkedList<>();
		generateResultList(wordNodeMap.get(endWord), result, beginWord, new LinkedList<>());
		return result;
	}


	private void generateResultList(Node curNode, List<List<String>> result, String beginWord, LinkedList<String> tmpResult) {
		if(curNode.word.equals(beginWord)){
			LinkedList<String> list = new LinkedList<>(tmpResult);
			Collections.reverse(list);
			result.add(list);
			return;
		}
		tmpResult.add(curNode.word);
		for (Node parent : curNode.parents) {
			generateResultList(parent, result, beginWord, tmpResult);
		}
		tmpResult.pop();
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
		LinkedList<Node> parents = new LinkedList<>();
		String word;

		public Node(String word) {
			this.word = word;
		}
	}
}
