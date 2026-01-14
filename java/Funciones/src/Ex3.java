import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("introdueix el numero que vols tenir el seu cub");
        num = sc.nextInt();
        int resposta = cub(num);
        System.out.println("el numero triat es " + num + " el cub es: " + cub(num));
    }

public static int cub (int num) {
    int resposta = num * num * num;
    return resposta;
}
}