package ua.lviv.iot.transportation.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.transportation.model.AbstractVehicle;
import ua.lviv.iot.transportation.model.SortType;

public class TransportationManagerUtils {

    private static final BusSorterByCapacity VEHICLE_BY_CAPACITY_SORTER = new BusSorterByCapacity();

    public static void sortByCapacity(List<AbstractVehicle> transports, SortType sortType) {

        transports.sort(sortType == SortType.ASC ? VEHICLE_BY_CAPACITY_SORTER : VEHICLE_BY_CAPACITY_SORTER.reversed());
    }

    public static void sortByProducer(List<AbstractVehicle> transports, SortType sortType) {
        Comparator<AbstractVehicle> comparator = Comparator.comparing(AbstractVehicle::getProducer);
        transports.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
    }

    public static void sortByCapacityAndProducer(List<AbstractVehicle> transports, SortType sortType) {

        
        // anonymous inner class
        Comparator<AbstractVehicle> comparator = new Comparator<AbstractVehicle>() {

            @Override
            public int compare(AbstractVehicle firstVehicle, AbstractVehicle secondVehicle) {

                int capacityComparisonResult = firstVehicle.getCapacity() - secondVehicle.getCapacity();

                if (capacityComparisonResult != 0) {
                    return capacityComparisonResult;
                }

                return firstVehicle.getProducer().compareTo(secondVehicle.getProducer());

            }
        };
        transports.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
    }
    
    public static void sortByProducerAndCapacity(List<AbstractVehicle> transports, SortType sortType) {

        
        class ProducerAndCapacityComarator implements Comparator<AbstractVehicle> {

            @Override
            public int compare(AbstractVehicle firstVehicle, AbstractVehicle secondVehicle) {

                int capacityComparisonResult = firstVehicle.getCapacity() - secondVehicle.getCapacity();

                if (capacityComparisonResult != 0) {
                    return capacityComparisonResult;
                }

                return firstVehicle.getProducer().compareTo(secondVehicle.getProducer());

            }
        };
        
        
        Comparator<AbstractVehicle> comparator = new ProducerAndCapacityComarator();
        transports.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
    }
    
    

    class BusSorterByProducer implements Comparator<AbstractVehicle> {

        @Override
        public int compare(AbstractVehicle firstVehicle, AbstractVehicle secondVehicle) {
            return firstVehicle.getProducer().compareTo(secondVehicle.getProducer());
        }

    }

    static class BusSorterByCapacity implements Comparator<AbstractVehicle> {

        @Override
        public int compare(AbstractVehicle firstVehicle, AbstractVehicle secondVehicle) {
            return firstVehicle.getCapacity() - secondVehicle.getCapacity();
        }
    }

}
