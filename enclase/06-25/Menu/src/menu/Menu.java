
package menu;

import java.util.Scanner;


public class Menu {


    public static void main(String[] args) {
        
        boolean valido = true;
        
        while (valido)
            System.out.println("¿Qué desea calcular? 1 para Perímetro, 2 para Area: ");
            Scanner menu1 = new Scanner(System.in);
            int PoA = menu1.nextInt();
            
            if (PoA == 1){
                Perimetro p = new Perimetro();
            }else if (PoA == 2){
                System.out.println("");
            }else{
                System.out.println("Error! Ingrese una opción válida");
                valido = false;
            }
        
    }

}
