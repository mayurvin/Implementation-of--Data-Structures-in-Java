
public class treeNode {
	public int data;
	public treeNode left, right;
	
	treeNode(int data){
		this.data = data;
		left = null;
		right = null; 
	}
	public int getData(){
		return this.data;
	}
	public void setLeft(treeNode node){
		this.left = node;
	}
	public treeNode getLeft(){
		return this.left;
	}
	public void setRight(treeNode node){
		this.right = node;
	}
	public treeNode getRight(){
		return this.right;
	}
}
