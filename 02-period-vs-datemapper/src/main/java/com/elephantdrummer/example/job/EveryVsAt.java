package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class EveryAndAt implements DrummerObservable{
	
	Logger log=Logger.getLogger(EveryAndAt.class.getSimpleName());
	
	/**
	 * Every some period execution
	 */
	@DrummerJob(every=@Every(second=10))
	public void everyPeriod() {
		log.info("Every 10 second");
	}
	
	/**
	 * At some DateTime execution
	 */
	@DrummerJob(at=@At(second=10))
	public void atDate() {
		log.info("At 10 second");
	}
	

}
