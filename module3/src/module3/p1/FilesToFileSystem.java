package module3.p1;

import java.io.File;
import java.io.IOException;

/**
 * Created by Serg-fam on 02.06.2016 on 14:24.
 */
public class FilesToFileSystem {


    public FilesToFileSystem() {

        Folders folders = new Folders();
        Files files = new Files();

        File folder = new File(folders.getPath());

        folder.mkdirs();

        File file = new File(folder.getPath(), ((files.getName()) + "." + (files.getType())));

        try {

            file.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(folders.getPath());
        System.out.println(files.getName());
        System.out.println(files.getType());


    }
}
