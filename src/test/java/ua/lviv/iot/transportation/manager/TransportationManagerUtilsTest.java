package ua.lviv.iot.transportation.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.transportation.model.SortType;

public class TransportationManagerUtilsTest extends BaseTransportationManagerTest {
    
    @Test
    public void testSortingDescending() {
        //TransportationManagerUtils.sortByCapacity(buses, SortType.DESC);
        //assertEquals(100, buses.get(0).getCapacity());
        //assertEquals(50, buses.get(1).getCapacity());
        //assertEquals(6, buses.get(2).getCapacity());
    }
    
    @Test
    public void testSortEmptyList() {
        TransportationManagerUtils.sortByCapacity(null, SortType.DESC);
    }
}
