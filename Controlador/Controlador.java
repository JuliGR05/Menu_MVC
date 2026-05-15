package Controlador;

import Modelo.ContadorVocales;
import Modelo.Contrasena;
import Modelo.Factorial;
import Modelo.Fibonacci;
import Modelo.MayorMenor;
import Vista.Vista;

public class Controlador {
    Vista vista = new Vista();
    Contrasena contrasena = new Contrasena();
    Factorial factorial = new Factorial();
    MayorMenor mayorMenor = new MayorMenor(); 
    ContadorVocales contadorVocales = new ContadorVocales();
    Fibonacci fibonacci = new Fibonacci();

public void ejecutar (){
    int opcion;

    do {
    opcion= vista.mostrarMenu();
    switch (opcion){
        case 1: {
        String contrasenaUsuario = vista.pedirContrasena();
        boolean validarConUsuario = contrasena.validarContrasena(contrasenaUsuario);    
        if (validarConUsuario){
            vista.mostrarMensaje("Contraseña válida");
        } else {
            vista.mostrarMensaje("Contraseña inválida");
        }
        break;
    }

        case 2: {
        int n = vista.pedirNumero("Ingrese el número al que desea hallar su factorial");
        int resultado = factorial.calcularFactorial(n);
        vista.mostrarMensaje("El factorial de " + n + " es igual a " + resultado);
        break;
        }

        case 3: {

        int cantidad = vista.pedirNumero("¿Cuántos números desea analizar?");
        
        if(cantidad < 1){
            vista.mostrarMensaje("Debe ingresar mínimo 1 número");
            break;
        }
        
        int numero = vista.pedirNumero("Ingrese el primer número");
        mayorMenor.iniciarValores(numero);
        
        for(int i = 1; i < cantidad; i++){
            numero = vista.pedirNumero("Ingrese el siguiente número");
            mayorMenor.analizarNumero(numero);
        }

        vista.mostrarMensaje("El número mayor es: " + mayorMenor.getMayor());
        vista.mostrarMensaje("El número menor es: " + mayorMenor.getMenor());

        break;
    }

        case 4: {
        String texto = vista.pedirTexto();
        int cantidadVocales = contadorVocales.contarVocales(texto);
        vista.mostrarMensaje("La cantidad de vocales del texto son " + cantidadVocales );
        break;
        }

        case 5: {
        int n = vista.pedirNumero("Ingrese la cantidad de elementos para la serie de Fibonacci");
        String serie = fibonacci.generarFibonacci(n);
        vista.mostrarMensaje("Serie Fibonacci: " + serie);

        break;
        }

        case 6: {
            vista.mostrarMensaje("Saliendo...");
                    break;
        }
        default:
            vista.mostrarMensaje("Opción inválida");
    }
    
} while (opcion != 6);
}

}
