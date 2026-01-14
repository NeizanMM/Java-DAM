import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, paraulagran = "", paraules[];
        int longparaula = 0;

        System.out.println("introdueix un text: ");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("no has introduit cap dada");
        } else {
            paraules = text.split(" ");
            for (int i = 0; i < paraules.length; i++) {
                paraulagran = paraules[i];
                longparaula = paraules[i].length();

                if (paraules[i].length() > longparaula) {
                    paraulagran = paraules[i];
                    longparaula = paraules[i].length();
                }
            }
            System.out.println("La paraula mes gran es: " + paraulagran + " i la longitut es de: " + longparaula);
        }
    }
}