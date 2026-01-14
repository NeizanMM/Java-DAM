import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text;
        String hello = "hello***", baybay = "***baybay";

        System.out.println("Introdueix el codi amb patro: ");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("no has introduit cap dada");
        } else if (text.substring(0, 8).equals(hello) || (text.substring(text.length() - 9, text.length()).equals(baybay))) {
            System.out.println("Patro detectat");
        } else {
            System.out.println("patro no detectat");
        }
    }
}