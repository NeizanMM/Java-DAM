//import java.util.Scanner;
//
//public class pruebas {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("venvimgut a la opcio 7");
//        char matrius7[][] = new char[10][10];
//
//        System.out.println("Introdueix un numero de 6 digits");
//        int entrada = sc.nextInt();
//
//        String numeros = String.valueOf(entrada);
//
//        for (int fila = 0; fila < matrius7.length; fila++) {
//            int comptador = 0;
//            for (int columna = 0; columna < matrius7[fila].length; columna++) {
//                if (columna == 0 || columna == 9) {
//                    matrius7[fila][columna] = '*';
//                } else if (columna == 1 || columna == 8) {
//                    matrius7[fila][columna] = '-';
//                } else if (matrius7[fila][columna] == 0) {
//                    char digits = numeros.charAt(comptador);
//                    matrius7[fila][columna] = digits;
//                    comptador++;
//                }
//                System.out.print(matrius7[fila][columna] + " ");
//            }
//            System.out.println();
//        }
//        continua = sc.nextInt();
//    }
//                case 72 -> {
//        System.out.println("venvimgut a la opcio 72");
//        char matriu72[][] = new char[10][10];
//        System.out.println("entra un digit de 2 a 10");
//        int entrada = sc.nextInt();
//        char entradachar = (char)('0' + entrada);
//        System.out.println(entrada);
//
//        for (int fila = 0; fila < matriu72.length; fila++) {
//            for (int columna = 0; columna < matriu72[fila].length; columna++) {
//                if (columna == 0 || columna == 9) {
//                    matriu72[fila][columna] = '*';
//                } else if (columna == 1 || columna == 8) {
//                    matriu72[fila][columna] = '-';
//                } else if (matriu72[fila][columna] == 0){
//                    matriu72[fila][columna] = entradachar;
//                }
//                System.out.print(matriu72[fila][columna] + " ");
//            }
//            System.out.println();
//        }
//        continua = sc.nextInt();
//    }