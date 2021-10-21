
public class Runner {

	public static void main(String[] args) {
		System.out.println("welcome to stack queue");
		StackQueue sQ = new StackQueue();
		sQ.queue(56);
		sQ.queue(30);
		sQ.queue(70);
		System.out.println("before dequque");
		sQ.display();
		System.out.println();
		System.out.println("after dequeue");
		sQ.deQueue();
		sQ.display();

	}

}
