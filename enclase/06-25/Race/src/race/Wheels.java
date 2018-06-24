
package race;

public class Wheels {
    
    private float wheels_size;
    private String brand;
    
    public Wheels(String brand, float wheels_size){
        this.brand = brand;
        this.wheels_size = wheels_size;
    }
    
    public float getFactor(){
        return wheels_size/20;
        }
}
