package pkg18.matricesrecorrido.cargaporteclado;

import java.util.Scanner;

public class MatricesRecorridoCargaPorTeclado {

    public static void main(String[] args) {
        //declaracion / Inicialización
        int matriz [][] = new int [3][3]; // Fila / Columna

        Scanner teclado = new Scanner (System.in);
        
        //asinacion -teclado-
        for (int f = 0; f < 3; f ++){
            for(int c = 0 ;c < 3 ;c ++){
                System.out.println("Ingres el valor para la posicion f " + f + " c: " + c);
                matriz  [f][c] = teclado.nextInt();
            }
        }
        

        //recorrido

        //por cada fila recorro todas las columnas
        //for para reccorer las filas y otro para recorrer las columnas
        //matriz estructura estatica
        for (int f = 0; f < 3; f ++){
            for(int c = 0 ;c < 3 ;c ++){
                System.out.println("El valor de la posicion f: " + f + " c: " + c);
                System.out.println("Es de: " + matriz[f][c]);
            }
        }



    }
    
}