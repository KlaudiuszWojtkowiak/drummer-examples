package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class EveryVsAt implements DrummerObservable{
	
	Logger log=Logger.getLogger(EveryVsAt.class.getSimpleName());
	
	/**
	 * Every some period execution
	 */
	@TestJob
	@DrummerJob(every=@Every(minute=1))
	public void everyPeriod() {
		log.info("Every 1 minute");
	}
	
	/**
	 * At some DateTime execution
	 */
	@TestJob
	@DrummerJob(at=@At(minute=1))
	public void atDate() {
		log.info("At 1 minute of every hour");
	}
	

}
