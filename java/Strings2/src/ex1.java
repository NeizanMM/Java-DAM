import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, cercador, recompte = "";
        int resultat = 0, comptador = 0, inici = -1;

        System.out.println("Introdueix un text: ");
        text = sc.nextLine();
        text = text.toLowerCase();

        System.out.println("Introdueix que vols cercar en el text: ");
        cercador = sc.nextLine();
        cercador = cercador.toLowerCase();

        if (cercador.isEmpty() || text.isEmpty()) {
            System.out.println("Hi ha una dada buida, torna a intentar");
        } else {
            while (resultat != -1) { // bucle de resultado negativo
                resultat = text.indexOf(cercador, inici +1 ); // variable de buscador de inicio
                if (resultat == -1){ // condicion negativa
                    System.out.println(" ");
                } else {
                    comptador ++;
                    inici = resultat;
                    recompte = resultat + ", ";
                    System.out.print(recompte);
                }
                }
            System.out.println("i surt " + comptador + " vegades");
        }
    }
}