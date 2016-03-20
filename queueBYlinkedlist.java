
public class queueBYlinkedlist {
	private int length;
	private LLNode front, rear;
	
	queueBYlinkedlist(){
		length = 0;
		front = null;
		rear = null;
	}
	
	private void enqueue(int data){
		LLNode newNode = new LLNode(data);
		
		rear.setNext(newNode);
		length++;
	}
	private int dequeue(){
		int result = front.getData();
		front = front.getNext();
		length--;
		return result;
	}
}
