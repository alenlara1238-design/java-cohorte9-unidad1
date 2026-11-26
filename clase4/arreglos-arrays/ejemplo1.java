import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Definna la cantidad de comentarios a guardar: ");
        int longitud = lector.nextInt();

        //limpieza de buffer.
        lector.nextLine();

        String[] comentarios = new String[longitud];

        /* 
        comentarios[0] = "Excelente video";
        comentarios[1] = "Great...!";
        comentarios[2] = "Muy util...";
        comentarios[3] = "Excelente video";
        comentarios[4] = "Great...!";
        comentarios[5] = "Muy util..."; */

        for(int i = 0; i < longitud; i++){
            System.out.println("comentario " + i + ":");
            comentarios[i] = lector.nextLine();
        }

        //for: recorrer el arreglo de principio a fin.
        for(String comentario: comentarios){
            System.out.println(comentario);
        }

    }


}