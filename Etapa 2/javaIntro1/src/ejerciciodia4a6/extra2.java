package ejerciciodia4a6;

/**
 */
public class extra2 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = B;
        System.out.println("La variable A vale " + A + ". La variable B vale " + B + ". La variable C vale " + C + ". La variable D vale " + D);
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("La variable A vale " + A + ". La variable B vale " + B + ". La variable C vale " + C + ". La variable D vale " + D);
    }
}
