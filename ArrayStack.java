ID: C1221001

package linkedStack;

import java.util.Arrays;

public class ArrayStack<T> {
    // Constant for the default capacity of the stack
    private static final int DEFAULT_CAPACITY = 3;

    // Variable to track the top index of the stack (also indicates the number of elements)
    private int top;

    // Array to store the elements in the stack
    T[] stack;

    // Constructor that initializes the stack with a specified size
    public ArrayStack(int size) {
        top = 0; // Start with an empty stack
        stack = (T[]) new Object[size]; // Create an array of the specified size
    }

    // Default constructor that initializes the stack with the default capacity
    public ArrayStack() {
        this(DEFAULT_CAPACITY); // Use the default capacity if no size is specified
    }

    // Method to return the current size of the stack (number of elements in the stack)
    int size() {
        return top; // Return the index of the top, which equals the number of elements
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return top == 0; // Stack is empty if top is 0
    }

    // Method to add an element to the stack
    void push(T element) {
        // If the stack is full, expand the capacity
        //if (size() == stack.length)
        if (isFull())
            expandCapacity();

        // Add the new element to the top of the stack and increment the top
        stack[top] = element;
        top++;
    }

    // Helper method to double the capacity of the stack when it becomes full
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2); // Double the size of the stack
    }

    // Method to return the top element of the stack without removing it
    T peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!"); // Print a message if the stack is empty
            return null;
        }
        return stack[top - 1]; // Return the top element (without removing it)
    }

    // Method to remove and return the top element of the stack
    T pop()  {
        if (isEmpty()){
            System.out.println("Array stack is empty");
        }
        top--; // Decrease the top index
        T removedElement = stack[top]; // Store the removed element
        stack[top] = null; // Nullify the removed element
        return removedElement; // Return the removed element
    }

    // Override the toString method to provide a string representation of the stack
    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}'; // Return a string containing the top index and the elements of the stack
    }

    //sfull
    boolean isFull(){
        return top == stack.length;   //return size() == stack.length;
    }
    int getLength(){
        return stack.length;
    }

    //display
    void display(){
        if(isEmpty())
            System.out.println("the stack is empty!");
        else{
            for(int i = top-1 ; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    private Boolean Duplicate(ArrayStack<T> list , T element){

        for (int i = 0; i < list.size(); i++){
            if (list.stack[i].equals(element))
                return true;
        }

        return false;
    }

    public void merge(ArrayStack<T> list1 , ArrayStack<T> list2) {

        // how many elements are in the lists :
        int size = list1.size() + list2.size();

//      checking if stack is less than the size
        if (stack.length < size)
            stack = Arrays.copyOf(stack, size);

//      check if list 1 is in duplicates values

        for (int i = 0; i < list1.size(); i++) {
//          check if Duplicate is in the list 1
            if (!Duplicate(this, list1.stack[i]))
                this.push(list1.stack[i]);

        }

//        checking if list 2 is in duplicates values

        for (int i = 0; i < list2.size(); i++) {
//            check if duplicate is in the list 2
            if (!Duplicate(this, list2.stack[i]))
                this.push(list2.stack[i]);
        }



    }


    // Main method to test the ArrayStack class

}
