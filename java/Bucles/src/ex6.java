import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edat;
        int suma = 0;
        double mitja;

        for (int comptador = 1; comptador >=0; comptador++) {
            System.out.println("Indica la edat dels alumnes: ");
            edat = sc.nextInt();
            if (edat >= 0) {
                suma += edat;
            } else {
                mitja = (double) (suma /comptador);
                System.out.println("Has introduit: " + comptador + " edats");
                System.out.println("El total de edat es: " + suma);
                System.out.println("la mitja de edat es: " + mitja);
                break;
            }
        }
    }
}