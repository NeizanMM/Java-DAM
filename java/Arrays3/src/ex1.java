import java.util.Scanner;
import static java.lang.Math.random;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcio = 1, contador, continua;

        while (opcio != 0) {

            System.out.println("Venvingut al menu de matrius");
            System.out.println("*****************************");
            System.out.println("Pregunta  1:");
            System.out.println("Pregunta  2:");
            System.out.println("Pregunta  3:");
            System.out.println("Pregunta  4:");
            System.out.println("Pregunta  5:");
            System.out.println("Pregunta  6:");
            System.out.println("Pregunta  7:");
            System.out.println("Pregunta  8:");
            System.out.println("Pregunta  9:");
            System.out.println("Sortir 0:");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1 -> {
                    System.out.println("venvimgut a la opcio 1");
                    int matriu1[][];
                    matriu1 = new int[5][4];
                    for (int files = 0;files < matriu1.length; files++) {
                        for (int columnes = 0; columnes < matriu1[files].length; columnes++) {
                            matriu1[files][columnes] = 1;
                            System.out.print(matriu1[files][columnes] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 2 -> {
                    System.out.println("venvimgut a la opcio 2");
                    int matriu2[][] = new int[5][5];

                    for (int files = 0; files < matriu2.length; files++) {
                        for(int columna = 0; columna < matriu2[files].length; columna++) {
                            matriu2[files][columna] = columna;
                            System.out.print(matriu2[files][columna] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 3 -> {
                    System.out.println("venvimgut a la opcio 3");
                    int matrius3[][] = new int[5][5];

                    for (int fila = 0; fila < matrius3.length; fila++) {
                        for (int columna = 0; columna < matrius3[fila].length; columna++) {
                            matrius3[fila][columna] = fila;
                            System.out.print(matrius3[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 4 -> {
                    System.out.println("venvimgut a la opcio 4");
                    int matrius4[][] = new int[8][8], comptador = 0;

                    for (int fila = 0; fila < matrius4.length; fila++){
                        for (int columna = 0; columna < matrius4.length; columna++) {
                            matrius4[fila][columna] = comptador++;
                            System.out.print(matrius4[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 5 -> {
                    System.out.println("venvimgut a la opcio 5");
                    char matriu5[][] = new char[8][8];
                    char x = 'x', o = 'o';

                    for (int fila = 0; fila < matriu5.length; fila++) {
                        for (int columna = 0; columna < matriu5[fila].length; columna++) {
                            if (fila == columna) {
                                matriu5[fila][columna] = x;
                            } else {
                                matriu5[fila][columna] = o;
                            }
                            System.out.print(matriu5[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 6 -> {
                    System.out.println("venvimgut a la opcio 6");
                    char matriu6[][] = new char[8][8];
                    int ocho = 8, comptador = 0;

                    for (int fila = 0; fila < matriu6.length; fila++) {
                        for (int columna = 0; columna < matriu6[fila].length; columna++) {

                            if (fila + columna == 7) {
                                matriu6[fila][columna] = 'x';
                            } else {
                                matriu6[fila][columna] = 'o';
                            }

                            System.out.print(matriu6[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    continua = sc.nextInt();
                }
                case 7 -> {
                    System.out.println("venvimgut a la opcio 7");
                    System.out.println("introdueix la mida de la taula: ha de ser entre 2 i 10 ");
                    int entrada = sc.nextInt();
                    char matriu7[][] = new char[entrada][entrada];

                    if (entrada > 10 || entrada < 2) {
                        System.out.println("Entrada incorrecta");
                    } else {
                        for (int fila = 0; fila < matriu7.length; fila++) {
                            for (int columna = 0; columna < matriu7[fila].length; columna++) {

                                if (columna == 0 || fila == 0) {
                                    matriu7[fila][columna] = '*';
                                } else if (columna == entrada -1 || fila == entrada -1) {
                                    matriu7[fila][columna] = '*';
                                } else {
                                    matriu7[fila][columna] = '-';
                                }
                                System.out.print(matriu7[fila][columna] + " ");
                            }
                            System.out.println();
                        }
                        continua = sc.nextInt();
                    }
                }
                case 8 -> {
                    System.out.println("venvimgut a la opcio 8");

                    System.out.println("introdueix un valor entre el 4  el 8 per crear la taula :");
                    int entrada = sc.nextInt(), valorandom = (int)(Math.random()*10 +1);
                    int matriu8[][] = new int[entrada][entrada];

                    if (entrada < 4 || entrada > 8) {
                        System.out.println("Dada incorrecta");
                    } else {
//                        for (int fila = 0; )
                    }

                }
                case 9 -> {
                    System.out.println("venvimgut a la opcio 9");

                }
                case 0 -> {
                    System.out.println("venvimgut a la opcio 0");
                }
//                case default -> {
//                }
            }
        }
    }
}