package module3.p1;

import java.util.Date;

/**
 * Created by Serg-fam on 02.06.2016 on 10:08.
 */
public class Folder {
    private String path;
    private String name;


    public Folder(String path, String name) {
        this.path = path;
        this.name = name;

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 }
