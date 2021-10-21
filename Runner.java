
public class Runner {

	public static void main(String[] args) {
		System.out.println("welcome to stack queue");
		StackQueue sQ = new StackQueue();
		sQ.push(70);
		sQ.push(30);
		sQ.push(56);
		sQ.peek();
		System.out.println("before popping");
		sQ.display();

		sQ.popTillEnd();
		System.out.println();
		System.out.println("after popping");
		sQ.display();

	}

}
