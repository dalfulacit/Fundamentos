
package carro;

import java.util.Scanner;


public class Carro {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vehículo: ");
        int size = scanner.nextInt();
        System.out.println("Ingrese el numero de puertas traseras: ");
        int trasera = scanner.nextInt();
        Chasis chasis = new Chasis();
        Body body = new Body();
        if (size < 7){
            System.out.println("El tamaño es muy pequeño. Debe de ser mayor o igual a 7");
        }else{
        body.crearBody(size, trasera);
        chasis.crearChasis(size, trasera);
        }
    }
    
}
