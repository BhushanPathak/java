package com.interview.testq;

public class DiameterBinaryTree {
	Node root;
	 
    /* Method to calculate the diameter and return it to main */
    int diameter(Node root)
    {
        /* base case if tree is empty */
        if (root == null)
            return 0;
 
        /* get the height of left and right sub trees */
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        /* get the diameter of left and right subtrees */
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
 
        /* Return max of following three
          1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight + rheight + 1,
                        Math.max(ldiameter, rdiameter));
 
    }
    
    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
     	   //System.out.println(node.data);
             
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }
 
    /* A wrapper over diameter(Node root) */
    int diameter()
    {
        return diameter(root);
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* creating a binary tree and entering the nodes */
        DiameterBinaryTree tree = new DiameterBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameter());

	}

}
