import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {

        int altura;
        int base;
        int resultat_a;
        int resultat_p;

        Scanner sc = new Scanner(System.in);
        System.out.println("introdueix la altura del rectangle: ");
        altura = sc.nextInt();

        System.out.println("ara, introdueix la base del rectangle: ");
        base = sc.nextInt();

        if (altura == base){
            System.out.println("Les mesures indicades son de un quadrat");
        } else {
            System.out.println("has sortit del programa");
        }
        if (altura != base) {
            resultat_p = ((base + base) + (altura + altura));
            resultat_a = (base * altura);
            System.out.println("el perimetre es; " + resultat_p);
            System.out.println("la area es; " + resultat_a);
            System.out.println("has sortit del programa");
        }
    }
}
