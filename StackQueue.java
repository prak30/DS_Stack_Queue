
public class StackQueue {
	Node head;
	Node tail;
	Node top;

	public void queue(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
			top = head;
		} else {
			Node tempNode = tail;
			this.tail = newnode;
			tempNode.next = tail;
		}
	}
	
	 public void deQueue() {
	        Node temp =top;
	        while (temp != null){
	            Node tempNode = this.head;
	            this.head = tempNode.next;
	            temp=temp.next;
	        }
	 }

	public void display() {
		if (head == null) {
			System.out.println("Stack list is Empty");
			return;
		} else {
			System.out.print("The stack elements are ");
			Node tempNode = head;
			while (tempNode != null) {
				if (tempNode.next != null) {
					System.out.print(tempNode.data + " -> ");
					tempNode = tempNode.next;
				} else {
					System.out.print(tempNode.data);
					tempNode = tempNode.next;
				}
			}
		}

	}

}