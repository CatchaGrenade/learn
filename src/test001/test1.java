package test001;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    static {
        System.out.println("22");
    }

    public static void main(String[] args) {
        System.out.println("�ص�".hashCode());
        System.out.println("ͨ��".hashCode());

        String s1 = new String("aaa");
        System.out.println(s1.hashCode());

        String s2 = new String("aaa");
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("�ص�" == "ͨ��");
        System.out.println("�ص�".equals("ͨ��"));
    }
}
