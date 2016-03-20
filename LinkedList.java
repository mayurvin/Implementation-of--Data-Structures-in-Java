
public class LinkedList {
	LLNode headNode;
	private int length=0;
	public LLNode getHead(){
		return this.headNode;
	}
	public void insertAtHead(LLNode node){
		node.setNext(headNode);
		headNode = node;
		length++;
	}
	// Insert at K
	public void insert(int data, int pos){
		if(headNode == null){
			headNode = new LLNode(data);
		}
		else {
			LLNode temp = headNode;
			for(int i=1;i<pos;i++){
				temp = temp.getNext();
			}
			LLNode newNode = new LLNode(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
		}
		length++;
			
	}
	public void remove(int pos){
		if(headNode == null){
			return ;
		}
		else {
			LLNode temp = headNode;
			for(int i=1;i<pos;i++){
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}
}
