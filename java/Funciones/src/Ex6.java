import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("introdueix un numero");
        num1 = sc.nextInt();
        System.out.println("introdueix un segon numero");
        num2 = sc.nextInt();
        System.out.println("introdueix un tercer numero");
        num3 = sc.nextInt();

        suma (num1, num2, num3);
    }

public static int suma (int num1, int num2, int num3) {
    int resposta = 0, numgran = num1, numpetit = num1;

    if (numgran > num2) {
        if (numgran > num3) {
        } else {
            numgran = num3;
        }
    } else if (num2 > num3) {
        numgran = num2;
    } else {
        numgran = num3;
    }

    if (numpetit < num2) {
        if (numpetit < num3) {
        } else {
            numpetit = num3;
        }
    } else if (num2 < num3) {
        numpetit = num2;
    } else {
        numpetit = num3;
    }

    System.out.println("el num gran es " + numgran);
    System.out.println("el num petit es " + numpetit);
return resposta;
}
}