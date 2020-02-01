package ua.lviv.iot.transportation.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.transportation.manager.TransportationManager;
import ua.lviv.iot.transportation.manager.TransportationManagerUtils;
import ua.lviv.iot.transportation.model.AbstractVehicle;
import ua.lviv.iot.transportation.model.SortType;


class TransportationManagerTest extends BaseTransportationManagerTest {
    
    private TransportationManager transportationManager;
    
    @BeforeEach
    public void setUp() {
        transportationManager = new TransportationManager();
        transportationManager.addTransports(buses);
    }
    
    @Test
    public void testFindWithCapacityGreaterThan() {
        
        List<AbstractVehicle> vehicles = transportationManager.findWithCapacityGreaterThan(20);
        assertEquals(2, vehicles.size());
        
        // sort result 
        
        // verify found buses capacity
        assertEquals(50, vehicles.get(0).getCapacity());
        assertEquals(100, vehicles.get(1).getCapacity());
    }

}
