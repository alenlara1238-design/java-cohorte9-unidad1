import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Indique el numero de veces que quieras repetir: ");
        
        int numeroDeRepetiiones = lector.nextInt();

        for (int i = 1; i <= numeroDeRepetiiones; i++) {
            System.out.println("Repetición " + i);

        }
    }
}
