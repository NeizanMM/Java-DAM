import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //text-----------
        String text1;

        //cerques--------------------
        int espais = 0, majuscules = 0, minuscules = 0, numeros = 0, extra = 0;
        char cercador;

        System.out.println("Introdueix un text: ");
        text1 = sc.nextLine();

        if (text1.isEmpty()) {
            System.out.println("No has introduit cap text, torna-ho a intentar");

        } else {

            for (int posicion = 0;posicion != text1.length(); posicion++) {

                cercador = text1.charAt(posicion);
                if (Character.isUpperCase(cercador)) {
                    majuscules++;
                } else if (Character.isLowerCase(cercador)) {
                    minuscules++;
                } else if (Character.isSpaceChar(cercador)) {
                    espais++;
                } else if (Character.isDigit(cercador)) {
                    numeros++;
                } else {
                    extra++;
                }
                }
            }
        System.out.println("majuscules: " + majuscules);
        System.out.println("minuscules: " + minuscules);
        System.out.println("Espais: " + espais);
        System.out.println("Extres: " + extra);
        System.out.println("Numero: " + numeros);
        }
    }
