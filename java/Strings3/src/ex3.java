import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String textindicat, fi = "fi";
        String junt = "";
        int comptador = 0;

        System.out.println("indica una paraula o varies, quan vulguis sortir nomes has de ficar fi");
        while (comptador == 0) {
            textindicat = sc.nextLine().toLowerCase();
            if (fi.equals(textindicat)) {
                comptador = -1;
            } else {
                junt += textindicat + " ";
            }
        }
        System.out.println(junt);
    }
}