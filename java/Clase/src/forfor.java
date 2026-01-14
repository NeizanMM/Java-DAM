import java.util.Scanner;

public class forfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero; // variable del usuario

        System.out.println("Entra un numero positiu: ");
        numero = sc.nextInt();  //scaner del numero
        if (numero > 0) { // Condicion para abrir los bucles
            for (int fila = numero; fila >= 1; fila--) { // primer bucle: crea la variable fila que marca fila = a la entrada, pone un limite de 1 y hace que vaya disminuyendo
                for (int columna = fila; columna >= 1; columna--) { // segundo bucle: crea la variable columna, la iguala a fila, pone un limite de
                    System.out.print("*-/");
                }
                System.out.print("\n");
            }
        }else {
                System.out.println("Dada incorrecta");
            }
        }
}
