import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String text = "hola";
        ordre(text);
        System.out.println(ordre(text));
    }

    public static boolean ordre (String text) {
        int comptador = 0;
        char caracter1 = text.charAt(comptador), caracter2;
        boolean retornar = false;

        if (text.length() <= 1) {
            return true;
        } else {
            if (text.charAt(0)<= text.charAt(1)) {
                retornar = ordre(text.substring(1));
            } else {
                return retornar;
            }
            return retornar;
        }
    }
}



//        comptador++;
//        caracter2 = text.charAt(comptador);
//        if (caracter1 < caracter2) {
//            return true;
//            ordre(text);
//        } else {
//            return false;
//        }