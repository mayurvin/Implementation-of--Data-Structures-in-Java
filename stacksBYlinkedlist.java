
public class stacksBYlinkedlist {
	private LLNode top;
	private int length;
	
	public stacksBYlinkedlist() {
		length = 0;
		top = null;
	}
	public void push(int data){
		LLNode temp = new LLNode(data);
		temp.setNext(top);
		top = temp;
		length++;
	}
	public int pop(){
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
}
