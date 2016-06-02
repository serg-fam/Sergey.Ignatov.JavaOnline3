package module3.p1;

import java.util.Date;

/**
 * Created by Serg-fam on 02.06.2016 on 9:22.
 */
public class File {

    private Date dateCreation;
    private String name;
    private String type;
    private float size;

    public File(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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


    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }


}