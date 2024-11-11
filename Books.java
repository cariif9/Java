package semesester5;

import java.awt.print.Book;
import java.util.Scanner;

public class Books {

    Scanner input = new Scanner(System.in);
    String title,author,year_published;

   public Books(){

       title = "java";
       author = "ali";
       year_published=  "2005";

    }

    public  String Change(String title, String author, String Year_published){
        System.out.println("enter title:");
        title = input.nextLine();

        System.out.println("Enter Author");
        author = input.nextLine();
        System.out.println("enter Year_Published");
        year_published=  input.nextLine();

        return Change(title,author,year_published);
    }

    public  void Display(){
        System.out.println("the ttile books is:"+ title+" \n"+ "The Author is :"+ author+"\n" +
                " \n"+ "The year published is "+ year_published );

    }

}

