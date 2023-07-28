package serializable;


import java.io.FileOutputStream;

public class ObjectOutputStream {

    public static void main(String[] args) {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Person.txt"));


    }


}
