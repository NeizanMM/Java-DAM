import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text;
        int comptador = 0;
        char caracter;

        System.out.println("Introdueix el text que vols comprobar");
        text =  sc.nextLine();

        if (text.isEmpty()) {
            System.out.println("No has introduit cap text, Sortin del prigrama");
        } else {
            while (comptador != text.length()) {
                caracter = text.charAt(comptador);
                System.out.println("Pos:" + comptador + ": " + caracter);
                comptador++;
            }
        }
    }
}
