
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //int a;
        //int b;

       // int resultado;

        //System.out.println("Hola esto es una prueba para subir un proyecto en GIT");

        System.out.println("Se ha realizado otro cambio a nuestro Repositorio remoto");
        System.out.println("Se ha realizado otro cambio a nuestro repositorio");

       //resultado = 1 + 2;

        //System.out.println("El resultado es : "+ resultado);

        // Se crea el objeto tipo Scanner para el ingreso de datos al usuario.

        Scanner scanner = new Scanner(System.in);

        // Solicitamos el nombre del producto

        System.out.print("Ingere el nombre del Producto: ");
        String producto = scanner.nextLine();

        // Solicitamos el precio del producto al usuario

        System.out.println("Ingrese la cantidad del Producto: ");

        double precio = scanner.nextDouble();


        // Solicitamos la cantidad el producto que se va a comprar:

        System.out.print("Ingrese la cantidad del Producto Comprado:  ");



        int cantidad = scanner.nextInt();

        // Calculamos el precio a pagar

        double total = precio * cantidad;

        // Mostramos el resultado

        System.out.println("Producto: "+producto);
        System.out.println("Precio: "+precio);
        System.out.println("Total a Pagar: "+total);






    }
}