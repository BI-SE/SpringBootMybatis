package com.example.demo.thread;

/**
 * 测试线程类
 *
 * @author ROG
 * @create 2017-10-16-13:58
 */
public class TestThread extends Thread{
    long time;

     TestThread(long time){
         this.time = time;
     }

     public void run(){
         System.out.println("this is running");
     }
    //测试github2
    public static void main(String[] args) {
        TestThread thread = new TestThread(155);
        thread.start();
    }


}
