package linkedStack;

public class Node<T> {

    T  element;
    Node<T> Next;
    Node(){
        element = null;
        Next = null;
    }

    public Node(T element) {

        this.element = element;
        Next =null;


    }

    public T getElement() {
        return element;
    }

    public void setElement(T Element) {
        element = Element;
    }

    public Node<T> getNext() {
        return Next;
    }

    public void setNext(Node<T> next) {
        Next = next;
    }
}
