package module3.p1;

/**
 * Created by Serg-fam on 02.06.2016 on 10:11.
 */
public class Runner {

    public static void main(String[] args) {

        Folder folder = new Folder("c:/temp/", "Wait");
        File text = new File("MyText", "Txt");
        File image = new File("MyImage", "Img");
        File audio = new File("MyAudio", "Audio");

        System.out.println(folder);
        System.out.println(text);
        System.out.println(image);
        System.out.println(audio);



    }
}
