package test001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("a.txt");
            try {
                fs.write(87);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (fs != null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
