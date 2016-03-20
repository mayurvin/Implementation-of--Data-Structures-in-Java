
public class DoublyLinkedList {
	private DLLNode head;
	private DLLNode tail;
	
	private void insert(int data, int pos){
		DLLNode temp = head;
		for(int i=0; i<pos; i++){
			temp = temp.getNext();
		}
		DLLNode newNode = new DLLNode(data);
		newNode.next = temp.next;
		newNode.prev = temp;
		newNode.next.prev = newNode;
		temp.next = newNode;
	}
	public void remove(int pos){
		DLLNode temp = head;
		for(int i=0;i<pos;i++){
			temp = temp.getNext();
		}
		temp.getNext().setPrev(temp.getPrev());
		temp.getPrev().setNext(temp.getNext());
	}
}
