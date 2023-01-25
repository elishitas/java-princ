package pkg15.vectoresrecorrido.cargaconclase;

import java.util.Scanner;

public class VectoresRecorridoCargaConClase {

    public static void main(String[] args) {
        
        //declaracion
        int vector[] = new int[4];

        //asinacion -por teclado-
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }

        //recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado: " + vector[i]);
            System.out.println("--------------------");
        }
    }

}
