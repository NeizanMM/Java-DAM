import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorrandom;
        int numerousuari;
        int comptador = 1;

        valorrandom = (int)(Math.random()*100 +1);
        System.out.println(valorrandom);
        System.out.println("Indica un numero del 1 al 100 que creus que s'ha generat: ");
        numerousuari = sc.nextInt();

        if (numerousuari == valorrandom) {
            System.out.println("Has ensertat el numero");
        } else {
            while (numerousuari != valorrandom) {
                if (numerousuari > valorrandom) {
                    System.out.println("El numero es masa gran, torna a intentar");
                } else {
                    System.out.println("El numero es masa petit, torna a intentar");
                }
                numerousuari = sc.nextInt();
                comptador++;
        }
            System.out.println("Has ensertat el numero, Ho has aconseguit en: " + comptador + " intents");
        }
    }
}