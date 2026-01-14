import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conntrasenya, especial = "!@#$%^&*.";
        int comptador = 0, majuscules = 0, minuscules = 0, numeros = 0, caracters = 0;
        char digit = ' ';

        System.out.println("introdueix una contrasenya forta de minim 8 caracters i maxim de 15, a part a de tenir el seguents caracteers (!@#$%^&*): ");
        conntrasenya = sc.nextLine();

        if (conntrasenya.isEmpty()) {
            System.out.println("Dades no valides");
        } else if (conntrasenya.length() < 8 || conntrasenya.length() > 15) {
            System.out.println("dades incorrectes");
        } else {
            while (comptador <= (conntrasenya.length() - 1)) {
                digit = conntrasenya.charAt(comptador);

                if (Character.isUpperCase(digit) && majuscules >= 0) {
                    comptador++;
                    majuscules++;
                } else if (Character.isLowerCase(digit) && minuscules >= 0) {
                    comptador++;
                    minuscules++;
                } else if (Character.isDigit(digit) && numeros >= 0) {
                    comptador++;
                    numeros++;
                } else if (especial.indexOf(digit) != -1) {
                    comptador++;
                    caracters++;
                }
            } if (numeros == 0 || minuscules == 0 || majuscules == 0 || caracters == 0) {
                System.out.println("Contrasenya feble");
                comptador = 20;
            }else {
                System.out.println("la contrasenya: " + conntrasenya + " es forta");
            }
        }
    }
}