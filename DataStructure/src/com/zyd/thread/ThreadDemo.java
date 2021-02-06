//package com.zyd.thread;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class ThreadDemo {
//
//	private String str = "123";
//	public static void main(String[] args) {
//
//		new Thread(() -> {
//			System.out.println("test");
//        }).start();
//
//
//
//		AtomicInteger integer = new AtomicInteger();
//		System.out.println(integer.getAndIncrement());;
//		System.out.println(integer.getAndIncrement());;
//
//
//		FutureTask task = new FutureTask(new CallBackTest());
//
//	    new Thread(task).start();
//
//		try {
//			System.out.println(task.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
//
////		ThreadPoolExecutor service = new ThreadPoolExecutor(2, 10, 1000, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
//
////		executor.submit(()->{});
////		executor.execute(()->{});
//
////		executor.allowCoreThreadTimeOut(true);
//
////		ExecutorService service = Executors.newFixedThreadPool(2);
////		Executors.newCachedThreadPool();
//		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
//
//		service.schedule(()->{
//
//			try {
//				Thread.sleep(3000);
//				System.out.println(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}, 0, TimeUnit.MILLISECONDS );
//
//
//		service.schedule(()->{
//
//			try {
//				Thread.sleep(3000);
//				System.out.println(2);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}, 0, TimeUnit.MILLISECONDS );
//
//		service.schedule(()-> System.out.println(3), 1000, TimeUnit.MILLISECONDS );
//
//
//		List<Runnable> runnables = service.shutdownNow();
//		System.out.println(runnables.size());
//		System.out.println(service.isShutdown());
//
//
//		Optional<String> op = Optional.empty();
//		op.flatMap((x) -> Optional.of("123"));
//		System.out.println(op.orElse("456"));
//
////		service.shutdownNow();
////		service.isShutdown();
////		scheduledExecutorService.schedule(() -> {}, 10, TimeUnit.SECONDS);
////		scheduledExecutorService.scheduleAtFixedRate(()->{}, 2000, 1000, TimeUnit.SECONDS);
////
////		Executors.newSingleThreadExecutor()
////		service.execute(() -> {
////            try {
////                Thread.sleep(2000);
////				System.out.println(1);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        });
////		service.execute(() -> {
////			try {
////				Thread.sleep(2000);
////				System.out.println(2);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
////		});
////		service.execute(() -> {
////			System.out.println(3);
////		});
//	}
//
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
//}
