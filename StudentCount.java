package Activity;

import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Number of Student: ");
        int i = Input.nextInt();

             StudentCount MyStudy[] = new  StudentCount[i];



                System.out.println("Enter Each Student Marks");
                double  Marks = Input.nextInt();
             for (int ind = 0; ind<MyStudy.length; ind++){
                 System.out.println(Marks);
             }





    }
}
