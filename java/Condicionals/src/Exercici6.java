import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int any;

        System.out.println("Indica el dia: ");
        dia = sc.nextInt();
        System.out.println("Indica el mes: ");
        mes = sc.nextInt();
        System.out.println("Indica el any: ");
        any = sc.nextInt();

        // gener-----
        if (mes == 1) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has intrduit el dia " + dia + " de gener del " + any);
            } else {
                System.out.println("dada incorrecta");
            }
        }

        // febrer
        if (mes == 2) {
            if (dia > 0 && dia < 28) {
                System.out.println("Has introduit el dia " + dia + " de febrer del " + any);
            } else {
                System.out.println("dia incorrecte");
            }
        }

        // març
        if (mes == 3) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + dia + " de març " + any);
            } else {
                System.out.println("Dada incorrecta");
            }
        }

        // abril
        if (mes == 4) {
            if (dia > 0 && dia < 30) {
                System.out.println("Has introduit el dia " + dia + " d'abril del " + any);
            } else {
                System.out.println("has introduit una dada incorrecta");
            }
        }

        // maig
        if (mes == 5) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + dia + " del mes de maig del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }

        //  juny
        if (mes == 6) {
            if (dia > 0 && dia < 30) {
                System.out.println("Has introduit el dia " + dia + " de juny del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }

        // juliol
        if (mes == 7) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + dia + " de juliol del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }

        // agost
        if (mes == 8) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + dia + " d'agost del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }

        // septembre
        if (mes == 9) {
            if (dia > 0 && dia < 30) {
                System.out.println("Has introduit el dia " + dia + " de septembre del " + any);
            } else {
                System.out.println("has introduit una dada icnorrecta");
            }
        }

        // octubre
        if (mes == 10) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + " d'octubre del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }

        // novembre
        if (mes == 11) {
            if (dia > 0 && dia < 30) {
                System.out.println("has introduit el dia " + dia + " de novembre del" + any);
            }
        }

        // decembre
        if (mes == 12) {
            if (dia > 0 && dia < 31) {
                System.out.println("Has introduit el dia " + dia + " de decembre del " + any);
            } else {
                System.out.println("Has introduit una dada incorrecta");
            }
        }
    }
}
