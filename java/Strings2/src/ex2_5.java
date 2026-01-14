import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String text, censura, textnou = "";
    int comptador = 0, inici = -1, resultat = 0;

        System.out.println("Indica el text: ");
        text = sc.nextLine().toLowerCase();

        System.out.println("Ara, introdueix la paraula a censurar: ");
        censura = sc.nextLine().toLowerCase();

        if (text.isEmpty() || censura.isEmpty()) {
            System.out.println("hi han dades buides, torna a exeecutar");
        } else {
            while (resultat != -1) {
                resultat = text.indexOf(censura, inici +1);
                if (resultat == -1) {
                    textnou += "*";
                } else {
                    comptador++;
                    inici = resultat;
                    textnou += text.indexOf(inici);
                    System.out.println(textnou);
                }
            }
        }
    }
}
