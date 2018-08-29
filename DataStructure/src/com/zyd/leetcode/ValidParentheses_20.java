package com.zyd.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_20 {

	
	public static void main(String[] args) {
		String str = "((";
		System.out.println(isValid(str));
	}
	 public static boolean isValid(String s) {
	       HashMap<String, String> map = new HashMap<>();
	       //'(', ')', '{', '}', '[' and ']'
	       map.put(")", "(");
	       map.put("}", "{");
	       map.put("]", "[");
	       
	       if(s == null || s.length() <=0) {
	    	   return true;
	       }
	       if(s.length() % 2 != 0) {
	    	   return false;
	       }
	       
	       Stack<String> stack = new Stack<>();
	       for(int i = 0; i < s.length(); i++) {
	    	   String key = s.charAt(i) + "";
	    	   if(!map.containsKey(key)) {
	    		   stack.push(s.charAt(i)+"");
	    	   }else {
	    		   if(!stack.isEmpty()) {
	    			   String first = stack.pop();
	    			   String second = map.get(key);
	    			   if(!first.equals(second)) {
	    				   return false;
	    			   }
	    		   }else {
	    			   return false;
	    		   }
	    	   }
	    	   
	       }
	       
	       if(stack.isEmpty()) {
	    	   return true;
	       }else {
	    	   return false;
	       }
	     
	    }
	 
}
