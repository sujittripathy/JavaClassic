package sample;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Sample {
    public static void main(String[] args) {
        //System.out.println('a' >> 1);
       /* ConcurrentHashMap<String,String> cm = new ConcurrentHashMap<>();
        cm.put("abc","a");
        cm.put("def","d");
        cm.put("ghi","g");

        System.out.println(cm);
        Map cm1= Collections.synchronizedMap(cm);
        System.out.println(cm1);

        AtomicInteger ai= new AtomicInteger(10);
        System.out.println(ai.incrementAndGet());*/
       StringBuilder builder = new StringBuilder("World");
       builder.insert(2,"Hello");
        System.out.println("String val > "+builder.toString());

        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("hello",10);
        lhm.put("world",2);
        lhm.put("apple",99);

        lhm.forEach((a,b) -> System.out.println(a));
        System.out.println("--------------------");
        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("hello",10);
        tm.put("world",2);
        tm.put("apple",99);

        tm.forEach((a,b) -> System.out.println(a));
    }
}
