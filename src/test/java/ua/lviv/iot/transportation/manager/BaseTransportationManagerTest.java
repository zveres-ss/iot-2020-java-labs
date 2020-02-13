package ua.lviv.iot.transportation.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.transportation.model.AbstractVehicle;
import ua.lviv.iot.transportation.model.Bus;

public abstract class BaseTransportationManagerTest {

    protected List<AbstractVehicle> buses;
    
    @BeforeEach
    public void createBuses() {
        buses = new LinkedList<AbstractVehicle>();
        buses.add(new Bus(50, null));
        buses.add(new Bus(100, null));
        buses.add(new Bus(6, null));
    }
}
