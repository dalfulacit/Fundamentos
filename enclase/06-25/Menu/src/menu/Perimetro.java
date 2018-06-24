
package menu;

import java.util.Scanner;


public class Perimetro {
    
    public Perimetro(){
        System.out.println("¿Desea encontrar el perimetro de que figura? 1 para Cuadrado, 2 para Rectángulo y 3 para Círculo: ");
        Scanner scanner = new Scanner (System.in);
        int inputP = scanner.nextInt();
        
        
        if (inputP == 1){
            System.out.println("Digite el tamaño de los lados: ");
            Scanner scanCP = new Scanner (System.in);
            int sidesCP = scanCP.nextInt();
            
            int respuestaCP = sidesCP * 4;
            
            System.out.println("El cuadrado tiene un perímetro de " + respuestaCP + "unidades");
            
            
        }else if (inputP == 2){
            System.out.println("Digite el tamaño del hancho: ");
            Scanner scanWP = new Scanner (System.in);
            int widthRP = scanWP.nextInt();
            
            System.out.println("Digite el tamaño del largo: ");
            Scanner scanLP = new Scanner (System.in);
            int lengthRP = scanLP.nextInt();
            
            int respuestaRP = (widthRP * 2) + (lengthRP *2);
            
            System.out.println("El rectángulo tiene un perímetro de " + respuestaRP + "unidades");
            
            
        }else if (inputP == 3){
            System.out.println("Digite el tamaño del radio: ");
            Scanner scanCirP = new Scanner (System.in);
            int CirP = scanCirP.nextInt();
            
            float pi = 3.14f;
            
            float respuestaCirP = CirP * 2 * pi;
            
            System.out.println("El círculo tiene un perímetro de " + respuestaCirP + "unidades");
        }
    }
}
