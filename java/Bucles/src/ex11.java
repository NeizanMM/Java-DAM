import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorrandom1;
        int valorrandom2;
        int valorusuari;
        int opcio;
        int suma;
        int comptador = 0;
        int intents = 0;

        System.out.println("indica quin joc vols fer, el joc de les sumes = 1, el joc de les restes = 2, el joc de les multiplicacions = 3");
        opcio = sc.nextInt();

        //-------------------------------------------------------

        if (opcio == 1) {
            System.out.println("Has elegit el joc de les sumes:");
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

            //------------------------------------------------------

        } else if (opcio == 2) {
            System.out.println("Has elegit el joc de les restes:");
            while (comptador < 3){
                valorrandom1 = (int)(Math.random()*10 +1);
                valorrandom2 = (int)(Math.random()*10 +1);
                suma = valorrandom1 - valorrandom2;
                System.out.println("Quant es: " + valorrandom1 + " - " + valorrandom2 + " ?");
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

            //--------------------------------------------------------

        } else if (opcio == 3) {
            System.out.println("Has elegit el joc de les multiplicacions:");
            while (comptador < 3){
                valorrandom1 = (int)(Math.random()*10 +1);
                valorrandom2 = (int)(Math.random()*10 +1);
                suma = valorrandom1 * valorrandom2;
                System.out.println("Quant es: " + valorrandom1 + " X " + valorrandom2 + " ?");
                valorusuari = sc.nextInt();
                intents++;

                if (valorusuari == suma) {
                    System.out.println("Has contestat correctament, pasa a la seguent multiplicacions");
                    comptador++;

                } else {
                    System.out.println("resposta incorrecta, torna a intentar, aquesta no suma");
                }
            }
            System.out.println("Has superat el joc, felicitats, has fet " + intents + " intents");
        }
    }
}