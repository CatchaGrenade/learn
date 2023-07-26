package test001;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    static {
        System.out.println("22");
    }

    public static void main(String[] args) {
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

        String s1 = new String("aaa");
        System.out.println(s1.hashCode());

        String s2 = new String("aaa");
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("重地" == "通话");
        System.out.println("重地".equals("通话"));
    }
}
