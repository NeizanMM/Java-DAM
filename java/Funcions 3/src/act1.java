import java.util.Scanner;

public class act1 {
    static final float DOLAR = 1.11F;


    public static void main (String[] args) {
        act1 programa = new act1();
        programa.inici();

    }
    public static void inici () {
        float quantitat = 0;
        float valor;
            System.out.println("Introdueix la quantitat d'euros");
            valor = demanar(quantitat);
            System.out.println("Total de dolars: " + canvi(valor));

    }
    public static float demanar (float quantitat) {
        boolean correcte = true;

        do {
            Scanner sc = new Scanner(System.in);
            quantitat = sc.nextFloat();
            if (quantitat < 0) {
                correcte = false;
                System.out.println("Torna ha introduir");
            } else {
                correcte = true;
            }
        }while (correcte != true);
        return quantitat;
    }

    public static float canvi (float quantitat) {
        float resultat = DOLAR * quantitat;
        return resultat;
    }
}
