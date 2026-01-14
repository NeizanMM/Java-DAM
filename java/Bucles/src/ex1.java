import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introdueix un numero positiu: ");
        num = sc.nextInt();

        if (num > 0) {
            for (int lista = 0; lista <= num; lista++) {
                System.out.print(lista + ", ");
            }
            } else {
            System.out.println("Numero incorrecte");
        }
    }
}
