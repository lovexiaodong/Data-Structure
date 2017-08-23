package com.zyd.tree;

import com.zyd.entity.StructNode;

public class BinaryTree {

	//记住每一次遍历的上次的node
	private StructNode<String> pre = null;
	/**
	 * 中序二叉树的线索化
	 * @param node
	 */
	@SuppressWarnings("unused")
	public void initBinaryTree(StructNode<String> node) {
		if(node == null) {
			return;
		}
		initBinaryTree(node.leftNode);
		//当前的节点的左指针指向前驱
		if(node.leftNode == null) {
			node.lTag = 1;
			node.leftNode = pre;
		}
		//前驱指向后继。
		if(pre != null && pre.rigthNode == null) {
			pre.rTag = 1;
			pre.rigthNode = node;
		}
		pre = node;
		initBinaryTree(node.rigthNode);
	}
}
