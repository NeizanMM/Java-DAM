import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        String text = "";
        do {
            System.out.println("Introdueix el valor: ");
            entrada = sc.nextInt();
            text += entrada;
        } while (text.isEmpty());
        if (comprovant(entrada)) {
            System.out.println("el numero entrat: " + entrada + " es primo");
        } else {
            System.out.println("el numero entrat: " + entrada + " es primo");
        }
    }

public static boolean comprovant (int entrada) {
        boolean primo = false;
        int diviciosi = entrada % entrada, divicio1 = entrada % 1;
        if (diviciosi == 0 && divicio1 == 0) {
            if (!(entrada % 2 == 0)) {
                primo = true;
            }
        } else {
        }
    return primo;
}
}