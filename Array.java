package Activity;

import java.util.Stack;

public class Array {



        public static void main(String[] args) {


            Stack<String>List1 = new Stack<>();
            Stack<String>List2 = new Stack<>();
            Stack<String>List3 = new Stack<>();


            List1.push("100");
            List1.push("200");
            List1.push("100");
            List2.push("400");
            List2.push("500");
            List2.push("100");

            Merge(List1.push("100"),List2.push("200"));
            Merge(List1.push("200"), List2.push("900"));
            Merge(List1.push("200"),List2.push("300"));
            Merge(List1.push("900"),List2.push("10"));

//            List3.Merge(List1,List2);
            

        }

        public static String Merge(String List1, String List2){
            if ( List1  != List2){
                System.out.println();

            }
            return List1;
        }

    }

