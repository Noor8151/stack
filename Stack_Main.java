package stack;

import java.util.Scanner;

public class Stack_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack_class obj = new Stack_class();
		Stack_class obj1 = new Stack_class();
		System.out.println("Enter the size of stack");
		int size=in.nextInt();
		obj.create_stack(size);
		obj1.create_stack1(size);
		
		System.out.println("Enter the choice");
		int choice,e;
		do {
			System.out.println("1.push1");
			System.out.println("2.pop1");
			System.out.println("3.peek1");
			System.out.println("4.print all the elements");
			System.out.println("5.push2");
			System.out.println("6.pop2");
			System.out.println("7.peek");
			System.out.println("8.print all the elements");
			System.out.println("0.Exit");
			System.out.println("choice");
			choice =in.nextInt();
			
			switch(choice) {
			case 1:
				if(obj.isFull()!=true) {
					System.out.println("enter a number");
					e=in.nextInt();
					obj.push(e);
				}
				else {
					System.out.println("Stack is full");
				}
				break;
			case 2:
				if(obj.isempty()!=true) {
					System.out.println("Stack element is poped"+obj.pop());
				}
				else
					System.out.println("Stack is empty");
				break;
			case 3:
				  if(obj.isempty()!=true)
                  {
                      System.out.println("Element peek is  "+obj.peek());
                  }
                  else {
                      System.out.println("Stack Empty");
                  }
                  break;
			case 4:
				 if(obj.isempty()!=true)
                 {
                     System.out.println("Elements in stack are\n");
                     obj.print_stack();
                 }
                 else {
                     System.out.println("Stack Empty");
                 }
				break;
			case 5:
				if(obj1.isFull1()!=true) {
					System.out.println("enter a number");
					e=in.nextInt();
					obj1.push1(e);
				}
				else {
					System.out.println("Stack is full");
				}
				break;
			case 6:
				if(obj1.isempty1()!=true) {
					System.out.println("Stack element is poped"+obj1.pop1());
				}
				else
					System.out.println("Stack is empty");
				break;
			case 7:
				  if(obj1.isempty1()!=true)
                {
                    System.out.println("Element peek is  "+obj1.peek1());
                }
                else {
                    System.out.println("Stack Empty");
                }
                break;
			case 8:
				 if(obj1.isempty()!=true)
                {
                    System.out.println("Elements in stack are\n");
                    obj1.print_stack1();
                }
                else {
                    System.out.println("Stack Empty");
                }
				break;
			case 0:
				System.out.println("Thanks for  visting");
				break;
			default :
				System.out.println("wrong chioce");
				System.exit(0);
				break;
			}
			
		}while(choice!=0);

	}

}
