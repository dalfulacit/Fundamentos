
package randomnumber;

import java.util.Random;
import java.util.Scanner;



public class RandomNumber {


    public static void main(String[] args) {
        Random rand = new Random();
        int numero = rand.nextInt(100);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Adivine el número: ");
        int guess = scan.nextInt();
        
        while (guess != numero) {
            if(guess < numero){
                System.out.println("El número es muy bajo");
            }
            else if (guess > numero){
                System.out.println("El número es muy grande");
            } 
            System.out.print("\nAdivine el número: ");
            guess = scan.nextInt();
        }
        System.out.println("Correcto! El número era: " + numero);
    }
    
}
