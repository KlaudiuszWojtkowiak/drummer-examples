package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.trigger.After;
import com.elephantdrummer.annotation.trigger.Before;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.annotation.trigger.Range;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class EveryExamples implements DrummerObservable{
	
	Logger log=Logger.getLogger(EveryExamples.class.getSimpleName());
	

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
