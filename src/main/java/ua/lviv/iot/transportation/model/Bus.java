package ua.lviv.iot.transportation.model;

public class Bus extends AbstractPublicTransport implements Comparable<Bus> {

    public Bus(int capacity, String producer) {
        super(capacity, producer);
    }

    @Override
    public int compareTo(Bus another) {
        return this.getCapacity() - another.getCapacity();
    }

}
