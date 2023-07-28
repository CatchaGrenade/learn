package serializable;

import com.alibaba.fastjson.JSON;

public class JsonFiledSerialize {

    public static void main(String[] args) {
//        Person p = new Person();
        Person p = new Person(18, "马嘉祺");
        String str = JSON.toJSONString(p);
        System.out.println(str);
    }
}
