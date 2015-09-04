import StdLib.StdIn;
import StdLib.StdOut;
import StdLib.StdRandom;

public class node {
	private Node root;             // root of BST

    private class Node {
        private int val;         // associated data
        private Node left, right;  // left and right subtrees
        private int N;             // number of nodes in subtree

        public Node(int val, int N) {
            this.val = val;
            this.N = N;
        }
    }
    
    // TODO: Add the value to the BST. 
    public void add(int value){
    	
    }
     
    // TODO: Get the minimum value of the BST
    public int getMin(){
    	
    	return 0;
    }
    
    // TODO: Remove the medium from BST
    public boolean remMin(){
    	
    	return true;
    }
    
	public static void main(String [] args){
		
	}
}
