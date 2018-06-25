
package carro;


public class Chasis {

    
        private void ruedas (int size, int puertaTrasera){
        System.out.print("-o-o");
//        if (size > 12){
//            System.out.print("-o");
//        }
        for (int j = 0; j < size - 3 + (puertaTrasera*2); j++){
            System.out.print("-");
        }
        System.out.print("o-'");
    }
        
        public void crearChasis(int size, int puertaTrasera){
            ruedas(size, puertaTrasera);
        }
}
