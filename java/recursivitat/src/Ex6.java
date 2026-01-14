import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int xifra = 0;
        Scanner sc = new Scanner(System.in);
        int num = 111;
        compte(num);
        System.out.println(compte(num));
    }

    public static int compte (int num) {
        int xifra = 0;

        if (num < 10) {
            xifra = 1;
        } else {
            xifra = 1 + compte(num / 10);
        } return xifra;
    }
}