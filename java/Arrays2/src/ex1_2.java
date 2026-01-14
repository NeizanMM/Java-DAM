import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comptador = 0, opcio, num1, num2;
        String venvinguda = "Benvingut a la braseria la Xerra";

        while (comptador >= 0) {
            System.out.println("Elegeix quina opcio vols:");
            System.out.println("=====Menu del Dia=======");
            System.out.println("1. benvinguda");
            System.out.println("2. suma de 2 nombres");
            System.out.println("3. Mostrar la data actual");
            System.out.println("0. Sortir");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1 -> System.out.println(venvinguda);
                case 2 -> {
                    System.out.println("introdueix el valor 1: ");
                    num1 = sc.nextInt();
                    System.out.println("introdueix el valor 2: ");
                    num2 = sc.nextInt();
                    System.out.println("El resultat es: " + num1 + num2);
                }
                case 3 -> System.out.println("11/11/2025");
                case 0 -> {
                    System.out.println("Has sortit del programa");
                    comptador = -1;
                }
                default -> System.out.println("dada incorrecta");
            }
        }
    }
}
