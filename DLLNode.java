
public class DLLNode {
	public int data;
	DLLNode prev;
	DLLNode next;
	DLLNode(int data){
		this.data = data;
	}
	DLLNode(int data, DLLNode prev, DLLNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	public void setData(int data){
		this.data = data;
	}
	@SuppressWarnings("unused")
	public int getData(){
		return this.data;
	}
	@SuppressWarnings("unused")
	public void setNext(DLLNode next){
		this.next = next;
	}
	@SuppressWarnings("unused")
	public DLLNode getNext(){
		return this.next;
	}
	public void setPrev(DLLNode prev){
		this.prev = prev;
	}
	@SuppressWarnings("unused")
	public DLLNode getPrev(){
		return this.prev;
	}
}
