package linkedStack;

public class Main {
    public static void main(String[] args) {

//        LinkedStack<String> NewStack = new LinkedStack<>();

//        NewStack.Push("99");
//        NewStack.Push("66");
//        NewStack.Push("11");
//        NewStack.Push("00");
//        NewStack.Push("88");


//        System.out.println( " :"+ NewStack);
//        System.out.println("Stack Size  "+ NewStack.size());
//
//        System.out.println("is Empty :"+ NewStack.isEMPTY());
//
//        System.out.println("Our Top is "+ NewStack.peek());
//
//        int Element = Integer.parseInt(NewStack.pop());
//
//        System.out.println("Removed Item is: "+ Element);
//        NewStack.SearchElement("99");


            // Create a new stack of Strings with a capacity of 4
            ArrayStack<String> s1 = new ArrayStack<>(4);

            // Add elements to the stack
            s1.push("Ali");
            s1.push("Omar");
            s1.push("Hawa");
            s1.push("Gedi");
            s1.push("Gedi");
            s1.push("Gedi");
            s1.push("Gedi");
            s1.push("Halima"); // This will trigger the expandCapacity method since the stack is full

            // Remove the top element and display it
            System.out.println("Removed: " + s1.pop());

            // Display the size of the stack
            System.out.println("size: " + s1.size());

            // Check if the stack is empty
            System.out.println("isempty: " + s1.isEmpty());

            // Peek at the top element of the stack without removing it
            System.out.println("top element: " + s1.peek());

            // Display the elements of the stack
            System.out.println("stack elements : " );
            s1.display();
            System.out.println("stack capacity: " + s1.getLength());
            System.out.println("sifull:" + s1.isFull());




    }


    }
