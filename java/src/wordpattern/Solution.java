package wordpattern;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public boolean wordPattern(String pattern, String str) {
		Map<Character, String> map = new HashMap<>();
		char[] chars = pattern.toCharArray();
		String[] split = str.split(" ");

		if(split.length != chars.length){
			return  false;
		}

		for (int i = 0; i < chars.length; i++) {
			String currentVal = split[i];
			char currentChar = chars[i];
			if(map.containsKey(currentChar) && !map.get(currentChar).equals(currentVal)){
				return false;
			}
			else if(!map.containsKey(currentChar) && map.containsValue(currentVal)){
				return false;
			}else {
				map.put(currentChar, currentVal);
			}
		}
		return true;
	}
}