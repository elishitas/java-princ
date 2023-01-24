/*
 * x = 10 y z = 5
 * z = 5 y x = 10
 */
package ejerciciologica;


public class EjercicioLogica {

    public static void main(String[] args) {
        int num1, num2, aux;
        
        num1 = 35;
        num2 = 20;
        
        System.out.println("-----------antes------------");
        System.out.println("Imprimir num " + num1);
        System.out.println("Imprimir num2 " + num2);
        
        aux = num2;
        //20   20
        num2 = num1;
         //? = 35      
        num1 = aux;
        //? = 20
        
        System.out.println("-----------Ahora------------");
        System.out.println("Imprimir num " + num1);
        System.out.println("Imprimir num2 " + num2);
        
        

    }
    
}
