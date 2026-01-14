import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorindicat, valorretornat = -1, comptador = 0, comptador2 = 0;
        int taula[] = new int [10];

        for (int element: taula) {
            int valrorandom = (int)(Math.random()*100 +1);
            taula[comptador] = valrorandom;
            System.out.print(taula[comptador] + ",");
            comptador++;
        }

        System.out.println("Introdueix el numero que vols cercar: ");
        valorindicat = sc.nextInt();

        Arrays.sort(taula);

        while (comptador2 < taula.length && valorretornat == -1) {
            if (taula[comptador2] == valorindicat) {
                valorretornat = comptador2;
            }
            comptador2++;
         }
        if (valorretornat != -1) {
            System.out.println("Valor " + valorindicat + " trobat a la posicio (index): " + valorretornat);
        } else {
            System.out.println("Valor no trobat");
        }
    }
}