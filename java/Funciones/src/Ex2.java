import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        String resposta = pregunta();
        System.out.println(resposta);
    }

public static String pregunta() {
    Scanner sc = new Scanner(System.in);
    String text = "Hola a tothom" + "\n", resposta;
    System.out.println("Quantes vegades vols que aparegui el misatge?");
    int num = sc.nextInt();
    resposta =text.repeat(num);
    return resposta;
}
}