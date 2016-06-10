package module3.p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;



/**
 * Created by Serg-fam on 02.06.2016 on 10:06.
 */
public class Text extends Files {



    public Text() {


      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        File folder = new File("c:/new/");

        for (File file : folder.listFiles())
        {

            System.out.println(file.getName());
        }


    }

    @Override
    public String getName() {

        return "Txt" + '\n' +

                "folders = " + getName();
    }

}
