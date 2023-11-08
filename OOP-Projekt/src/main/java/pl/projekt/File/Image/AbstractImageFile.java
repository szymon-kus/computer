package pl.projekt.File.Image;

import pl.projekt.File.AbstractFile;
import pl.projekt.File.FileType;

public class AbstractImageFile extends AbstractFile {
    protected final String name;
    protected final int size;

    public AbstractImageFile(String name, int size) {
        super(name, size);
        this.name = name;
        this.size = size;
    }
    public FileType getType() {
        return FileType.IMAGE;
    }



}
