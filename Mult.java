package MultiplicationTest;

public class Mult {
    public static void main(String[] args) {
        System.out.println("                                     Multiplication Table");

        System.out.println("                ");

        for (int j=1; j<9; j++){
            System.out.println("          "+j);

            System.out.println("\n                                 ");

            for (int i=1; i<9; i++){
                System.out.println(i+" | ");
                for (int k=1; k<9; k++){
                    System.out.printf("%4d",i*k);
                }
                System.out.println();
            }
    }

    }
}
