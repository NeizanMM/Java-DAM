import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        for (int comptador = 1; comptador>0; comptador++) {
            System.out.println("indica un numero: ");
            numero = sc.nextInt();

            if (numero >0) {
                System.out.println(comptador + ". " +" El numero " + numero + " es positiu");
            } else {
                System.out.println("El numero " + numero + " indicat es negatiu");
            } if (numero % 2 == 0) {
                System.out.println(comptador + ". " +" El numero " + numero + " es parell");
            } else {
                System.out.println(comptador + ". " +" El numero " + numero + " es inparell");
            }
            int quadrat = (numero * numero);
            System.out.println(comptador + ". " +" El quadrat del numero indicat es: " + quadrat);

        }

    }
}