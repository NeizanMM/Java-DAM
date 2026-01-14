import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text, censura, textnou = "", asterisc = "*";
        int comptador = 0, inici = -1, resultat = 0, tamany;
        char caractertext, caractercensura;

        System.out.println("Indica el text: ");
        text = sc.nextLine().toLowerCase();

        System.out.println("Ara, introdueix la paraula a censurar: ");
        censura = sc.nextLine().toLowerCase();

        tamany = censura.length();

        if (text.isEmpty() || censura.isEmpty()) {
            System.out.println("hi han dades buides, torna a exeecutar");
        } else {
            textnou = text.replaceAll(censura, asterisc.repeat(tamany));

            textnou = textnou.strip();

            System.out.println(textnou);
        }
    }
}