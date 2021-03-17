package com.csw;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 */
class Ticket{
    private int tickets = 100;
    private final Lock lock = new ReentrantLock();

    /**
     * 操作(对外暴露的调用方法)
     */
    public void saleTickets(){
        lock.lock();
        try{
            if(tickets!=0){
                System.out.println(Thread.currentThread().getName()
                        + "卖了第"+ tickets-- + "张票，还剩"+tickets+"张。");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}