
package pkg17.matricesrecorrido.carga;


public class MatricesRecorridoCarga {

    public static void main(String[] args) {
        //declaracion / Inicialización
        int matriz [][] = new int [3][3]; // Fila / Columna


        //asinacion -Manual-
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 228;
        matriz[2][2] = 24;

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