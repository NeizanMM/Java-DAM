import java.util.Scanner;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valors, comptador = 0,resposta, valorminim, valormaxim;
        int llista[];

        System.out.println("introdueix la quantitat de valors que vols a la llista: ");
        valors = sc.nextInt();

        llista = new int[valors];

        for (int elements: llista) {
            System.out.println("Introdueix el valor que vols indicar a la posicio: " + comptador);
            resposta = sc.nextInt();
            llista[comptador] = resposta;
            comptador++;
        }

            Arrays.sort(llista);

            valormaxim = llista[llista.length -1];
            valorminim = llista[0];

            System.out.println("La dada maxima es: " + valormaxim);
            System.out.println("La dada minima es: " + valorminim);
    }
}