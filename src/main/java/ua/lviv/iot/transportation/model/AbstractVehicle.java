package ua.lviv.iot.transportation.model;

public abstract class AbstractVehicle {

    private int capacity;
    
    public AbstractVehicle(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
