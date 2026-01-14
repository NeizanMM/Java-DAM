public class ex2 {
    public static void main(String[] args) {

        int llista[] = {5, 3, 1, 9, 7};
        int comptador = 0, peque, temp;

        for (int element : llista) { //recorre la tabla, entonces, teniendo
            peque = element;
            for (int i = 0; i < llista.length; i++) {
                if (peque > llista[i]) {
                    peque = llista[i];
                    temp = llista[0];
                    llista[0] = temp;
                    llista[0] = peque;
                    llista[i] = temp;
                } else {
                    i += 1;
                }
            }
                while (comptador < llista.length) {
                    System.out.println(llista[comptador]);
                    comptador++;
            }
        }
    }
}
