package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.trigger.After;
import com.elephant.drummer.annotation.trigger.Before;
import com.elephant.drummer.annotation.trigger.Every;
import com.elephant.drummer.annotation.trigger.Range;
import com.elephant.drummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class PeriodExamples implements DrummerObservable{
	
	Logger log=Logger.getLogger(PeriodExamples.class.getSimpleName());
	

	@DrummerJob(every=@Every(second=100))
	public void unlimitedValues() {
		log.info("This job is running every 100 seconds. So that you can configure your jobs without time limits.");
	}
	
	@DrummerJob(every=@Every(second=30),shift=@Range(second=20))
	public void shift() {
		log.info("Every 30 seconds, but with shift up to 20 seconds. So that your execution will be shifted by random time from this range.");
	}
	
	
	@DrummerJob(every=@Every(second=5,after=@After(second=20),before=@Before(second=40)))
	public void afterandbefore() {
		log.info("Every 5 seconds, but after 20 and before 40 second of each minute.");
	}
	

}
