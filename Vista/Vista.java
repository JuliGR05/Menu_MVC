package Vista;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner (System.in);
    public int mostrarMenu(){
    System.out.println("Por favor escoja el ejercicio que quiera ejecutar");    
    System.out.println("1. Validación contraseña");
    System.out.println("2. Factorial");
    System.out.println("3. Mayor y menor");
    System.out.println("4. Conteo de vocales");
    System.out.println("5. Fibonacci");
    System.out.println("6. Salir");

    return scanner.nextInt();    
}

    public int pedirNumero(String mensaje){
    System.out.println(mensaje);
    return scanner.nextInt();   
    }

    public String pedirContrasena(){
    System.out.println("Ingrese la contraseña con 8 o más caracteres");
    return scanner.next();    
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public String pedirTexto(){
        scanner.nextLine();
        System.out.println("Ingrese el texto");
        return scanner.nextLine();
    }

}
