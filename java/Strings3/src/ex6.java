import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, textgirat = "", textpla = "";
        int comptador = 0;
        char selector;

        System.out.println("Comprovador de palindrom;");
        System.out.println("Introdueix un palindrom:");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("No has introduit cap dada");
        } else {
            while (comptador < text.length()) {
                selector = text.charAt(comptador);
                if (selector == ' ') {
                    comptador++;
                } else {
                    textgirat = selector + textgirat;
                    textpla += selector;
                    comptador++;
                }
            }
                if (textpla.equals(textgirat)) {
                    System.out.println("el text introduit es un palindrom");
                } else {
                    System.out.println("el text introduit no es un palindrom");
            }
        }
    }
}