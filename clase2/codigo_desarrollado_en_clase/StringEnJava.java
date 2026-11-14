class StringEnJava {
    public static void main(String[] args) {
        
        
        String nombre = "Mariana";
        int edad = 22;

        System.out.println("Tu nombre es: " + nombre + ". Y tu edad es: " + edad);


        nombre = "Juan";
        System.out.println("Ahora tu nombre es: " + nombre + ". Y tu edad es: " + edad);


        final int MAX_INTENTOS = 3;
        //MAX_INTENTOS = 5; // Error: no se puede reasignar una variable final

    }
}