package sample;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Sample {
    public static void main(String[] args) {
        //System.out.println('a' >> 1);
        ConcurrentHashMap<String,String> cm = new ConcurrentHashMap<>();
        cm.put("abc","a");
        cm.put("def","d");
        cm.put("ghi","g");

        System.out.println(cm);
        Map cm1= Collections.synchronizedMap(cm);
        System.out.println(cm1);

        AtomicInteger ai= new AtomicInteger(10);
        System.out.println(ai.incrementAndGet());
    }
}
