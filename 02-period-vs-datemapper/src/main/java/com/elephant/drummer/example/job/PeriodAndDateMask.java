package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.trigger.DateMask;
import com.elephant.drummer.annotation.trigger.Period;
import com.elephant.drummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class PeriodAndDateMask implements DrummerObservable{
	
	Logger log=Logger.getLogger(PeriodAndDateMask.class.getSimpleName());
	
	/**
	 * Every some period execution
	 */
	@DrummerJob(every=@Period(second=10))
	public void everyPeriod() {
		log.info("Every 10 second");
	}
	
	/**
	 * At some DateMask execution
	 */
	@DrummerJob(at=@DateMask(second=10))
	public void atDate() {
		log.info("At 10 second");
	}
	

}
