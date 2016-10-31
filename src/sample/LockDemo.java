package sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        new LockThread(reentrantLock,"Thread - 1");
        new LockThread(reentrantLock,"Thread - 2");

    }
}

class Shared{
    public static int i =10;
}

class LockThread implements Runnable{
    String name;
    Lock lock;

    LockThread(ReentrantLock lock,String name){
        this.name = name;
        this.lock=lock;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("<<< Starting Thread >>>>: "+ name);

        try{
            System.out.println("Waiting to lock : " + name);
            lock.lock();
            Shared.i ++;
            System.out.println("Shared.i value : " + Shared.i);
            System.out.println("Thread goes to sleep : " + name);
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Unlocking Thread : " + name);
            lock.unlock();
        }
    }
}
