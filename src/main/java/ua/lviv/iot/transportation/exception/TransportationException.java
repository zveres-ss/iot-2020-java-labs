package ua.lviv.iot.transportation.exception;

public class TransportationException extends Exception {

    public TransportationException(String message) {
        super(message);
    }

    public TransportationException(RuntimeException e) {
        super(e);
    }

    private static final long serialVersionUID = 1L;

}
