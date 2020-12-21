package com.weblearner.springboot;

import java.time.LocalTime;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTaskScheduler {

	@Scheduled(fixedDelay = 10000)
	public void checkTime() {
		System.out.println("Current Time" + LocalTime.now());

	}

	@Scheduled(cron = "5 * * * * *")
	public void asyncThread() {
		SimpleAsyncTaskExecutor asyncTask = new SimpleAsyncTaskExecutor();
		for (int i = 0; i < 10; i++) {
			asyncTask.submit(() -> System.out.println("Thread name " + Thread.currentThread().getName()));
		}

	}

	@Scheduled(cron = "10 * * * * *")
	public void syncThread() {
		SyncTaskExecutor syncTask = new SyncTaskExecutor();
		for (int i = 0; i < 10; i++) {
			syncTask.execute(() -> System.out.println("Thread name " + Thread.currentThread().getName()));
		}

	}

}
