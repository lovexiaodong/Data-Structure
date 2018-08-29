package com.zyd.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Letter_Combinations_17 {
	
	public static void main(String[] args) {
		List<String> list = letterCombinations("234");
		System.out.println(list.toString());
	}

	public static List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		
		for(int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length() == i) {
				String temp = ans.removeFirst();
				for(char s : mapping[x].toCharArray()){
					ans.addLast(temp + s);
				}
			}
		}
		
		return ans;
	}
}
