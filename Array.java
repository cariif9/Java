package Arrays;

public class Array {
    public static void main(String[] args) {


        double myList [];

        myList = new  double[5];

        myList[0] = 10.3;
        myList[1] = 09.8;
        myList[2] = 0.009;
        myList[3] = 000.8;




        int [] mylist = {1,3,5,6,};

        for (int i= 0; i<mylist.length; i++){
//            System.out.println(mylist[i]);
        }

//        System.out.println("\n");
//
//        for (int j : mylist) {
//            System.out.println(j);
//        }


     int [] sourceArray = {4,6,8,9};
     int [] target = new  int[sourceArray.length];

        for (int i =0; i < sourceArray.length; i++){

            target[i] = sourceArray[i];
            System.out.println(target[i]);
        }




    }
}
