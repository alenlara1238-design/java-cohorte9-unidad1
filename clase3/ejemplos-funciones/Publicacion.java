public class Publicacion {
   
    //atributo
    private int likes;
    private String comentario;

    //Constructor
    public Publicacion(){
        likes = 0;
        comentario = "";
    }

    //Setter: establecer un valor inicial al atributo comentario
    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    //Getter: devuelven el valor del atributo.
    public String getComentario(){
        return this.comentario;
    }



    //funciones (acciones)
    public void darLike(){
        
        //likes = likes + 1;
        likes++;
        
    }


    public void imprimirLikes(){
        System.out.println("likes: " + likes);
        
    }


    public void restarLikes(){
        likes--;
    }

    public void verificarPopularidad(){
        if(likes >= 100){
            System.out.println("la publicación es popular");
            imprimirLikes();
        }
        else{
            System.out.println("La publicación aun no es popular");
            imprimirLikes();
        }
        
    }

    private void eliminarLikes(){
        likes = 0;
    }

    public void editarLikes(int numeroLikes){
        likes = numeroLikes;
    }

}
