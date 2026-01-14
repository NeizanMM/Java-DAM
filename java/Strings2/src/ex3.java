import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, noutext, a, e, i, o, u;
        a = "a";
        e = "e";
        i = "i";
        o = "o";
        u = "u";
        
        System.out.println("introdueix un text: ");
        text = sc.nextLine().toLowerCase();

        if (text.isEmpty()) {
            System.out.println("no has introduit res");
        } else {
            noutext = text.replaceAll(a, " ");
            noutext = noutext.replaceAll(e, " ");
            noutext = noutext.replaceAll(i, " ");
            noutext = noutext.replaceAll(o, " ");
            noutext = noutext.replaceAll(u, " ");
            System.out.println(noutext);
        }
    }
}
