package module3.p1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg-fam on 02.06.2016 on 9:22.
 */
public class Files {


    private String name;
    private String type;
    private String yes;


    private List<String> fileName = new ArrayList<>();
    private List<String> fileType = new ArrayList<>();

    public Files() {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {


            System.out.println("Name to create file:");

            try {
                setName(reader.readLine());

                fileName.add(getName());

                for (String x : fileName) {

                    System.out.println(x);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("Type file: txt or 2 img or mp3,):");



            try {

                setType(reader.readLine());

                fileType.add(getType());

                for (String x : fileType) {

                    System.out.println(x);
                }

            } catch (IOException e) {
                e.printStackTrace();

            }

            fileName.add(getName());

            System.out.println("Create more files: y/n");
            try {
                yes = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (yes.equals("y"));

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

    public List<String> getFileName() {
        return fileName;
    }

    public void setFileName(List<String> fileName) {
        this.fileName = fileName;
    }

    public List<String> getFileType() {
        return fileType;
    }

    public void setFileType(List<String> fileType) {
        this.fileType = fileType;
    }
}