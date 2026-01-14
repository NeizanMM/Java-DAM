import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("introdueix un numero");
        num1 = sc.nextInt();
        System.out.println("introdueix un segon numero");
        num2 = sc.nextInt();
        int resposta = suma(num1, num2);}

public static int suma (int num1, int num2) {
        int resposta = 0;
        if (num1 < num2) {
            for (int i = num1 + 1 ;i < num2; i++) {
                num1++;
                System.out.println(i);
            }
    } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
    }
    return resposta;
}
}