package Jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupTest {

    public static void main(String[] args) throws IOException {
        String path = JsoupTest.class.getClassLoader().getResource("text.xml").getPath();
        Document doc = Jsoup.parse(new File(path));
        Elements el = doc.getElementsByTag("name");
        System.out.println(el);

        String name = el.text();
        System.out.println(name);

        Document doc2 = Jsoup.parse("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "    <student>\n" +
                "        <name>陈世青</name>\n" +
                "        <age>28</age>\n" +
                "    </student>\n" +
                "</students>");

        Elements el2 = doc2.getElementsByTag("name");
        System.out.println(el2);

        String name2 = el2.text();
        System.out.println(name2);

        URL url = new URL("https://www.baidu.com/");
        Document doc3 = Jsoup.parse(url, 10000);

        Element el3 = doc3.getElementById("s_wrap");
        System.out.println(el3);

    }

}
