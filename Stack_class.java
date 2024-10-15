package stack;

public class Stack_class {
	private int stack[], MaxSize, tos,tos2;

	public void create_stack(int size) {
		tos = -1;
		stack = new int[size];
		MaxSize = size;
	}
	public void create_stack1(int size) {
		tos2 = size;
		stack = new int[size];
		MaxSize = -1;
	}

	void push(int e) {
		tos++;
		stack[tos] = e;
		System.out.println("Element " + e + " pushed");
	}
	void push1(int e) {
		tos2--;
		stack[tos2] = e;
		System.out.println("Element " + e + " pushed");
	}
	boolean isFull() {
		if(tos==MaxSize-1) 
			return true;
		else 
		  return false;
		
	}
	boolean isFull1() {
		if(tos2==-1) 
			return true;
		else 
		  return false;
		
	}
	int pop() {
		int temp =stack[tos];
		tos--;
		return (temp);
	}
	int pop1() {
		int temp =stack[tos2];
		tos2++;
		return (temp);
	}
	boolean isempty() {
		if(tos==-1) 
			return true;
		else 
		  return false;
		
	}
	boolean isempty1() {
		if(tos2==MaxSize-1) 
			return true;
		else 
		  return false;
		
	}
	int peek() {

		return (stack[tos]);
	}
	int peek1() {

		return (stack[tos2]);
	}

	void print_stack() {
		System.out.println("stack has");
		for (int i = tos; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}

	void print_stack1() {
		System.out.println("stack has");
		for (int i = tos2; i<MaxSize; i++) {
			System.out.println(stack[i]);
		}
	}
		
			
	

		}

