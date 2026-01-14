import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comptador = 0, opcio, num1, num2;
        String venvinguda = "Benvingut a la braseria la Xerra", calculadora;

        while (comptador >= 0) {
            System.out.println("=====Menu del Dia=======");
            System.out.println("elegeix quina opcio vols:");
            System.out.println("1.benvinguda");
            System.out.println("2.suma de 2 nombres");
            System.out.println("3. Mostrar la data actual");
            System.out.println("0. Sortir");
            opcio = sc.nextInt();
            if (opcio == 1){
                System.out.println(venvinguda);
            } else if (opcio == 2) {
                System.out.println("introdueix el valor 1: ");
                num1 = sc.nextInt();
                System.out.println("introdueix el valor 2: ");
                num2 = sc.nextInt();
                System.out.println("El resultat es: " + num1 + num2);
            } else if (opcio == 3) {
                System.out.println("11/11/2025");
            } else {
                System.out.println("Sortint del programa");
                comptador = -1;
            }
            }
    }
}
