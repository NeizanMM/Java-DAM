//import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        double taula[];
        int comptador = 0;

        taula = new double[11];

        for (double element : taula) {
            double valorrandom = (double)(Math.random()*100 +1);
            taula[comptador] = valorrandom;
            System.out.println("Posicio [" + comptador + "]: " + taula[comptador]);
            comptador++;
        }
    }
}