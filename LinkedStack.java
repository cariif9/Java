package linkedStack;

public class LinkedStack<T> {
    int Count;
    Node<T> Top;

    LinkedStack(){
        Count =0;
        Top = null;
    }
    void Push(T Elemnt){

        Node<T>Temp = new Node<>(Elemnt);
        Temp.setNext(Top);
        Top = Temp;
        Count ++;
    }

    public int size (){
        return  Count;
    }
    public  boolean isEMPTY(){
        return  Count == 0;
    }

    public  T peek(){
        if (isEMPTY())
            System.out.println("The Stack is Empty! ");
        return Top.element;
    }
    public  T pop (){
        if (isEMPTY())
            System.out.println("The Stack is Empty!");
        T Result = Top.element;
        Top = Top.getNext();
        Count --;
        return  Result;
    }

   public void PrintStack(){
        if (isEMPTY()){
            System.out.println("The Stack Is Empty: ");
        }
        Node<T> Current = Top;


        while (Current != null){

            System.out.println(Current.getElement());
            Current = Current.getNext();
        }
    }

    boolean SearchElement (T Data){
        Node<T> curentt = Top;
        boolean Founded = false;

        while (curentt != null){
            if (Data.equals(curentt.getElement())) {
                Founded = true;
                System.out.println("Found it");

            }

            curentt = curentt.getNext();

        }

        return  Founded;
    }



}
