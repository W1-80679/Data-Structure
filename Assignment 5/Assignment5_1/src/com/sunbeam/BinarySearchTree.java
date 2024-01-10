package com.sunbeam;

	class TreeNode 
	{
	    int key;
	    TreeNode left, right;

	    public TreeNode(int item) 
	    
	    {
	        key = item;
	        left = right = null;
	    }
	}

	public class BinarySearchTree 
	{
	    private TreeNode root;

	    public BinarySearchTree() 
	    {
	        root = null;
	    }

	    // Recursive function to insert a key into the BST
	    private TreeNode insertRecursive(TreeNode root, int key) 
	    
	    {
	        // If the tree is empty, create a new node and return it
	        if (root == null) {
	            return new TreeNode(key);
	        }

	        // Otherwise, recur down the tree
	        if (key < root.key) {
	            root.left = insertRecursive(root.left, key);
	        }
	        
	        else if (key > root.key) 
	        
	        {
	            root.right = insertRecursive(root.right, key);
	        }

	        // Return the unchanged node pointer
	        return root;
	    
	    }

	    
	    public void insert(int key) {
	    
	    	root = insertRecursive(root, key);
	    
	    }

	   
	    private void inOrderTraversal(TreeNode root) 
	    {
	        if (root != null) 
	        {
	            // Traverse the left subtree
	            inOrderTraversal(root.left);

	            // Process the current node
	            System.out.print(root.key + " ");

	            // Traverse the right subtree
	            inOrderTraversal(root.right);
	        }
	    }

	    
	    public void inOrderTraversal() 
	    {
	        inOrderTraversal(root);
	    
	        System.out.println();
	    }

	   
	    private TreeNode searchRecursive(TreeNode root, int key) 
	    
	    {
	        // Base Cases: root is null or key is present at root
	        if (root == null || root.key == key) 
	        {
	        
	        	return root;
	        
	        }

	       
	        if (key > root.key) {
	            return searchRecursive(root.right, key);
	       
	        }

	        // Key is smaller than root's key, search in the left subtree
	        return searchRecursive(root.left, key);
	    }

	    
	    public TreeNode search(int key) 
	   
	    {
	    
	    	return searchRecursive(root, key);
	    
	    }

	   
	    
	    private TreeNode findMin(TreeNode root) 
	    {
	        while (root.left != null) 
	        {
	            root = root.left;
	        }
	        return root;
	    }

	  
	    public int findMin() 
	    {
	        if (root == null) 
	        {
	            throw new IllegalStateException("BST is empty");
	        
	        }
	        
	        TreeNode minNode = findMin(root);
	        
	        return minNode.key;
	    }

	    private TreeNode findMax(TreeNode root) 
	    
	    {
	        while (root.right != null) 
	        
	        {
	            root = root.right;
	        
	        }
	        
	        return root;
	    }
	    

	    	    public int findMax() 
	    	    
	    	    {
	        
	    	    	if (root == null) 
	    	    	{
	            
	    	    		throw new IllegalStateException("BST is empty");
	        }
	    	    	
	        TreeNode maxNode = findMax(root);
	        
	        return maxNode.key;
	    }
	    	    

	    public static void main(String[] args) 
	    
	    {
	        BinarySearchTree bst = new BinarySearchTree();

	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(70);
	        bst.insert(60);
	        bst.insert(80);

	     
	        System.out.print("In-order traversal: ");
	        bst.inOrderTraversal();

	       
	        int searchKey = 60;
	        TreeNode searchResult = bst.search(searchKey);
	       
	        if (searchResult != null) 
	        {
	        
	        	System.out.println("Node with key " + searchKey + " found in the BST.");
	        
	        } 
	        
	        else 
	        
	        {
	           
	        	System.out.println("Node with key " + searchKey + " not found in the BST.");
	        
	        }

	      
	        System.out.println("Minimum value in the BST: " + bst.findMin());
	        System.out.println("Maximum value in the BST: " + bst.findMax());
	    
	    }
	
	}
	
	
