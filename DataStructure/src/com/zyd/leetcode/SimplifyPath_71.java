package com.zyd.leetcode;

import java.util.Iterator;
import java.util.Stack;

public class SimplifyPath_71 {

    public static void main(String[] args) {

        System.out.println( simplifyPath("/a/../../b/../c//.//"));
    }

    public static String simplifyPath(String path) {

        if(path == null || path.isEmpty()){
            return "/";
        }
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        int length = split.length;
        for(int i =0; i < length; i++){
            String str = split[i];
            if("".equals(str) || ".".equals(str)){
                continue;
            }else if("..".equals(str)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
        }

        if(stack.isEmpty()){
            return "/";
        }

        Iterator<String> iterator = stack.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()){
            String rest = iterator.next();
            sb.append("/").append(rest);
        }

        return sb.toString();
    }
}
