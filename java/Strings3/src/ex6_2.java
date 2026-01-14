import java.util.Scanner;

public class ex6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, textgirat = "";
        int comptador = 0;
        char selector;

        System.out.println("Comprovador de palindrom;");
        System.out.println("Introdueix un palindrom:");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("No has introduit cap dada");
        } else {
            String textnet = text.replace(" ", "");
            for (int comptado = 0; comptado < textnet.length(); comptado++) {
                textgirat = textgirat + textnet.charAt(comptado);
            }
            if (textnet.equals(textgirat)) {
                System.out.println("palindrom");
            } else {
                System.out.println("no palindrom");
            }
        }
    }
}
