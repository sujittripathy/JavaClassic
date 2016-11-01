package sample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {

        long t= System.nanoTime();
        try(
                //FileInputStream fi=new FileInputStream("sample.txt");
                //FileOutputStream fo= new FileOutputStream("new.txt");

                //FileReader fi = new FileReader("LoremIpsum.txt");
                //FileWriter fo = new FileWriter("LoremIpsumNew.txt");

                //BufferedReader fi = new BufferedReader(new FileReader("LoremIpsum.txt"));
                //BufferedWriter fo = new BufferedWriter(new FileWriter("LoremIpsumNew.txt"));

                Scanner s=new Scanner(new BufferedReader(new FileReader("sample.txt")));
            )
        {
            /*int c;
            while ((c=fi.read())!= -1){
                //System.out.println(c);
                fo.write(c);
            }
*/          s.useDelimiter(",");
            while ((s.hasNext())){
                System.out.println(s.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Time Taken : " + (System.nanoTime() -t));
    }
}
