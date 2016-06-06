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


        for (String s : folders.getFolderList()) {


            System.out.println(s);
            File folder = new File(s);
            folder.mkdirs();


            for (String f : files.getFileName()) {

                System.out.println(f);

                for (String t : files.getFileType()) {

                    System.out.println(t);


                    File file = new File(s, (f) + "." + (t));

                    try {

                        file.createNewFile();

                    } catch (IOException e) {

                        e.printStackTrace();
                    }

                }
            }
        }

    }

    @Override
    public String toString() {

        return "FilesToFileSystem:" + '\n' +

                "folders = " + folders.getPath() + ',' + '\n' +

                "files = " + files.getName() + "." + files.getType();
    }
}
