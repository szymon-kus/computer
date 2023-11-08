package pl.projekt.Drive;

import pl.projekt.File.File;

public interface Drive {
    void addFile (File file);
    void listFiles ();
    void deleteFiles ();

    File findFile(String fileName);
}
