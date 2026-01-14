import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String producte;
        double preu;
        boolean qualitat;
        double iva_b = 0.4;
        double iva_l = 0.21;
        double preu_final;

        System.out.println("Indica en nom del article: ");
        producte = sc.next();

        System.out.println("Indica el preu del article: ");
        preu = sc.nextDouble();

        System.out.println("El producte es de luxe? (true/false): ");
        qualitat = sc.nextBoolean();

        if (qualitat) {
            preu_final = preu * (1 + iva_l);
                System.out.println("el preu del article " + producte + " es " + preu_final);
        } else {
            preu_final = preu * (1 + iva_b);
                System.out.println("el preu del article " + producte + " es " + preu_final);
        }
        System.out.println("has sortit del programa :)");
    }
}
