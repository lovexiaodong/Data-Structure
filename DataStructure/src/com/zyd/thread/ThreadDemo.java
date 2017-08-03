package com.zyd.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {

	public static void main(String[] args) {
		
		AtomicInteger integer = new AtomicInteger();
		System.out.println(integer.getAndIncrement());;
		System.out.println(integer.getAndIncrement());;
		
		ExecutorService services = Executors.newCachedThreadPool();
		int seconds = 30000;
//		for(int i= 0; i < 10; i ++) {
//			seconds -= 3000;
//			final int second = seconds;
//			services.execute(new Runnable() {
//				
//				@Override
//				public void run() {
//					
//					try {
//						Thread.sleep(second);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("This is i "  + second);
//				}
//			});
//		}
	}
}
