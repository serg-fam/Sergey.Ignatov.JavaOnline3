package module3.p1;


import javax.swing.text.html.parser.Parser;
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
    private String pathFolder;
    private List<String> folderList = new ArrayList<>();


    public Folders() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        do {

            System.out.println("Path to create a folder:");

            try {

                setPath(reader.readLine());

                folderList.add(getPath());



            } catch (IOException e) {

            }


            System.out.println("Create more folders: y/n");
            try {

                yes = reader.readLine();
            } catch (IOException e) {

                e.printStackTrace();
            }


        } while (yes.equals("y"));


        for (String s : folderList) {


            System.out.println((folderList.lastIndexOf(s) + 1) + ". " + s);


        }

        System.out.print("Path folders for create files, ");
        System.out.println("1 - "+ folderList.size() + ":");


        try {

            pathFolder = folderList.get(Integer.parseInt(reader.readLine())-1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<String> folderList) {
        this.folderList = folderList;
    }

    public String getPathFolder() {
        return pathFolder;
    }

    public void setPathFolder(String pathFolder) {
        this.pathFolder = pathFolder;
    }
}

