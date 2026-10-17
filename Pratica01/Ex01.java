import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args ) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        double num1 = sc.nextDouble() ;
        double num2 = sc.nextDouble() ;

        double soma = num1 + num2 ;

        System.out.printf("SOMA = %.2f%n", soma);

        sc.close();

    }

}