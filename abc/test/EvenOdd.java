package com.abc.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOdd {

public static void main(String[] args) throws InterruptedException {
        
        final Lock lock = new ReentrantLock();
        final Condition evenCondition =  lock.newCondition();
        final Condition oddCondition =  lock.newCondition();
        final CountDownLatch latch = new CountDownLatch(1);
        
        Thread odd = new Thread() {
            @Override
            public void run(){
                try{
                    lock.lock();
                  //  latch.countDown();
                    for(int i=1; i<=10; i=i+2){
                        System.out.println(Thread.currentThread().getName()+" ODD - " + i);
                        evenCondition.signalAll();
                        oddCondition.await();
                    }                    
                }
                catch(InterruptedException ex){
                    //ignore
                }
                finally{
                    evenCondition.signalAll();
                    lock.unlock();
                }
            }
        };
        
        Thread even = new Thread(){
            @Override
            public void run(){
                try{
                    lock.lock();
                    latch.countDown();
                    System.out.println("After countDown call");
                    for(int i=0; i<=10; i=i+2){
                        System.out.println(Thread.currentThread().getName() +" EVEN - " + i);
                        oddCondition.signalAll();
                        evenCondition.await(); 
                    }                    
                }
                catch(InterruptedException ex){
                    //ignore
                }
                finally{
                    oddCondition.signalAll();
                    lock.unlock();
                } 
            }
        };
        
        even.start();
        latch.await();
        odd.start();

    }

}
