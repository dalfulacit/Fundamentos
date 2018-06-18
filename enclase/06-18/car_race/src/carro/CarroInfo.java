
package carro;


public class CarroInfo {

    private String brand;
    private int horsepower;
    private int meters;
    private int year;

        public CarroInfo(String brand, int year, int horse_power) {
        this.brand = brand;
        this.year = year;
        this.horsepower = horsepower;
        this.meters = 0;
    }

        public String Brand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int HPower() {
            return horsepower;
        }

        public void setHPower(int horse_power) {
            this.horsepower = horsepower;
        }
        
        public int Year() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int Meters() {
            return meters;
        }

        public void setMeters(int Advanced_Meters) {
            this.meters =  meters;
        }

        public void CarRace() {
            meters = meters + ((int) (Math.random() * 2) * this.horsepower);
            System.out.println("El auto: " + this.brand + " ha avanzado: " + this.meters + " metros");
        }
        
    }
