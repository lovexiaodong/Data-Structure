package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class n_94BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();

        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()){
            while (temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            TreeNode pop = stack.pop();
            list.add(pop.val);
            temp = pop.right;
        }

        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}



