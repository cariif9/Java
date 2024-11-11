package Activity;

import java.util.Arrays;

public class ArraYStack<T> {
    private  final  static  int Defualt_Capasity = 2;
    private  int Top;
    private  T []   stack;
    //int size = 0;
    public  ArraYStack(){
        this (Defualt_Capasity);
    }
    public  ArraYStack (int initalCapasity){
        Top = 0;
        stack = (T[]) (new  Object[initalCapasity]);
    }

    public  T  push(T Element){

        if (size()== stack.length){
            ExapandCapasity();
            stack[Top] = Element;
            Top++;

  }
    return Element;

    }
    private  void ExapandCapasity(){
        stack = Arrays.copyOf(stack, stack.length*5);

    }

    int size() {
        return Top; // Return the index of the top, which equals the number of elements
    }

    public  boolean isEmpty(){

        return  Top ==0;
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("The Array Stack is empty");}
        Top--;
        T Result = stack[Top];
        return Result;
    }

    public  T peek(){
        if (isEmpty()){
            System.out.println("The ArrayStack is Empty!");
            return  stack[Top-1];
        }
        return null;
    }


    public static void main(String[] args) {
        ArraYStack<String> NeArray = new ArraYStack<>();
        ArraYStack<Integer> MyList2 = new ArraYStack<>();
        ArraYStack<Integer> MyList3 = new ArraYStack<>();


//        System.out.println(NeArray.push("Xasan"));
//        System.out.println(NeArray.push("Cali"));
//        System.out.println(NeArray.push("Aisha"));
//        System.out.println("Top :"+NeArray.Top);
//        System.out.println("Size: "+ NeArray.Size);


        NeArray.push("100");
        NeArray.push("200");
        NeArray.push("100");
        MyList2.push(400);
        MyList2.push(900);
        MyList2.push(1000);

        MyList3.push(800);
        MyList3.push(320);
        MyList3.push(3400);
        MyList3.push(800);
        MyList3.push(900);

        System.out.println("Size: "+MyList2.isEmpty());


    }



}

