package MusicShop;


/**
 * Created by Serg-fam on 10.06.2016 on 17:43.
 */
public class FilesNullException extends Exception {

    private String msg;

    public FilesNullException(String message){
        msg = message;
    }

    @Override
    public String getMessage(){
        return msg;
    }
}
