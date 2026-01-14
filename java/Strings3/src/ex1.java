import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text;
        int comptador = 0;
        char caracter;

        System.out.println("introdueix el codi secret: ");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("has sortit del programa");
        } else {
            while (comptador < text.length()) {
                caracter = text.charAt(comptador);
                caracter = (char)(caracter - 1);
                comptador++;
                System.out.print(caracter);
            }
        }
    }
}