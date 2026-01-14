import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("introdueix un numero");
        num1 = sc.nextInt();
        System.out.println("introdueix un segon numero");
        num2 = sc.nextInt();
        int resposta = suma(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + suma(num1,num2));
    }

public static int suma (int num1, int num2) {
    int resposta = num1 + num2;
    return resposta;
}
}