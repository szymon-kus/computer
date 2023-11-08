package pl.projekt.Drive;

import pl.projekt.File.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HDDDrive implements Drive{

    List<File> files = new ArrayList<>();
    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public void deleteFiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do usunięcia");
        String userChoice = scanner.nextLine();

        for (File file : files) {
            if (file.getName().equals(userChoice)){
                files.remove(file);
                System.out.println("Usunięto plik " + userChoice);
                return;
            }
            System.out.println("Nie znaleziono pliku o nazwie: " + userChoice);
        }

        if (files.equals(userChoice)) {
            files.remove(userChoice);
            System.out.println("Usunięto plik: " + userChoice);
        } else {
            System.out.println("Nie znaleziono pliku o nazwie: " + userChoice);
        }

    }
    @Override
    public File findFile(String fileName) {
        for (File file : files) {
            if (fileName.equals(file.getName())){
                return file;
            }
        }
        return null;
    }
}
