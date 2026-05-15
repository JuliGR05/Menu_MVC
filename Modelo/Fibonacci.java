package Modelo;

public class Fibonacci {
    public String generarFibonacci(int n){
    int anterior = 0;
        int auxiliar = 1;
        int num;

        if(n <= 0){
            return "No hay serie";
        }
        
        if(n == 1){
            return "1";
        }

        String serie = "1 ";

        for(int i = 1; i < n; i++){

            num = anterior + auxiliar;

            serie = serie + num + " ";

            anterior = auxiliar;
            auxiliar = num;
    
    } 
    return serie; 
}
}
