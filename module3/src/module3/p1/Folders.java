package module3.p1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 02.06.2016 on 10:08.
 */
public class Folders {


    private String path;


    public Folders() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Path to create a folder:");

        try {
            setPath(reader.readLine());

        } catch (IOException e) {

        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}

