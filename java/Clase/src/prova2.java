import java.util.Scanner;

public class prova2 {
    public static void main(String[] args) {
        int numero;
        int base;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el numero de files que vols que sigui el triangle: ");
        numero = sc.nextInt();

        for (int altura = 1; altura <= numero; altura ++) {
            System.out.println("*");
            System.out.println("\n");
        }
        }
    }
