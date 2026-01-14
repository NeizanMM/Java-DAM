package inscaparrella.park;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

/*
 * Autors:
 * Neizan Montes de Oca Mateu
 * David Moreno Santiago
 * Eric Terrats Sanchez
 */

public class ai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String linea, guio = "*",buidar, tiquet,opcioString;
        final int EspaiInformacio = 1000;
        String informacio[] = new String[EspaiInformacio];
//        String dataOrdenat[];
        int opcioInt = 1, contadorEntradas = 0;;

        final int PosNumEntrada = 2, PosTipoEntrada = 6,PosPreu = 8, PosAtraccions = 9, PosEspectacles = 10, PosServeisVip = 11;


        while (opcioInt != 0) {

            System.out.println("---Menu de seleccio---");
            linea = guio.repeat(35);
            System.out.println(linea);
            System.out.println("Opcio: 0 - Sortir");
            System.out.println("Opcio: 1 - Venda d’entrades");
            System.out.println("Opcio: 2 - Us de l’entrada");
            System.out.println("Opcio: 3 - Estadistiques del dia");

            opcioString = sc.nextLine().strip();
            if (opcioString.length() == 1){
                int caracter = opcioString.charAt(0);
                if (Character.isDigit(caracter)){
                    opcioInt = caracter -  '0';
                }else{
                    opcioInt = -1;
                }
            } else {
                opcioInt = -1;
            }


            switch (opcioInt) {

                case 1 -> {
                    float preuEntrada;
                    final float EntradaNormal = 12, SuplementVIP = 4, EntradaGratuita = 0, Descompte = 0.50F;
                    final int EdadDescompte = 12, EdadGratuita = 3;
                    boolean gratuitaBolean = false, vipBolean = false, descompteBolean = false, comprovant;
                    String nom, cognom1, cognom2, edat, vipString, discapacitatString, noInicial;
                    String tipusNormal = "Normal", tipusDescompe = "Descompte", tipusGratuita = "Gratuita", tipusVip = "VIP",tipusEntrada;
                    char inicial_c1 = ' ', inicial_c2 = ' ', inicial;
                    final String ExcepcionsSi = "si s", ExcepcionsNo = "no n";
                    String targeta;
                    LocalTime time = LocalTime.now();
                    LocalDate data = LocalDate.now();
                    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
                    nom = nom.strip();
                    inicial = Character.toUpperCase(nom.charAt(0));
                    noInicial = nom.substring(1).toLowerCase();
                    nom = inicial + noInicial;

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
                    cognom1 = cognom1.strip();
                    inicial = Character.toUpperCase(cognom1.charAt(0));
                    noInicial = cognom1.substring(1).toLowerCase();
                    cognom1 = inicial + noInicial;

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
                    inicial = Character.toUpperCase(cognom2.charAt(0));
                    noInicial = cognom2.substring(1).toLowerCase();
                    cognom2 = inicial + noInicial;

                    //edat------------------
                    do {
                        comprovant = true;
                        System.out.println("Introdueix la edat: ");
                        edat = sc.nextLine();
                        edat = edat.strip();
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
                    if (edatInt <= EdadGratuita) {
                        gratuitaBolean = true;
                    }else if (edatInt <= EdadDescompte){
                        descompteBolean = true;

                        do {
                            comprovant = true;
                            System.out.println("Te algun tipus de discapacitat?: ");
                            discapacitatString = sc.nextLine();
                            discapacitatString = discapacitatString.toLowerCase();
                            if (!ExcepcionsSi.contains(discapacitatString) && !ExcepcionsNo.contains(discapacitatString)) {
                                comprovant = false;
                            } else if ("o".equalsIgnoreCase(discapacitatString) || "i".equalsIgnoreCase(discapacitatString)) {
                                comprovant = false;
                            }
                        } while (discapacitatString.isEmpty() || !comprovant);
                        if (ExcepcionsSi.contains(discapacitatString)){
                            gratuitaBolean = true;
                        }
                    }else {
                        do {
                            comprovant = true;
                            System.out.println("Te algun tipus de discapacitat?: ");
                            discapacitatString = sc.nextLine();
                            discapacitatString = discapacitatString.toLowerCase();
                            if (!ExcepcionsSi.contains(discapacitatString) && !ExcepcionsNo.contains(discapacitatString)) {
                                comprovant = false;
                            } else if ("o".equalsIgnoreCase(discapacitatString) || "i".equalsIgnoreCase(discapacitatString)) {
                                comprovant = false;
                            }
                        } while (discapacitatString.isEmpty() || !comprovant);
                        if (ExcepcionsSi.contains(discapacitatString)){
                            gratuitaBolean = true;
                        }

                        //VIP----------------------------
                        if (!gratuitaBolean) {
                            do {
                                comprovant = true;
                                System.out.println("Introdueix si te vip o no: ");
                                vipString = sc.nextLine();
                                vipString = vipString.toLowerCase();
                                if (!ExcepcionsSi.contains(vipString) && !ExcepcionsNo.contains(vipString)) {
                                    comprovant = false;
                                } else if ("o".equalsIgnoreCase(vipString) || "i".equalsIgnoreCase(vipString)) {
                                    comprovant = false;
                                }
                            } while (vipString.isEmpty() || !comprovant);
                            if (ExcepcionsSi.contains(vipString)){
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
                    if (gratuitaBolean){
                        preuEntrada = EntradaGratuita;
                        tipusEntrada = tipusGratuita;
                    } else if (descompteBolean) {
                        preuEntrada = (int)(EntradaNormal * Descompte);
                        tipusEntrada = tipusDescompe;
                    } else if (vipBolean){
                        preuEntrada = (EntradaNormal + SuplementVIP);
                        tipusEntrada = tipusVip;
                    } else {
                        preuEntrada = EntradaNormal;
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
                    //-------------------Inici guarda Informacio-----------------
                    {

                        tiquet = linea + "\t\n";
                        tiquet += "PARC D'ATRACCIONS DAM1\t\n";
                        tiquet += "Número d'entrada: " + numeroEntrada + "\t\n";
                        tiquet += "Data i hora: " + data.format(formatador) + " - " + time.withNano(0).withSecond(0) + "\t\n";
                        tiquet += "Nom del visitant: " + nom + " " + inicial_c1 + ". " + inicial_c2 + ".\t\n";
                        tiquet += "Edat: " + edat + " anys\t\n";
                        tiquet += "Tipus d'entrada: " + tipusEntrada + "\t\n";
                        tiquet += "Targeta de credit: **** **** **** " + targeta.substring(15) + "\t\n";
                        tiquet += "Preu final: " + String.format("%.2f", preuEntrada) + "€\t\n";
                        tiquet += "\nNombre d'atraccions: 0\t\n";
                        tiquet += "Nombre d'espectacles: 0\t\n";
                        if (vipBolean) {
                            tiquet += "Nombre de serveis VIP: 0\t\n";
                        } else {
                            tiquet += "No disponible\t\n";
                        }
                        tiquet += linea + "\t";

                        informacio[contadorEntradas] = tiquet;
                        System.out.println(informacio[contadorEntradas]);
                        buidar = sc.nextLine();
                        contadorEntradas++;
                    }
                    //-------------------Fin guarda Informacio-------------------
                }
                case 2 -> {
                    String informacioPersonal[];
                    String numEntrada = "",accioEntrada, stringnumEntrada;
                    final String accionsValides = "A a E e S s";
                    final String accionsValidesVip = "A a E e V v S s";
                    boolean surtir = false, comprovant;
                    int numEntradaInt, pos;


                    if (contadorEntradas > 0) {

                        System.out.println("Venvingut a la opcio 2: Us de l’entrada, (s) per sortir: ");

                        //-------------------Inici demanar numero entrada y que vol fer-------------------
                        do {
                            comprovant = true;
                            System.out.println("Introdueix el numero de l' entrada: ");
                            stringnumEntrada = sc.nextLine().strip();

                            if (stringnumEntrada.length() == 12) {
                                numEntrada = stringnumEntrada.substring(stringnumEntrada.length() - 3);

                                for (int i = 0; i < 3; i++) {
                                    char caracter = numEntrada.charAt(i);
                                    if (!Character.isDigit(caracter)) {
                                        comprovant = false;
                                        i = numEntrada.length();
                                    }
                                }
                                numEntradaInt = Integer.parseInt(numEntrada);
                                if (numEntradaInt >= contadorEntradas) {
                                    comprovant = false;
                                } else {
                                    informacioPersonal = informacio[numEntradaInt].split("\t");
                                    System.out.println(informacioPersonal[PosNumEntrada]);
                                    System.out.println(stringnumEntrada);
                                    if (!informacioPersonal[PosNumEntrada].contains(stringnumEntrada)){
                                        comprovant = false;
                                    }
                                }
                            } else if ("s".equalsIgnoreCase(stringnumEntrada)) {
                                surtir = true;
                            } else {
                                comprovant = false;
                            }
                        } while (!comprovant);
                        if (!surtir) {

                            numEntradaInt = Integer.parseInt(numEntrada);
                            informacioPersonal = informacio[numEntradaInt].split("\t");

                            do {
                                comprovant = true;
                                System.out.println("Atracció (A), Espectacle (E),  Servei VIP (V) o sortir (S): ");
                                accioEntrada = sc.nextLine();
                                if (informacioPersonal[PosServeisVip].length() < 15) {
                                    if (accioEntrada.length() != 1 || !accionsValides.contains(accioEntrada)) {
                                        comprovant = false;
                                    }
                                } else {
                                    if (accioEntrada.length() != 1 || !accionsValidesVip.contains(accioEntrada)) {
                                        comprovant = false;
                                    }
                                }
                            } while (!comprovant);
                            //-------------------Fin demanar numero entrada y que vol fer-------------------

                            //-------------------Inici modificar informacio entrada-------------------

                            int temporal;
                            String substringFixe;

                            //Opcio (a)-----------------------------------
                            if ("a".equalsIgnoreCase(accioEntrada)) {
                                pos = informacioPersonal[PosAtraccions].indexOf(":");
                                substringFixe = informacioPersonal[PosAtraccions].substring(0, pos + 2);
                                temporal = Integer.parseInt(informacioPersonal[PosAtraccions].substring(pos + 2)) + 1;
                                informacioPersonal[PosAtraccions] = substringFixe + temporal;

                                //Opcio (b)-----------------------------------
                            } else if ("e".equalsIgnoreCase(accioEntrada)) {
                                pos = informacioPersonal[PosEspectacles].indexOf(":");
                                substringFixe = informacioPersonal[PosEspectacles].substring(0, pos + 2);
                                temporal = Integer.parseInt(informacioPersonal[PosEspectacles].substring(pos + 2)) + 1;
                                informacioPersonal[PosEspectacles] = substringFixe + temporal;

                                //Opcio (v)-----------------------------------
                            } else if ("v".equalsIgnoreCase(accioEntrada)) {
                                pos = informacioPersonal[PosServeisVip].indexOf(":");
                                substringFixe = informacioPersonal[PosServeisVip].substring(0, pos + 2);
                                temporal = Integer.parseInt(informacioPersonal[PosServeisVip].substring(pos + 2)) + 1;
                                informacioPersonal[PosServeisVip] = substringFixe + temporal;

                                //Opcio (s)------------------------------------
                            } else if ("s".equalsIgnoreCase(accioEntrada)) {
                                surtir = true;
                                //Opcio (Error)-----------------------------------
                            } else {
                                System.out.println("ERROR");
                            }

                            if (!surtir) {

                                //Tiquet-----------------------------------
                                tiquet = String.join("\t", informacioPersonal);
                                informacio[numEntradaInt] = tiquet;
                                //-------------------Fin modificar informacio entrada --------------------

                                //-------------------Inici treure Informacio (tiquet)-------------------
                                System.out.println(informacio[numEntradaInt]);
                                buidar = sc.nextLine();
                                //-------------------Fin treure Informacio (Tiquet)-------------------
                            } else {
                                System.out.println("As surtit al menu principal \n");
                            }
                        } else {
                            System.out.println("As surtit al menu principal \n");
                        }
                    } else {
                        System.out.println("NO DISPONIBLE \n");
                    }
                }
                case 3 -> {
                    System.out.println("Venvingut a la opcio 3: Estadistiques del dia");
                    if (contadorEntradas > 0) {

                        int entradesVenudes = 0, entradesNormals = 0, entradesGratuites = 0, entradesDescompte = 0, entradesVIP = 0;
                        int totalAtraccions = 0, totalEspectacles = 0, totalServeisVIP = 0;
                        float recaptacioTotal = 0.0f;
                        LocalTime time = LocalTime.now();
                        LocalDate data = LocalDate.now();
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                        for (int i = 0; i < contadorEntradas; i++) {
                            entradesVenudes++;

                            String[] informacioPersonal = informacio[i].split("\t");

                            if (informacioPersonal[PosTipoEntrada].contains("Normal")) {
                                entradesNormals++;
                            } else if (informacioPersonal[PosTipoEntrada].contains("Gratuita")) {
                                entradesGratuites++;
                            } else if (informacioPersonal[PosTipoEntrada].contains("Descompte")) {
                                entradesDescompte++;
                            } else if (informacioPersonal[PosTipoEntrada].contains("VIP")) {
                                entradesVIP++;
                            }

                            int posAtraccions = informacioPersonal[PosAtraccions].indexOf(":");
                            String numAtraccionsStr = informacioPersonal[PosAtraccions].substring(posAtraccions + 2);
                            numAtraccionsStr = numAtraccionsStr.strip();
                            totalAtraccions += Integer.parseInt(numAtraccionsStr);

                            int posEspectacles = informacioPersonal[PosEspectacles].indexOf(":");
                            String numEspectaclesStr = informacioPersonal[PosEspectacles].substring(posEspectacles + 2);
                            numEspectaclesStr = numEspectaclesStr.strip();
                            totalEspectacles += Integer.parseInt(numEspectaclesStr);

                            if (informacioPersonal[PosServeisVip].contains(":")) {
                                int posServeisVIP = informacioPersonal[PosServeisVip].indexOf(":");
                                String numServeisVIPStr = informacioPersonal[PosServeisVip].substring(posServeisVIP + 2);
                                numServeisVIPStr = numServeisVIPStr.strip();
                                totalServeisVIP += Integer.parseInt(numServeisVIPStr);
                            }

                            int posPreu = informacioPersonal[PosPreu].indexOf(":");
                            String preuStr = informacioPersonal[PosPreu].substring(posPreu + 2);

                            preuStr = preuStr.replace("€", "");
                            preuStr = preuStr.strip();
                            recaptacioTotal += Float.parseFloat(preuStr);
                        }
                        System.out.println(linea);
                        System.out.println("ESTADÍSTIQUES PARC D'ATRACCIONS DAMW");
                        System.out.println("Data i hora d'extracció: " + data.format(formatador) + " - " + time.withNano(0).withSecond(0));
                        System.out.println("\nEntrades venudes: " + entradesVenudes);
                        System.out.println("Entrades normals: " + entradesNormals);
                        System.out.println("Entrades gratuïtes: " + entradesGratuites);
                        System.out.println("Entrades amb descompte: " + entradesDescompte);
                        System.out.println("Entrades VIP: " + entradesVIP);
                        System.out.println("\nNombre d'accessos a atraccions: " + totalAtraccions);
                        System.out.println("Nombre d'accessos a espectacles: " + totalEspectacles);
                        System.out.println("Nombre d'accessos a serveis VIP: " + totalServeisVIP);
                        System.out.println("\nRecaptació total: " + String.format("%.2f", recaptacioTotal) + "€");
                        System.out.println(linea + "\n");
                        buidar = sc.nextLine();
                    } else {
                        System.out.println("No hi ha entrades venudes avui.");
                    }
                }
                case 0 -> {
                    System.out.println("Sortint del programa, Fins aviat");
                }
                default -> System.out.println("Dada introduida incorrecta\n");
                //---------------------Fi menu--------------
            }
        }
    }
}