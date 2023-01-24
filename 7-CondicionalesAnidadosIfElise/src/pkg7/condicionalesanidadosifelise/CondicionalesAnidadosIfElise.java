
package pkg7.condicionalesanidadosifelise;

public class CondicionalesAnidadosIfElise {

//Igual solo es asignacion de variable x=2
//Cuando comparamos dos valores tenemos que usar ==
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 15;
        
        if (num1 > num2 ) {
        System.out.println("El num1 es mayor que el num2");
        }
        else {
           if (num1 == num2){
               System.out.println("El num1 es igual al num2");
           }
           else {
               System.out.println("El num2 es mayor que el num1");
           }
        }
    
    }
}
                
