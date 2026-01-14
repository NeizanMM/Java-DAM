import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiu;

        System.out.println("indica un numero positiu per pasar a binari");
        positiu = sc.nextInt();

        if (positiu > 0) {
            String binari = "";

            while (positiu > 0) {
                int resta = positiu % 2;
                binari = resta + binari;
                positiu = positiu / 2;
            }
            System.out.println("Numero biniari: " + binari);
        } else {
            System.out.println("dada incorrecta");
        }
    }
}