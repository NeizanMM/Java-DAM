import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.println("introdueix una lletra: ");
            entrada = sc.nextLine().toLowerCase();
        } while (entrada.length() > 1);

        if (lletra(entrada)) {
            System.out.println("El caracter entrat " + entrada + " es una vocal");
        } else {
            System.out.println("El caracter entrat " + entrada + " es un consonant");
        }
    }

public static boolean lletra (String entrada) {
        boolean vocals = false;
        if (entrada.matches("[aeiou]")) {
            vocals = true;
    } else {
        }
    return vocals;
}
}