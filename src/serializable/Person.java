package serializable;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @JSONField(serialize = false)//添加此标记，在json序列化此类无参构造方法时就不会报错了
    public Boolean isCsq(){
        return this.name.equals("陈世青");
    }
}
