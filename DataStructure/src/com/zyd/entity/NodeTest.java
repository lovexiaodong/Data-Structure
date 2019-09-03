package com.zyd.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodeTest {

	public static void main(String[] args) {

		StructNode<Integer> node = new StructNode<>();
		node.data  = 1;

		StructNode<Integer> node2 = new StructNode<>();
		node2.data  = 2;
		StructNode<Integer> node3 = new StructNode<>();
		node3.data  = 3;
		node.leftNode = node2;
		node.rigthNode = node3;

		StructNode<Integer> node4 = new StructNode<>();
		node4.data  = 4;
		StructNode<Integer> node5 = new StructNode<>();
		node5.data  = 5;
		node2.leftNode = node4;
		node2.rigthNode = node5;

		StructNode<Integer> node6 = new StructNode<>();
		node6.data  = 6;
		StructNode<Integer> node7 = new StructNode<>();
		node7.data  = 7;
		node3.leftNode = node6;
		node3.rigthNode = node7;

//		wideVisit(node);

		preVisit(node);

	}


	public static void preVisit(StructNode node){
		if(node == null){
			return;
		}
		print(node);
		preVisit(node.leftNode);
		preVisit(node.rigthNode);
	}

	public static void centerVisit(StructNode node){
		if(node == null){
			return;
		}
		preVisit(node.leftNode);
		print(node);
		preVisit(node.rigthNode);
	}



	public static void postVisit(StructNode node){
		if(node == null){
			return;
		}
		preVisit(node.leftNode);
		preVisit(node.rigthNode);
		print(node);
	}


	public static void wideVisit(StructNode node){

		LinkedList<StructNode> list = new LinkedList<>();
		if(node ==  null){
			return;
		}
		list.add(node);
		while (list.size() > 0){
			StructNode last = list.removeLast();
			print(last);
			if(last.leftNode != null){
				list.offerFirst(last.leftNode);
			}

			if(last.rigthNode  != null){
				list.offerFirst(last.rigthNode);
			}

		}
	}


	public static void print(StructNode node){
		System.out.println(node.data);
	}
}
