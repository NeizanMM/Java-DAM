import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notes;
        int aprovat = 0;
        int suspes = 0;

        for (int comptador = 1; comptador <= 5; comptador++) {
            System.out.println("indica la nota de l'alumne");
            notes = sc.nextInt();
            if (notes >=5) {
                aprovat++;
            } else {
                suspes++;
            }
        }
        System.out.println("Han aprovat " + aprovat + " persones i han suspes " + suspes + " persones");
    }
}