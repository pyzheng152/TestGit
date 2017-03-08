package com.amarsoft.a.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Run4 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		runSchedule();
		List list = new ArrayList<String>();
		list.add("ni");
		list.add("hao");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			String tempString = (String) iterator.next();
			Thread.sleep(1000);
			System.out.println(tempString);
		}
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("000");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
	public static void runSchedule(){
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("nihao + hello");
			}
		};
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		service.scheduleAtFixedRate(runnable, 5, 1, TimeUnit.SECONDS);
	}
	public static void runTime(){
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}
		};
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	}
	public static void runSleep(){
		final long interval = 1000;
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(interval);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("nihao");
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
