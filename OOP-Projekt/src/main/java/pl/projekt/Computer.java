package pl.projekt;

import pl.projekt.Drive.Drive;
import pl.projekt.File.File;
import pl.projekt.USBDevice.USBDevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBDevice> usbDevices = new ArrayList<>();
    public Computer(Monitor monitor, Drive drive){
        this.monitor = monitor;
        this.drive = drive;
    }

    public void addFile(File file) {
        drive.addFile(file);
    }

    public void listFiles() {
        drive.listFiles();
    }

    public void deleteFiles() {
        drive.deleteFiles();
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();
        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
        if (!isDisconnected) {
            System.out.println("Odłączyłeś urządzenie USB siłą.");
        }
    }

    public File findFile (String fileName) {
        return drive.findFile(fileName);
    }
}
