package ro.utcluj.ssatr.curs2.ssatr.ia;

public class OttoCar extends Car { //clasa derivata  

    
    public OttoCar(String name, int speed, String plateNumber) {
        super(name, speed, plateNumber); //apelare constructor din calsa de baza
    }
    
    void accelerate(){ //suprascriere metoda
        speed+=3;
        System.out.println("Otto car speed is "+speed);
    }
}
