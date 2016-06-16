package com.interview.testq;

import java.util.LinkedList;
import java.util.Queue;

public class ClosestTreeNode {

	public static void levelOrderQueue(Node root, int no) {
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		int diff = Math.abs(no-root.data);
		Node closest = root;
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			System.out.print(" " + n.data);
			if(diff> Math.abs(no-n.data)){
				diff=Math.abs(no-n.data);
				closest=n;
			}
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
		System.out.println("\nClosest Node is --- " + closest.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		System.out.println("Breadth First Search : ");
		levelOrderQueue(root, 17);
		
	}
}

