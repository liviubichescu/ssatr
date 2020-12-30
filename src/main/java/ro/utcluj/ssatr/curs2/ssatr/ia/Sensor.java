package ro.utcluj.ssatr.curs2.ssatr.ia;

import java.util.Objects;

public class Sensor {
    //atribute
    public  int value;
    private String location;
    
    //constructori
    Sensor(int value, String location){
        this.value = value;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sensor other = (Sensor) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
}
