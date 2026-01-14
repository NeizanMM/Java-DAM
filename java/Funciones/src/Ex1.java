import  java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        String nom = pregunta();
        System.out.println("Hola " + nom);

    }

public static String pregunta() {
    Scanner sc = new Scanner(System.in);
    boolean comprovant = false;
    String nom;

    do {
        System.out.println("introdueix el teu nom: ");

        nom = sc.nextLine();
        if (nom.isEmpty()) {
            comprovant = false;
        } else {
            comprovant = true;
        }
    } while (!comprovant);

    return nom;
}
}