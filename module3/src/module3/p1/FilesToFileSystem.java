package module3.p1;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serg-fam on 02.06.2016 on 14:24.
 */
public class FilesToFileSystem {

    Folders folders = new Folders();
    Files files = new Files();

    public FilesToFileSystem() throws IOException {


        File folder = new File(folders.getPath());

        folder.mkdirs();


        File file = new File(folder.getPath(), ((files.getName()) + "." + (files.getType())));

        try {

            file.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();
        }


    }

    @Override
    public String toString() {

        return "FilesToFileSystem:" + '\n' +

                "folders = " + folders.getPath() + ',' + '\n' +

                "files = " + files.getName() + "." + files.getType();
    }
}
