package primerodam;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Sumatorio sumatorio = new Sumatorio(); //Inicializo la variable sumatorio de clase Sumatorio
        Scanner scanner = new Scanner(System.in); // Variable para obtener la informacion del usuario por teclado
        String TEXTO_SALIDA_INICIO = " Introduzca un valor entre 1 y 1000 para calcular el sumatorio de los elementos pares (-1 para salir):";
        
        System.out.println(TEXTO_SALIDA_INICIO);
        int entrada = scanner.nextInt();
        while(entrada > 0){
	        double valor = sumatorio.sumarElementosParesConMaximo(entrada);
	        System.out.println("El resultado del sumatorio realizado es: "+valor+ " ." );
	        System.out.println(TEXTO_SALIDA_INICIO);
	        entrada = scanner.nextInt();
        }
        scanner.close();
    }
}
