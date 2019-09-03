package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N_17LetterCombinationsofaPhoneNumber {


    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static  List<String> letterCombinations(String digits) {

        Map<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        List<String> result = new ArrayList<>();

        if(null == digits || digits.isEmpty()){
            return result;
        }
        combinations(map, digits, 0, result, new ArrayList<String>());
        return result;
    }

    public static void combinations( Map<String,String> map, String digits, int start,
                             List<String> result, List<String> tempRes){
        if(start >= digits.length()){
            return;
        }
        String str = map.get(digits.charAt(start)+"");
        for (int j = 0; j <str.length();j++){
            String c = str.charAt(j)+"";
            tempRes.add(c);
            if(tempRes.size() == digits.length()){
                StringBuilder sb = new StringBuilder();
                for (String s : tempRes){
                    sb.append(s);
                }
                result.add(sb.toString());
                tempRes.remove(tempRes.size()-1);
            }else {
                combinations(map, digits, start+1, result, tempRes);
            }
        }

        if(!tempRes.isEmpty()){
            tempRes.remove(tempRes.size()-1);
        }
    }
}
