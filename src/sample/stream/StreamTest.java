package sample.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        int i = 1;
        Random random = new Random();
        while(i<100){
            int r= random.nextInt(i);
            intList.add(r);
            //System.out.println(r);
            i++;
        }
       // System.out.println(intList);
       /* long ms1= System.currentTimeMillis();
        Collections.sort(intList);
        long ms2= System.currentTimeMillis();
        System.out.println("Time Taken : "+ (ms2-ms1));
        System.out.println(intList);*/

        long ms3= System.currentTimeMillis();
        Stream<Integer> sortedInt=intList.stream().sorted();
        sortedInt.forEach(e -> System.out.println(e));
        long ms4= System.currentTimeMillis();
        System.out.println("Time Taken : "+ (ms4-ms3));
        System.out.println(intList);
        //   Stream<Integer> filterOdd=intList.stream().sorted().filter(e -> e%2 !=0).filter(e -> e>70);
      //  filterOdd.forEach(e -> System.out.println(e));
    }
}
