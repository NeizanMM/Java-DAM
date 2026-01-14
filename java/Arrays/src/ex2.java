import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valors, comptador = 0, resposta, pos;
        int taula[];
        String total = "", guio = "-", linia;

        System.out.println("Introdueix un valor: ");
        valors = sc.nextInt();

        taula = new int[valors];

        for (int elements: taula) {
            System.out.println("Introdueix el numero: " + comptador);
            resposta = sc.nextInt();
            taula[comptador] = resposta;
            total = resposta + "," + total;
            comptador++;
        }

        System.out.println("Mostrant números en ordre invers:");

        comptador = 1;

        linia = guio.repeat(25);
        System.out.println(linia);
        System.out.println(total);
    }
}