class Stack {
	private int arr[];
	private int top;
	private int capacity;
	//constructor to initialize the Stack
	Stack(int Size) {
		arr=new int [Size];
		capacity=Size;
		top= -1;
	}
	//method to add an element to the Stack
	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		System.out.println("Inserting" + x);
		arr[++top] = x;
	}
	//method to remove an element from the Stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			return -1;
		}
		return arr [top--];
	}
	//method to return the size of the Stack
	public int getSize() {
		return top + 1;
	}
	//method to check if the Stack is empty
	public Boolean isEmpty() {
		return top == -1;
	}
	//method to check if the Stack is full
	public Boolean isFull() {
		return top == capacity -1;
	}
	//method to display the element of Stack
	public void printStack() {
		for(int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Stack stack=new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.print("Stack:");
		stack.printStack();

		//remove element from Stack
		stack.pop();
		System.out.println("\n After popping out");
		stack.printStack();
	}
}












