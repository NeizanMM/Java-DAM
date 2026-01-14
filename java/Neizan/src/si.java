//import java.util.Scanner;
//
//public class si {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        String opcio;
//        int opcio = 1;
//        String buidar;
//
//        do {
//            System.out.println("Parque atraccion");
//            System.out.println("opcio1");
//            System.out.println("opcio2");
//            System.out.println("opcio3");
//            System.out.println("opcio 0");
//            System.out.println("\n" + "Tria una opcio: ");
//            opcio = sc.nextInt();
//            buidar = sc.nextLine();
//
//        } while (opcio == 0);
//
//
//        switch (opcio) {
//            case 1 -> {
//                String nom, cognom, cognom2, discapacitat, vip, inicialcog1, inicialcog2;
//                boolean comprovant = false;
//                int edat, targeta;
//                System.out.println("opcio 1");
//
//                //nom
//                do {
//                    comprovant = true;
//                    System.out.println("introdueix nom");
//                    nom = sc.nextLine();
//                    if (nom.isEmpty() || Character.isDigit(nom)) {
//                        comprovant = false;
//                    }
//
//                } while (!comprovant);
//
//
//
//                //cognom
//                do {
//                    comprovant = true;
//                    System.out.println("introdueix cognom");
//                    cognom = sc.nextLine().toUpperCase();
//                    if (cognom.isEmpty()) {
//                        comprovant = false;
//                    }
//                    inicialcog1 = String.valueOf(cognom.indexOf(0));
//
//                } while (!comprovant);
//
//
//                //cognom2
//                do {
//                    comprovant = true;
//                    System.out.println("introdueix cognom 2");
//                    cognom2 = sc.nextLine().toUpperCase();
//                    if (cognom2.isEmpty()) {
//                        comprovant = false;
//                    }
//                    inicialcog2 = cognom2;
//
//                } while (!comprovant);
//
//                //edat
//
//                //discap
//
//                //vip
//
//                //targeta
//
//                //sout
//                String tiquet[] = new String[1000];
//
//                System.out.println("nom" + nom);
//                System.out.println("cognom" + inicialcog1);
//                System.out.println("cognom2" + inicialcog2);
//
//
//            }
//            case 2 -> {
//                System.out.println("opcio 2");
//            }
//            case 3 -> {
//                System.out.println("opcio 3");
//            }
//            case 0 -> {
//                System.out.println("sortin del programa");
//            }
//        }
//    }
//}