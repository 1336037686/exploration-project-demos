package com.lgx.chapter01;

import com.thoughtworks.xstream.XStream;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-31 16:08 <br>
 * @description: Main <br>
 */
public class Main {
    public static void main(String[] args) {
        XStream xstream = new XStream();

        // 配置，根据需要进行设置
        xstream.alias("person", Person.class); // 设置别名
        xstream.useAttributeFor(String.class); // 将字符串作为属性进行序列化

        // 序列化：
        // 使用 XStream 的 toXML 方法将 Java 对象序列化为 XML 字符串。
        System.out.println("------------- 序列化 --------------");
        Person person = new Person("Alice", 30);
        String xml = xstream.toXML(person);
        System.out.println(xml);

        // 反序列化：
        //使用 XStream 的 fromXML 方法将 XML 字符串反序列化为 Java 对象。
        System.out.println("------------- 反序列化 --------------");
        xml = "<person><name>Alice</name><age>30</age></person>";
        person = (Person) xstream.fromXML(xml);
        System.out.println(person.getName()); // 输出 "Alice"
    }
}