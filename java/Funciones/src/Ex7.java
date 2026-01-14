import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.println("introdueix un numero");
        num1 = sc.nextInt();
        System.out.println(suma(num1));
    }

public static String suma (int num1) {
    int comptador = 0, resultat;
    String taula = "";
    while (comptador <= 10) {
        resultat = num1 * comptador;
        taula += comptador + " * " + num1 + " = " + resultat + "\n";
        comptador++;
    }
    return taula;
}
}