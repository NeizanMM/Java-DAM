import java.util.Scanner;

public class machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diners;
        int billets100, billets50, billets20, billets10, billets5, monedes2, monedes1;

        System.out.println("Indica la quantitat que vols treure, recorda que el caixe te un limit de 2000€ i no te centims: ");
        diners = sc.nextInt();

        if (diners < 2000) {
            billets100 = diners / 100;
            diners = diners % 100;

            billets50 = diners / 50;
            diners = diners % 50;

            billets20 = diners / 20;
            diners = diners % 20;

            billets10 = diners / 10;
            diners = diners % 10;

            billets5 = diners / 5;
            diners = diners % 5;

            monedes2 = diners / 2;
            diners = diners % 2;

            monedes1 = diners / 1;
            diners = diners % 1;

            System.out.println("billets de 100: " + billets100);
            System.out.println("billets de 50: " + billets50);
            System.out.println("billets de 20: " + billets20);
            System.out.println("billets de 10: " + billets10);
            System.out.println("billets de 5: " + billets5);
            System.out.println("monedes de 2: " + monedes2);
            System.out.print("monedes de 1: " + monedes1);

        } else {
            System.out.println("Dada incoorecta, sortin del programa");
        }
        }
    }
