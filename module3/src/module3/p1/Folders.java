package module3.p1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg-fam on 02.06.2016 on 10:08.
 */
public class Folders {


    private String path;
    private String yes;

    public Folders() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("Path to create a folder:");

            try {
                setPath(reader.readLine());

            } catch (IOException e) {

            }

            System.out.println("Create more folders: y/n");
            try {

                yes = reader.readLine();
            } catch (IOException e) {

                e.printStackTrace();
            }

        } while (yes.equals("y"));
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}

