import java.util.Scanner;

public class Ex05 {

    public static void main ( String [] args) {

        Scanner sc = new Scanner ( System.in);

        int peca1, peca2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, total ;

        peca1 = sc.nextInt ();
        numPeca1 = sc.nextInt ();
        valorPeca1 = sc.nextDouble ();
        peca2 = sc.nextInt ();
        numPeca2 = sc.nextInt ();
        valorPeca2 = sc.nextDouble ();

        total = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2) ;
        System.out.printf("TOTAL = R$ %.2f%n", total);
        sc.close();
    }
}