package stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();

        ls.add("1111");
        ls.add("2222");
        ls.add("3333");

        ls.stream().
                filter(str->str.equals("1111")).
                forEach(str-> System.out.println(str));

//        for (int i = 0; i < ls.size(); i++) {
//            System.out.println(ls.get(i));
//        }
    }
}
