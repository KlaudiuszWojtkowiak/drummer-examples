package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

public class MultiThreating implements DrummerObservable{
	
	Logger log=Logger.getLogger(MultiThreating.class.getSimpleName());
	
	
	@DrummerJob(every=@Every(second=15),threads=4)
	public void myMultiThreadJob() {
		log.info("this is my big job, executed parallelly by 4 threads. Current Thread: "+Thread.currentThread().getName());
	}
	
	@DrummerJob(every=@Every(second=30),threads=2,cacheThreads=true)
	public void myMultiThreadJobCached() {
		log.info("cached execution by 2 cached threads. Cached threads execution might be delayed in case of overload. Current Thread: "+Thread.currentThread().getName());
	}

}
