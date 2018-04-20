package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.After;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.annotation.trigger.Before;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class CountingBackward implements DrummerObservable{
	
	Logger log=Logger.getLogger(CountingBackward.class.getSimpleName());
	

	
	@TestJob(executeJob=false)
	@DrummerJob(at=@At(day=-1))
	public void backward1() {
		log.info("The last day of month");
	}
	
	@TestJob(steps=30,executeJob=false)
	@DrummerJob(every=@Every(hour=8, after=@After(day=-5), before=@Before(day=-3)))
	public void backward2() {
		log.info("Every 8 hour from -5 day of month to -3 day of month");
	}
	

}
