package com.zyd.tree;

import com.zyd.entity.StructNode;

public class BinaryTree {

	//��סÿһ�α������ϴε�node
	private StructNode<String> pre = null;
	/**
	 * �����������������
	 * @param node
	 */
	@SuppressWarnings("unused")
	public void initBinaryTree(StructNode<String> node) {
		if(node == null) {
			return;
		}
		initBinaryTree(node.leftNode);
		//��ǰ�Ľڵ����ָ��ָ��ǰ��
		if(node.leftNode == null) {
			node.lTag = 1;
			node.leftNode = pre;
		}
		//ǰ��ָ���̡�
		if(pre != null && pre.rigthNode == null) {
			pre.rTag = 1;
			pre.rigthNode = node;
		}
		pre = node;
		initBinaryTree(node.rigthNode);
	}
}
