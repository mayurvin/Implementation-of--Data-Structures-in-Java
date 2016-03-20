import java.util.ArrayList;
import java.util.Stack;

public class TreeBYLinkedList {
	public ArrayList<Integer> interatingTraversal(treeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		
		Stack<treeNode> treeStack = new Stack<treeNode>();
		treeStack.push(root);
		
		while(!treeStack.isEmpty()){
			treeNode tmp = treeStack.pop();
			result.add(tmp.data);
			
			if(tmp.right!=null){
				treeStack.push(tmp.right);
			}
			if(tmp.left!=null){
				treeStack.push(tmp.left);
			}
		}
		return result;
	}
	
	public ArrayList<Integer> recursiveTraversal(treeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(root!=null){
			if(root.left!=null){
				recursiveTraversal(root.left);
			}
			if(root.right!=null){
				recursiveTraversal(root.right);
			}
			result.add(root.data);
		}
		
		return result;
		
	}
}
