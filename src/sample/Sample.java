package sample;

import java.util.*;
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

        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("hello",10);
        lhm.put("world",2);
        lhm.put("apple",99);
        lhm.put(null,199);
        System.out.println(lhm);
        System.out.println("LinkedHashMap --------------------");

        HashMap<String,Integer> hm= new HashMap<>();
        hm.put("hello",10);
        hm.put("world",2);
        hm.put("apple",99);
        hm.put("abc",null);
        System.out.println(hm);
        System.out.println("HashMap --------------------");

        Hashtable<String,Integer> ht= new Hashtable<>();
        ht.put("hello",10);
        ht.put("world",2);
        ht.put("apple",99);
        ht.put("abc",null);
        System.out.println(ht);

        System.out.println("--------------------");
        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("hello",10);
        tm.put("world",2);
        tm.put("apple",99);
        tm.put("aaron",99);
        tm.put(null,199);

        System.out.println(tm);
        //System.out.println(callMe("hello"));
        //System.out.println(callMe());

    }

    private static String callMe(String... a){
        try{
            if(true){
                return "TRUE";
            }
            System.out.println(Thread.currentThread().getStackTrace().toString());
            for(int i=0;i<Thread.currentThread().getStackTrace().length;i++){
                System.out.println(Thread.currentThread().getStackTrace()[i]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("At the end...");
        }
        return "FALSE";
    }
}
