package Activity;


import java.util.Stack;

public class Pair<T, U> {
    T First;
    U second;

    public Pair(T First,U Second){
        this.First= First;
        this.second = Second;
    }

    public T getFirst(){
        return First;
    }
    public U Getecond(){
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "First=" + First +
                ", second=" + second +
                '}';

    }

    public static void main(String[] args) {
        Pair<String, Integer> NewPair = new Pair<>("One", 1);

        System.out.println(NewPair.getFirst());
        System.out.println(NewPair.Getecond());
        System.out.println(NewPair);
    }
}
