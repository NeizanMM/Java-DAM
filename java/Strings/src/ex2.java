import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1;
        String text2;

        System.out.println("Indica el primer text: ");
        text1 = sc.nextLine();
        System.out.println("Indica el segon text: ");
        text2 = sc.nextLine();

        if (text1.isEmpty() || text2.isEmpty()) {
            System.out.println("Has de introduir 2 textos. Has sortit del programa");
        } else {
            if (text1.length() == text2.length()) {
                System.out.println("Els 2 textos tenen el mateix tamany ");
                }if (text1.equals(text2)) {
                System.out.println("Els 2 textos tenen el mateix contingut");
            } else if (text2.length() > text1.length()) {
                System.out.println("El segon text te mes caracteers que el primer");
            } else if (text1.length() > text2.length()) {
                System.out.println("El primer text es mes gran que el segorn");
            }
        }
    }
}
