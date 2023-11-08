package pl.projekt.USBDevice;

public class Mouse implements USBDevice {
    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mysz połączona");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mysz rozłączona");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
