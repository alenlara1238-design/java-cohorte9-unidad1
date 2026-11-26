import java.util.ArrayList;
import java.util.List;

public class Video {
    //atributos
    private String titulo;
    private String autor;
    private List<Comentario> comentarios;


    public Video(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.comentarios =  new ArrayList<>(); //aqui la lista arranca con longitud cero.
    }

    public void agregarComentario(String autorComentario, String texto){
        Comentario co1 = new Comentario(autorComentario, texto);
        this.comentarios.add(co1);
    }



}
