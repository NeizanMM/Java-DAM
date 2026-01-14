import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xifres;
        int modul = 5;

        System.out.println("Introdueix un numero de 4 xifres: ");
        xifres = sc.nextInt();

        if (xifres < 1000 || xifres > 9999) {
            System.out.println("dada incorrecta. Has de introduir un numero de 4 xifres");
            System.out.println("Has sortit del programa");
        } else {
            int resultat = (xifres % modul);

            if (resultat == 4) {
                System.out.println("El digit final es " + xifres + "E");
            } else if (resultat == 3) {
                System.out.println("El digit final es " + xifres + "D");
            } else if (resultat == 2) {
                System.out.println("El digit final es " + xifres + "C");
            } else if (resultat == 1) {
                System.out.println("El digit final es " + xifres + "B");
            } else if (resultat == 0) {
                System.out.println("El digit final es " + xifres + "A");
            } else {
                System.out.println("dada");
            }
            System.out.println("Has sortit del programa");

        }
    }
}
