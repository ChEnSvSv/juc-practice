package com.csw;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 3个售票员同时买100票
 *
 * 多线程编程的企业级套路 +模板
 * 	1. 在高内聚低耦合的前提下，线程     操作(对外暴露的调用方法)     资源类
 *
 * @author ChEnSv
 * @create 2021/3/16 21:00
 */
public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //大于票数
        int size = 101;
        //线程
        new Thread(()->{
            for (int i = 0; i < size; i++) {
                ticket.saleTickets();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < size; i++) {
                ticket.saleTickets();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < size; i++) {
                ticket.saleTickets();
            }
        },"C").start();

        /**
         * 匿名内部类方式创建线程
         */
        /*  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < size; i++) {
                    ticket.saleTickets();
                }
            }
        },"AAAA");*/
    }

}

