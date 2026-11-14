public class CicloWhile {
    public static void main(String[] args) {
        double saldo = 150000;
        double precioProducto = 80000;


        while(saldo >= precioProducto){

            System.out.println("Compra realizada.");
            saldo = saldo - precioProducto;
            System.out.println("Saldo disponible: " + saldo);
        }

    }
}
