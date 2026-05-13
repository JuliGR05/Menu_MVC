package Modelo;

public class MayorMenor {

    private int mayor;
    private int menor;

    public void analizarNumero(int numero) {

        if (numero > mayor) {
            mayor = numero;
        }

        if (numero < menor) {
            menor = numero;
        }

    }

    public void iniciarValores(int numero) {
        mayor = numero;
        menor = numero;
    }

    public int getMayor() {
        return mayor;
    }

    public int getMenor() {
        return menor;
    }

}