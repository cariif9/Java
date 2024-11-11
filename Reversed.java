package semesester5.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Reversed {
    public String Reverse(String Input) {
        Stack<String> MyStack = new Stack<>();

        for (int i = 0; i < Input.length(); i++)

            MyStack.push(String.valueOf(Input.charAt(i)));

        String Revers = "";
        while (!MyStack.isEmpty())
            Revers += MyStack.pop();


        return Revers;
    }



    public String StrinBuffer(String input) {
        Stack<Character> Nstack = new Stack<>();
        for (char i : input.toCharArray()) {
            Nstack.push(i);
        }
        StringBuffer Gadis = new StringBuffer();
        while (! Nstack.isEmpty()){
            Gadis.append(Nstack.pop());

        }
        return  Gadis.toString();
    }

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        System.out.println("Enter String Reversed");

        String input = MyInput.nextLine();

        Reversed Test = new Reversed();

        String Result = Test.Reverse(input);

        System.out.println("Reversed String: " + Result);

    }
}