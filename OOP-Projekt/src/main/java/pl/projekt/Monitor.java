package pl.projekt;

import java.util.Scanner;
import java.util.TreeMap;

public class Monitor {
    private final String name;
    private int width;
    private int height;
    private int brightness;

    public Monitor(String name) {
        this.name = name;
        setHighResolution();
        this.brightness = 50;
    }

    public void setHighResolution() {
        width = 3840;
        height = 1920;
    }

    public void setMediumResolution() {
        width = 1920;
        height = 1080;
    }

    public void setLowResolution() {
        width = 1280;
        height = 1024;
    }

    public String getResolution() {
        return width + " X " + height;
    }

    public void setBrightness() {
        Scanner scanner = new Scanner(System.in);
        int brightness;
        while (true) {
            System.out.println("Ustaw jasność (0-100):");
            if (scanner.hasNextInt()) {
                brightness = scanner.nextInt();
                if (brightness >= 0 && brightness <= 100) {
                    System.out.println("Ustawiona jasność to: " + brightness);
                    break;
                } else {
                    System.out.println("Podaj poprawną wartość (0-100).");
                }
            } else {
                System.out.println("To nie jest poprawna wartość. Podaj liczbę (0-100).");
                scanner.next(); // Odrzucamy błędną wartość
            }
        }
    }
}