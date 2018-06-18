
package carro;

import java.util.ArrayList;


public class Carro {

    public Carro(String mazda, int par, int par1) {
    }


    public static void main(String[] args) {
        
        CarroInfo car1 = new CarroInfo("Ford", 1965, 140);
        CarroInfo car2 = new CarroInfo("Chevrolet", 1976, 200);
        CarroInfo car3 = new CarroInfo("Porsche", 1990, 110);
        
        ArrayList<CarroInfo> carList = new ArrayList<>();
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        int counter;
        counter = 0;
        
        
        
        while ((car1.Meters() < 1000) && (car2.Meters() < 1000) && (car3.Meters() < 1000)) {
            car1.CarRace();
            car2.CarRace();
            car3.CarRace();
            counter++;
            System.out.println("");
    }
        
        
        
        for (int i = 0; i < carList.size(); i++) {
            if (i == 0) {
                int a = i + 1;
                int b = i + 2;
                if (carList.get(i).Meters() > carList.get(a).Meters() && carList.get(i).Meters() > carList.get(b).Meters()) {
                    System.out.println("El carro ganador es: " + car1.Brand());
                }
            }
            
            
            
            if (i == 1) {
                int a = i - 1;
                int b = i + 1;
                if (carList.get(i).Meters() > carList.get(a).Meters() && carList.get(i).Meters() > carList.get(b).Meters()) {
                    System.out.println("El carro ganador es: " + car2.Brand());
                }
            }
            
            
            
            if (i == 2) {
                int a = i - 1;
                int b = i - 2;
                if (carList.get(i).Meters() > carList.get(a).Meters() && carList.get(i).Meters() > carList.get(b).Meters()) {
                    System.out.println("El carro ganador es: " + car3.Brand());
                }
            }
        }
    }
}




