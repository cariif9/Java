package Methods;

public class MethodPractice {
    public static void main(String[] args) {

//        System.out.println("The sum is "+sum(4,5) +" Value return type");
//
//        System.out.println(FullName("Abdulaahi","Ahmed","Jimcaale"));

        sum();
        display("Computer science",15);
    }
    public static  int sum(int num1,int num2){

        return num1 + num2;
    }


    public  static  String FullName(String FirstName, String SurName,String LastName){

        return FirstName + " "+SurName+" "+LastName;

    }


    public  static void sum(){
//        System.out.println("Hello Every Body I am Method don't Have return type ");
//        System.out.println("Welcome to java void method");
    }


    public static void  display(String Message, int x){
        for (int i = 0; i < x; i++){
            System.out.println(Message);
        }
    }

}
