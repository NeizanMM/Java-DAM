import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text, paraules[], paraulagran = "";
        int comptador = 0, tamany, petita, longgran = 0;

        System.out.println("indica un text");
        text = sc.nextLine();

        if (text.isEmpty()) {
            System.out.println("no hi ha cap dada a separar");
        } else {
            paraules = text.split(" ");
            for (int i = 0; i < paraules.length; i++) {
                longgran = paraules[i].length();
                paraulagran = paraules[i];

                if (paraules[i].length() > longgran) {
                    longgran = paraules[i].length();
                    paraulagran = paraules[i];
                }
            }
            System.out.println("\nla paraula mes gran es: " + paraulagran + " amb " + longgran);

        }
    }
}
