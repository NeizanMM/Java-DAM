import  java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1;
        String invertit = "";
        char posicio;
        int comptador = 0;

        System.out.println("Introdueix un text que vols invertir");
        text1 = sc.nextLine();

        if (text1.isEmpty()) {
            System.out.println("No has introduit cap text, torna-ho a intentar (Has sortoit del programa)");
        } else {
            while (comptador != text1.length()) {
                posicio = text1.charAt(comptador);
                invertit = posicio + invertit;
                comptador++;
            }
            System.out.println(invertit);
        }
    }
}
