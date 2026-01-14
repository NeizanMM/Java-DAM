import java.util.Scanner;

public class act3 {

    public static void main (String[] args) {
        act3 programa = new act3();
        programa.inici();
    }

    public static void inici () {
        String paraula = "";
        System.out.println("Introdueix un palindrom");
        do {
            paraula = entrada();
        } while (comprovant(paraula) != true);
        System.out.println("La paraula entrada: " + paraula + " es " + comprovant(paraula));
    }

    public static String entrada () {
        Scanner sc = new Scanner(System.in);
        String paraula = sc.nextLine();
        return paraula;
    }


    public static boolean comprovant (String paraula) {
        char selector;
        String reves = "";
        boolean correcte = false;

        for (int i = 0; i < paraula.length() ; i++) {
            selector = paraula.charAt(i);
            reves = selector + reves;
        }
        if ( reves.equals(paraula)) {
            correcte = true;
        } else {
            System.out.println("torna ha introduir una paraula");
        }
        return correcte;
    }
}
