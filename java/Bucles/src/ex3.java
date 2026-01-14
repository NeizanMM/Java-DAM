import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int multi = 1;

        System.out.println("introdueix un numero positiu: ");
        numero = sc.nextInt();

        if (numero > 0) {
            for (int comptador =1;comptador <= numero;comptador++) {
                multi = multi * comptador;
            }
            System.out.println("El factoral de " + numero + " es: " + multi);
        } else {
            System.out.println("Dada incorrecta, has de ficar un numero positiu");
            System.out.println("Has sortit del programa");
        }
    }
}