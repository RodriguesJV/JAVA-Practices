import java.util.Scanner ;

public class Ex04 {
    public static void main ( String [] args) {

        Scanner sc = new Scanner ( System.in);

        int numFuncionario, numHoras;
        double horasV, salario ;

        numFuncionario = sc.nextInt ();
        numHoras = sc.nextInt ();
        horasV = sc.nextDouble ();

        salario = numHoras * horasV ;

        System.out.printf("NUMBER = %d%n", numFuncionario) ;
        System.out.printf("SALARY = U$ %.2f%n", salario) ;
        sc.close ();
        
    }
}