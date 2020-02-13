package ua.lviv.iot.transportation.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.transportation.exception.TransportationException;
import ua.lviv.iot.transportation.manager.TransportationManagerUtils.BusSorterByCapacity;
import ua.lviv.iot.transportation.manager.TransportationManagerUtils.BusSorterByProducer;
import ua.lviv.iot.transportation.model.AbstractVehicle;

public class TransportationManager {

    private List<AbstractVehicle> transports = new LinkedList<>();

    public void addTransports(List<AbstractVehicle> transports) {
        this.transports.addAll(transports);
    }

    public void addTransport(AbstractVehicle transport) {
        this.transports.add(transport);
    }

    public List<AbstractVehicle> findWithCapacityGreaterThan(int capacity) {

        List<AbstractVehicle> result = new LinkedList<>();
        for (AbstractVehicle transport : transports) {
            if (transport.getCapacity() > capacity) {
                result.add(transport);
            }
        }
        return result;
    }

    public List<AbstractVehicle> findBy(String producer) {
        List<AbstractVehicle> result = new LinkedList<>();

        for (AbstractVehicle transport : transports) {
            String transportProducer = transport.getProducer();

            if (transportProducer == null)
                continue;

            if (transportProducer.equals(producer)) {
                result.add(transport);
            }
        }
        return result;
    }

    public List<AbstractVehicle> findByAnotherImplementation(String producer) {

        List<AbstractVehicle> result = new LinkedList<>();

        if (producer == null)
            return result;

        for (AbstractVehicle transport : transports) {

            if (producer.equals(transport.getProducer())) {
                result.add(transport);
            }
        }
        return result;
    }

    public List<AbstractVehicle> findByWithException(String producer) 
            throws TransportationException, NullPointerException {
        
        if (producer == null)
            throw new NullPointerException();
        
        throw new TransportationException(new RuntimeException());
    }

}











