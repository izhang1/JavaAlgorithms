import javax.print.attribute.IntegerSyntax;

// Basic node class, this can now be my linked list, BST, or whatever I want to implement from 
// here on out.
class node{
	node left;
	node right;
	int data;
	
	public node(int data){
			this.left = null;
			this.right = null;
			this.data = data;
	}
	
	private void setRight(node n){
		this.right = n;
	}
	
	private void setLeft(node n){
		this.left = n;
	}
	
	private node getRight(node n){
		return this.right;
	}
	
	private node getLeft(node n){
		return this.left;
	}
	
	private boolean setData(int data){
		this.data = data;
		return true;
	}
	
	private int getData(int data){
		return this.data;
	}
}

public class testNode{
	
	public static void main(){
		node n = new node(12);
		n.left = new node(13);
		
	}
}
