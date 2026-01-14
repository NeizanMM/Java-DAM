import java.util.Scanner;

public class exemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamany;

        System.out.println("Entra un numero positiu: ");
        tamany = sc.nextInt();

        if (tamany > 0) {  // primera condicion, filtra que amaño sea positivo
            for (int fila = tamany; fila >= 1; fila--) {  // primer bucle, crea la variable fila y la iguala a tamany
                for (int columna = fila; columna >= 1; columna--) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("no has enrat un nombre positiu");
        }
        System.out.println("prova de dicicio");
        System.out.println(73%73);
        System.out.println(73/1);
    }
}
