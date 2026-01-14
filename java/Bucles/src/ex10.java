import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorrandom1;
        int valorrandom2;
        int valorusuari;
        int suma;
        int comptador = 1;
        int intents = 1;

        while (comptador < 5){
            valorrandom1 = (int)(Math.random()*10 +1);
            valorrandom2 = (int)(Math.random()*10 +1);
            suma = valorrandom1 + valorrandom2;
            System.out.println("Quant es: " + valorrandom1 + " + " + valorrandom2 + " ?");
            valorusuari = sc.nextInt();
            intents++;

            if (valorusuari == suma) {
                System.out.println("Has contestat correctament, pasa a la seguent suma");
                        comptador++;

            } else {
                System.out.println("resposta incorrecta, torna a intentar, aquesta no suma");
            }
        }
        System.out.println("Has superat el joc, felicitats, has fet " + intents + " intents");
    }
}