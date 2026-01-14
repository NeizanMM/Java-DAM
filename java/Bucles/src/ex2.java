import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;

        for (int comptador = 1; comptador <= 10; comptador++ ) {
            System.out.println("Intrdueix un numero: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                suma += num;
            } else {
                System.out.println("Dada incorrecta");
            }
        }
        System.out.println("La suma de numeros introduitis es: " + suma);
    }
}