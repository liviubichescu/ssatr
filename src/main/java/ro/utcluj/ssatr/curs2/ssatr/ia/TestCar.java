/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs2.ssatr.ia;

public class TestCar {
    public static void main(String[] args) {
 
        // -> Vehicle speed is 3
        
        DieselCar d1 = new DieselCar("Audi", 5, "CJ88AUD");
        d1.accelerate();
        
        ElectricCar e1 = new ElectricCar("Nissan", 0, "CJ99NIS");
        e1.accelerate();
        
        Car x1 = new DieselCar("Dacia",1, "CJ77DAC");
        x1.accelerate();
        
        // --- Test equals for Sensor objects ---
        
        Sensor engineSpeedSensor1 = new Sensor(20, "Engine");
        Sensor engineSpeedSensor2 = new Sensor(40, "Engine");
        
        if (engineSpeedSensor1.equals(engineSpeedSensor2)) {
            System.out.println("Both sensor engine are egual!");
        }
        
        Sensor coolantSensor = new Sensor(40, "Coolant");
        
        if (engineSpeedSensor1.equals(coolantSensor)) {
            System.out.println("Compared sensors are not the same!");
        }
    }
}
