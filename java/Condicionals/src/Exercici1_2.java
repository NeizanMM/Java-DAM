import java.util.Scanner;

public class Exercici1_2 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un numero del 1 al 7: ");
        nota = sc.nextInt();

        switch (nota) {
            case 1 -> System.out.println("Dilluns");
            case 2 -> System.out.println("Dimarts");
            case 3 -> System.out.println("Dimecres");
            case 4 -> System.out.println("Dijous");
            case 5 -> System.out.println("Divendres");
            case 6 -> System.out.println("Disabte");
            case 7 -> System.out.println("Diumenje");
            default -> System.out.println("entrada no valida");
        }
        System.out.println("has sortit del programa");
    }
}