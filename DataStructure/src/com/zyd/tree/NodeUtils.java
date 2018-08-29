package com.zyd.tree;

public class NodeUtils {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Node rotationLeft(Node p) {
		Node x = p.right;
		p.right = x.left;
		x.left = p;
		x.color = p.color;
		p.color = true;
		return x;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Node rotationRight(Node p) {
		Node x = p.left;
		p.left = x.right;
		x.right = p;
		x.color = p.color;
		p.color = true;
		return x;
	}
}
