package pl.projekt.Drive;

import pl.projekt.File.File;

import java.util.*;

public class SSDDrive implements Drive {
    Scanner scanner = new Scanner(System.in);
    Map<String, File> files = new HashMap<>();
    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        Set<String> fileNames = files.keySet();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    @Override
    public void deleteFiles() {
        System.out.println("Podaj nazwę pliku do usunięcia");
        String userChoice = scanner.nextLine();

        if (files.containsKey(userChoice)) {
            files.remove(userChoice);
            System.out.println("Usunięto plik: " + userChoice);
        } else {
            System.out.println("Nie znaleziono pliku o nazwie: " + userChoice);
        }

    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }
}
