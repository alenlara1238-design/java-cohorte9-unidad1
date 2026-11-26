import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> comentarios = new ArrayList<>();

        comentarios.add("great...");
        comentarios.add("hola a todos");

       String comentarioPrivado=  comentarios.get(0);
       System.out.println(comentarios.get(1)); 

       
    }
}
