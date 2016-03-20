
public class LLNode {
	public int data;
	public LLNode next;
	
	LLNode(int data){
		this.data = data;
	}
	public void setNext(LLNode next){
		this.next = next;
		
	}
	public LLNode getNext(){
		return this.next;
	}
	public void setData(int Data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
}
