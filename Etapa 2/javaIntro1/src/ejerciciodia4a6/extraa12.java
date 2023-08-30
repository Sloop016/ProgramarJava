package ejerciciodia4a6;

/**
 *
 * @author gabyg
 */
public class extraa12 {
    public static void main(String[] args) {
        String numCadena1;
        String numcadena2;
        String numcadena3;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    numCadena1 = String.valueOf(i);
                    numcadena2 = String.valueOf(j);
                    numcadena3 = String.valueOf(k);
                    numCadena1 = numCadena1.replace("3", "E");
                    numcadena2 = numcadena2.replace("3", "E");
                    numcadena3 = numcadena3.replace("3", "E");
                    System.out.println(numCadena1 + "-" + numcadena2 + "-" + numcadena3);
                }
            }
        }
    }
}
