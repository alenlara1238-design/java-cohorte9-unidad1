public class Main {
    
    public static void main(String[] args) {

      Publicacion publi1 = new Publicacion();
      publi1.imprimirLikes();
      publi1.setComentario("Este video me gusta mucho. Felicidaes");
      System.out.println("Comentario: " + publi1.getComentario());
      publi1.imprimirLikes();
    }

}
