import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // esto se usa luego de leer un entero o numero.
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");


        System.out.println("Escribe tu apellido: ");
        String apellido = entrada.nextLine();

        entrada.close();
    }
}
