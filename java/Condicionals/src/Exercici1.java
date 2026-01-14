import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Escriu un numero del 1 al 7: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("Dilluns");
        } else if (numero == 2) {
            System.out.println("Dimarts");
        } else if (numero == 3) {
            System.out.println("Dimecres");
        } else if (numero == 4) {
            System.out.println("Dijous");
        } else if (numero == 5) {
            System.out.println("Divendres");
        } else if (numero == 6) {
            System.out.println("Disabte");
        } else if (numero == 7) {
            System.out.println("Diumenge");
        }else {
            System.out.println("Entrada no valida");
        }
        System.out.println("has sortit del programa");

    }
}
