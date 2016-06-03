package module3.p1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 02.06.2016 on 9:22.
 */
public class Files {


    private String name;
    private String type;


    public Files() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name to create file:");

        try {
            setName(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Type file (txt or img or mp3):");

        try {
            setType(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}