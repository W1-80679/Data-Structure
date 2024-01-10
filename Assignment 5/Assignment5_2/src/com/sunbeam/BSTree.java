package com.sunbeam;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTree {
    private TreeNode root;

    public BSTree() {
        root = null;
    }

    // Recursive function to insert a key into the BST
    private TreeNode insertRecursive(TreeNode root, int key) {
        // If the tree is empty, create a new node and return it
        if (root == null) {
            return new TreeNode(key);
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Public method to insert a key into the BST
    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    // Recursive function to search for a key in the BST
    private TreeNode searchRecursive(TreeNode root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key) {
            return root;
        }

        // Key is greater than root's key, search in the right subtree
        if (key > root.key) {
            return searchRecursive(root.right, key);
        }

        // Key is smaller than root's key, search in the left subtree
        return searchRecursive(root.left, key);
    }

    // Public method to search for a key in the BST
    public TreeNode search(int key) {
        return searchRecursive(root, key);
    }

    // Other methods for BST operations can be added here

    public static void main(String[] args) {
    	BSTree bst = new BSTree();

        // Insert nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Search for a key
        int searchKey = 60;
        TreeNode searchResult = bst.search(searchKey);

        if (searchResult != null) {
            System.out.println("Node with key " + searchKey + " found in the BST.");
        } else {
            System.out.println("Node with key " + searchKey + " not found in the BST.");
        }
    }
}