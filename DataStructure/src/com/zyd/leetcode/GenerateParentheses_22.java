package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	
	public static void main(String[] args) {
		
		GenerateParentheses_22 ge = new GenerateParentheses_22();
		List<String> list = ge.generateParenthesis(3);
		for(String str : list) {
			System.out.println(str);
		}
	}
	 public  List<String> generateParenthesis(int n) {
	       List<String> result = new ArrayList<>();
	       String str = "";
	       generate(result, str, n, n);
	       return result;
	    }
	 
	 public  void generate(List<String> result, String str, int left, int right) {
		 
		 if(left == 0 && right == 0) {
			result.add(str);
			return ;
		 }
		 
		 if(left >= 0) {
			 generate(result, str+"(", left-1, right);
		 }
		 if(right >= 0 && left < right) {
			 generate(result, str+")", left, right-1);
		 }
	 }
}
