package pl.projekt.USBDevice;

public class MemoryStick implements USBDevice{
    private final String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    public void eject () {
        ejected = true;
        System.out.println("Karta pamięci odłączona");
    }

    @Override
    public boolean connect() {
        if (!ejected) {
            System.out.println("Karta pamięci podłączona");
            return true;
        } else {
            System.out.println("Odłącz najpierw kartę");
            return false;
        }
    }

    @Override
    public boolean disconnect() {
        System.out.println("Karta pamięci rozłączona");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
