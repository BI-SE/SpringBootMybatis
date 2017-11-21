package com.example.demo.Lock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 *
 * @author ROG
 * @create 2017-10-17-11:53
 */
public class ReentTrantReadWriteLockTest {



    public static void main(String[] args) {

        quenWrite quenWrite = new  quenWrite();

        for(int i=0;i<3;i++)
            new Thread(() -> quenWrite.get(String.valueOf(1))).start();

        for(int i=0;i<3;i++) {
            new Thread(() -> quenWrite.put("1", "44545")).start();
        }

    }

    static class quenWrite{
        //读写锁
        private ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
        //读锁
        private Lock readLock  = rw.readLock();
        //写锁
        private  Lock writeLock = rw.writeLock();
        //缓存map
        private ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

        private String get(String key){
            //加读锁
            readLock.lock();
            System.out.println("加读锁");
            String value = null;
            try {
                 value = map.get(key);

                //为空则加入数据
                if(null==value){
                    //解锁
                    readLock.unlock();
                    System.out.println("解读锁");
                    writeLock.lock();
                    System.out.println("加写锁");
                    try {
                        value= String.valueOf(Math.random()*10000);
                        put(key,value);

                        System.out.println("添加数据："+value);

                    }finally {
                        writeLock.unlock();
                        System.out.println("解写锁");
                    }
                    readLock.lock();
                    System.out.println("加读锁");
                }
            }finally {
                readLock.unlock();
                System.out.println("解读锁");
            }
            return  value;
        }
        private String put(String key,String value){
            //加写锁
            writeLock.lock();
            System.out.println("加写锁");
            try {
                //加入数据
                map.put(key,value);
                System.out.println("添加数据："+value);
            }finally {
                writeLock.unlock();
                System.out.println("解写锁");
            }
            return  "SUCCESS";
        }
    }

}
