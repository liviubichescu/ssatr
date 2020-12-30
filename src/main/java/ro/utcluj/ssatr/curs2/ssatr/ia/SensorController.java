package ro.utcluj.ssatr.curs2.ssatr.ia;

/**
 *
 * @author liviu.bichescu
 */
public class SensorController {
    public Sensor sensor;

    public SensorController(Sensor sensor) {
        this.sensor = sensor;
    }
    
    public void control(){
        if (this.sensor.value > 25) {
            System.out.println("ACTIVARE MOD RACIRE!");
        }
        if (this.sensor.value < 15) {
            System.out.println("ACTIVARE MOD INCALZIRE!");
        }
    }
}
