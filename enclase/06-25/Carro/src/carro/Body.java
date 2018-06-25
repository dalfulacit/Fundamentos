
package carro;


public class Body {
    
        private void techo (int size, int puertaTrasera){
            System.out.print(" ");
            
            for(int j = 0; j < size + (puertaTrasera*2); j++){
                System.out.print("_");
            }
            System.out.print("\n");
    }
    
    private void puertas (int size, int puertaTrasera){
        System.out.print("|");
        for (int i = 0; i < puertaTrasera; i ++){
            System.out.print("[]");
        }
        for (int j = 0; j < size - 1 + (puertaTrasera); j++){
            System.out.print(" ");
        }
        System.out.println("\\");
    }
    
    public void crearBody(int size, int puertaTrasera){
        techo(size, puertaTrasera);
        puertas(size, puertaTrasera);
    }
}
