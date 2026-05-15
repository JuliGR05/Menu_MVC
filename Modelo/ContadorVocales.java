package Modelo;

public class ContadorVocales {
  public int contarVocales(String texto){
    int contador = 0;

    for (int i=0; i< texto.length(); i++){
        char letra = texto.charAt(i);
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
               letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){

                contador++;
    }
  }  
  return contador;
}
}
