package pl.projekt.USBDevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
