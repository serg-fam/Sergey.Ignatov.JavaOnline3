package module3.p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 02.06.2016 on 14:24.
 */
public class FilesToFileSystem {

    String nameFiles;

    String pathFolder;

    String typeFiles;


    public FilesToFileSystem() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("path to create a folder:");

        try {
            pathFolder = reader.readLine();

        } catch (IOException e) {

        }


        System.out.println("Name to create file:");

        try {
            nameFiles = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Type file (txt or img or mp3):");

        try {
            typeFiles = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String nameFilesAll = ()
        File folder = new File(pathFolder);

        folder.mkdirs();

        File file = new File( pathFolder, (nameFiles+"."+typeFiles));

        try {

            file.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(pathFolder);
        System.out.println(nameFiles);
        System.out.println(typeFiles);


    }
}
