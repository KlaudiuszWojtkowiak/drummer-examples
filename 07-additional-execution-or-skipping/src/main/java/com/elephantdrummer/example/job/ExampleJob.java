package com.elephantdrummer.example.job;

import java.util.Random;
import java.util.logging.Logger;

import com.elephantdrummer.DrummerStarter;
import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

public class ExampleJob implements DrummerObservable{
	
	Logger log=Logger.getLogger(ExampleJob.class.getSimpleName());
	
	
//	@DrummerJob(every=@Period(second=2),skipExecutionWhenPreviousJobIsRunning=true)
//	public void longTimeJob() {
//		log.info("this job is starts every 2 seconds in task:"+Thread.currentThread().getName()+" but the job need 5 seconds");
//		try {
//			Thread.sleep(3500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		log.info("Job execution has ended..");
//	}

	@TestJob
	@DrummerJob(trigger=MyTrig.class)
	public void test1() {
		System.out.println("aa");
	}
	
	@DrummerJob(every=@Every(second=5),skipExecutionWhenPreviousJobIsRunning=true,threads=2)
	public void longTimeJob2() {
		
		
		String threadname=Thread.currentThread().getName();
		log.info("this job starts every 5 seconds in task:"+threadname+" but the job need randomly 8-18 seconds");
		try {
			Random r=new Random();
			int l=8000+r.nextInt(10000);
			log.info(threadname+" is waiting "+ l+" miliseconds");
			Thread.sleep(l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("MultiThread execution has ended in task: "+threadname);
	}
}
