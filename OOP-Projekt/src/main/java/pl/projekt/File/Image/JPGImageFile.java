package pl.projekt.File.Image;

import pl.projekt.File.FileType;

public class JPGImageFile extends AbstractImageFile {
    private final int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }
    public int getCompression() {
        return compression;
    }
    public void showImage(){
        System.out.println("Wyświetlanie obrazka");
    }

}
