package linkedStack;

import java.util.Arrays;

public class LinkedStack<T> {
    int count;
    Node<T> top;  //head / front
    private Object[] stack;

    LinkedStack() {
        count = 0;
        top = null;
    }

    //size
    int size() {
        return count;
    }

    //isempty
    boolean isEmpty() {
        return count == 0;  //top == null;
    }

    //push
    void push(T element) {
        Node<T> tempAddress = new Node<>(element);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        T removed = top.getElement();
        top = top.getNext();
        count--;
        return removed;
    }

    //peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }
    //print stack elements
    void display(){
        if(!isEmpty()){
            Node<T> currentAddress = top;
            while (currentAddress != null){
                System.out.println(currentAddress);
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
        else
            System.out.println("Empty!");
    }
    //search
//    boolean search(T data){
//        boolean found = false;
//        Node<T> current = top;
//        if(isEmpty()){
//            System.out.println("EMPTY!");
//        }
//        else {
//            while (current != null){
//                if(data.equals(current.getElement()))
//                    found = true;
//                current = current.getNext();
//            }
//        }
//        return found;
//    }



    private Boolean Duplicate(LinkedStack<T> list , T element){

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




}