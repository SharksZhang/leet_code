package repeateddnasequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
		if(s.length()<= 10){
			return new ArrayList<>();
		}
		ArrayList<String> result = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap();
		for (int i = 10; i <= s.length(); i++) {
			String substring = s.substring(i - 10, i );
			if (map.containsKey(substring)) {
				if(map.get(substring) == 1){
					result.add(substring);
					map.put(substring, 2);
				}
			}else {
				map.put(substring, 1);
			}
		}
		return result;
	}
}
