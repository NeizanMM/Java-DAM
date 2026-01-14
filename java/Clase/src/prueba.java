import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/*
 * Autors:
 * Neizan Montes de Oca Mateu
 * David Moreno Santiago
 * Eric Terrats Sanchez
 */

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linea, guio = "*", informacio[] = new String[1000], buidar;
        int opcio = 1, comptadorDia = 0, atraccions = 0, espectacles = 0, serveisVIP = 0, contadorEntradas = 0;
        LocalDate data = LocalDate.now();
        LocalTime time = LocalTime.now();

        while (opcio != 0) {

            System.out.println("---Menu de seleccio---");
            linea = guio.repeat(25);
            System.out.println(linea);
            System.out.println("Opcio: 0 - Sortir");
            System.out.println("Opcio: 1 - Venda d’entrades");
            System.out.println("Opcio: 2 - Us de l’entrada");
            System.out.println("Opcio: 3 - Estadistiques del dia");
            String tiquet;

            opcio = sc.nextInt();
            buidar = sc.nextLine();


            switch (opcio) {

                case 1 -> {
                    float preuEntrada, entradaNormal = 12, suplementVIP = 4, entradaGratuita = 0, descompte = 0.50F;
                    boolean gratuitaBolean = false, vipBolean = false, descompteBolean = false, comprovant;
                    String nom, cognom1, cognom2, edat, vipString, discapacitatString;
                    String tipusNormal = "Normal", tipusDescompe = "Descompte", tipusGratuita = "Gratuita", tipusVip = "VIP", tipusEntrada;
                    char inicial_c1 = ' ', inicial_c2 = ' ';
                    String excepcionsSi = "si s", excepcionsNo = "no n";
                    String targeta;


                    System.out.println("Venvingut a la opcio 1: Venda d ’ entrades");

                    //-------------------Inici preguntes--------------------

                    //nom-------------------------

                    do {
                        comprovant = true;
                        System.out.println("Introdueix el nom del visitant Nom: ");
                        nom = sc.nextLine();
                        for (int i = 0; i < nom.length(); i++) {
                            char caracter = nom.charAt(i);
                            if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                                comprovant = false;
                                i = nom.length();
                            }
                        }
                    } while (nom.isEmpty() || !comprovant);

                    //cognom1------------------

                    do {
                        comprovant = true;
                        System.out.println("Introdueix el primer Cognomom: ");
                        cognom1 = sc.nextLine();
                        for (int i = 0; i < cognom1.length(); i++) {
                            char caracter = cognom1.charAt(i);
                            if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                                comprovant = false;
                                i = cognom1.length();
                            }
                        }
                    } while (cognom1.isEmpty() || !comprovant);

                    //cognom2------------------

                    do {
                        comprovant = true;
                        System.out.println("Introdueix el segon cognomom: ");
                        cognom2 = sc.nextLine();
                        for (int i = 0; i < cognom2.length(); i++) {
                            char caracter = cognom2.charAt(i);
                            if (!Character.isLetter(caracter) && !Character.isWhitespace(caracter)) {
                                comprovant = false;
                                i = cognom2.length();
                            }
                        }
                    } while (cognom2.isEmpty() || !comprovant);

                    //edat------------------
                    do {
                        comprovant = true;
                        System.out.println("Introdueix la edat: ");
                        edat = sc.nextLine();
                        if (edat.length() <= 2) {
                            for (int i = 0; i < edat.length(); i++) {
                                char caracter = edat.charAt(i);
                                if (!Character.isDigit(caracter)) {
                                    comprovant = false;
                                    i = edat.length();
                                }
                            }
                        } else {
                            comprovant = false;
                        }
                    } while (edat.isEmpty() || !comprovant);
                    int edatInt = Integer.parseInt(edat);

                    //Discapacitat-------------------

                    if (edatInt <= 3) {
                        gratuitaBolean = true;
                    } else if (edatInt < 12) {
                        descompteBolean = true;
                        do {
                            comprovant = true;
                            System.out.println("Te algun tipus de discapacitat?: ");
                            discapacitatString = sc.nextLine();
                            discapacitatString = discapacitatString.toLowerCase();
                            if (!excepcionsSi.contains(discapacitatString) && !excepcionsNo.contains(discapacitatString)) {
                                comprovant = false;
                            } else if (discapacitatString.equalsIgnoreCase("o") || discapacitatString.equalsIgnoreCase("i")) {
                                comprovant = false;
                            }
                        } while (discapacitatString.isEmpty() || !comprovant);

                        if (excepcionsSi.contains(discapacitatString)) {
                            gratuitaBolean = true;
                        }

                    } else {
                        do {
                            comprovant = true;
                            System.out.println("Te algun tipus de discapacitat?: ");
                            discapacitatString = sc.nextLine();
                            discapacitatString = discapacitatString.toLowerCase();
                            if (!excepcionsSi.contains(discapacitatString) && !excepcionsNo.contains(discapacitatString)) {
                                comprovant = false;
                            } else if (discapacitatString.equalsIgnoreCase("o") || discapacitatString.equalsIgnoreCase("i")) {
                                comprovant = false;
                            }
                        } while (discapacitatString.isEmpty() || !comprovant);
                        if (excepcionsSi.contains(discapacitatString)) {
                            gratuitaBolean = true;
                        }

                        //VIP----------------------------
                        if (!gratuitaBolean) {
                            do {
                                comprovant = true;
                                System.out.println("Introdueix si te vip o no: ");
                                vipString = sc.nextLine();
                                vipString = vipString.toLowerCase();
                                if (!excepcionsSi.contains(vipString) && !excepcionsNo.contains(vipString)) {
                                    comprovant = false;
                                } else if (vipString.equalsIgnoreCase("o") || vipString.equalsIgnoreCase("i")) {
                                    comprovant = false;
                                }
                            } while (vipString.isEmpty() || !comprovant);
                            if (excepcionsSi.contains(vipString)) {
                                vipBolean = true;
                            }
                        }
                    }
                    //targeta------------------------

                    do {
                        comprovant = true;
                        System.out.println("Introdueix el numero de la targeta. En total han de ser 16 digits separats amb espais en blocs de  4. \nTargeta: ");
                        targeta = sc.nextLine();
                        if (targeta.length() == 19) {
                            for (int i = 0; i < targeta.length(); i++) {
                                char caracter = targeta.charAt(i);
                                if (i == 4 || i == 9 || i == 14) {
                                    if (!Character.isWhitespace(caracter)) {
                                        comprovant = false;
                                        i = targeta.length();
                                    }
                                } else {
                                    if (!Character.isDigit(caracter)) {
                                        comprovant = false;
                                        i = targeta.length();
                                    }
                                }
                            }
                        } else {
                            comprovant = false;
                        }
                    } while (!comprovant);

                    //-------------------Entrades---------------
                    if (gratuitaBolean) {
                        preuEntrada = entradaGratuita;
                        tipusEntrada = tipusGratuita;
                    } else if (descompteBolean) {
                        preuEntrada = (int) (entradaNormal * descompte);
                        tipusEntrada = tipusDescompe;
                    } else if (vipBolean) {
                        preuEntrada = (entradaNormal + suplementVIP);
                        tipusEntrada = tipusVip;
                    } else {
                        preuEntrada = entradaNormal;
                        tipusEntrada = tipusNormal;
                    }
                    //-------------------Fi Entrades---------------


                    //----------------Generar el número d'entrada----
                    char inicial_nom = Character.toUpperCase(nom.charAt(0));
                    inicial_c1 = Character.toUpperCase(cognom1.charAt(0));
                    inicial_c2 = Character.toUpperCase(cognom2.charAt(0));


                    // Incrementar el contador
                    String ceros;
                    if (contadorEntradas < 10) {
                        ceros = "00";
                    } else if (contadorEntradas < 100) {
                        ceros = "0";
                    } else {
                        ceros = "";
                    }

                    String numeroEntrada = "DAMW-" + inicial_nom + inicial_c1 + inicial_c2 + "-" + ceros + contadorEntradas;

                    //-------------------Fin preguntes--------------------

                    inicial_c1 = cognom1.charAt(0);
                    inicial_c2 = cognom2.charAt(0);

                    //-------------------Guadrar informacio---------------
                    tiquet = (linea + linea + "\n");
                    tiquet += "PARC D'ATRACCIONS DAM1" + "\n";
                    tiquet += "Número d'entrada: " + numeroEntrada + "\n";
                    tiquet += "Data i hora: " + data + " - " + time.withNano(0).withSecond(0) + "\n";
                    tiquet += "Nom del visitant: " + nom + " " + inicial_c1 + ". " + inicial_c2 + "." + "\n";
                    tiquet += "Targeta de credit: **** **** **** " + targeta.substring(15) + "\n";
                    tiquet += "Preu final: " + preuEntrada + "€" + "\n";
                    tiquet += "\nNombre d'atraccions: " + atraccions + "\n";
                    tiquet += "Nombre d'espectacles: " + espectacles + "\n";
                    if (vipBolean) {
                        tiquet += "Nombre de serveis VIP: " + serveisVIP + "\n";
                    } else {
                        tiquet += "Sense serveis VIP" + "\n";
                    }
                    tiquet += linea + linea;


                    System.out.println(tiquet);

                    informacio[contadorEntradas] = tiquet;
                    contadorEntradas++;


                    buidar = sc.nextLine();

                }
                case 2 -> {
                    boolean comprovant = false;
                    int num_entrada = -1;
                    String eleccio;
                    System.out.println("Venvingut a la opcio 2: Us de l’entrada");

                    do {
                        System.out.println("introdueix el numero de la teva entrada");
                        num_entrada = sc.nextInt();
                        buidar = sc.nextLine();
                    } while (num_entrada == -1 || informacio[num_entrada] == null);

                    System.out.println(informacio[num_entrada]);


                    String arrayseparat[] = new String[1000];
                    arrayseparat = informacio[num_entrada].split("\n");
//                        for (int i = 0; i < informacio[num_entrada].length(); i++){
//                            System.out.println(i + arrayseparat[i]);
//                        }

                    do {
                        System.out.println("A quina atraccio vols pujar?" + "\n" + "(a) = Atraccio, (e) = Espectacle, (v) = VIP (s)");
                        eleccio = sc.nextLine().toLowerCase();

                        switch (eleccio) {
                            case "a" -> arrayseparat[8] += 1;
                            case "e" -> arrayseparat[9] += 1;
                            case "v" -> {
                                if (arrayseparat[10].length() < 18) {
                                    System.out.println("no tens servei VIP, torna a intentar");
                                } else {
                                    serveisVIP++;
                                }
                            }
                            case "s" -> System.out.println("sortint del programa");
                        }
                        System.out.println(informacio[num_entrada]);
                    } while (!eleccio.equals("s"));
                }

                case 3 -> {
                    System.out.println("Venvingut a la opcio 3: Estad ´ı stiques del dia");

                }
                case 0 -> {
                    System.out.println("Sortint del programa, Fins aviat");
                }
                default -> System.out.println("Numero incorrecte\n");
                //---------------------Fi menu--------------
            }
        }
    }
}