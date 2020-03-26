package com.dd.prac;

import com.practice.com.variable;
import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shipra on 17/4/18.
 */

class Key {
    String name;
    int age;

    Key() {

    }

    Key(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        System.out.println("=====================HASH CODE===================");
        return (int) name.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("===========EQUALS======================");
        return age == (((Key) obj).age);
    }
}

public class help {


    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(new Key("shipra"), 18);
        map.put(new Key("hipra"), 21);
        map.put(new Key("shaily"), 21);
        map.put(new Key("shaily"), 28);


        System.out.println("==========================" + map.get(new Key("shaily")));

    }
}
