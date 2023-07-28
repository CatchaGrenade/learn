package serializable;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.txt"));

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);

        Person p = (Person) o;

        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.isCsq());
    }
}
