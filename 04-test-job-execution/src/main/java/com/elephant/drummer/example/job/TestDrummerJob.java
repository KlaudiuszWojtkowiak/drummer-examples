package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.trigger.Period;
import com.elephant.drummer.annotation.trigger.DateMask;
import com.elephant.drummer.annotation.TestJob;
import com.elephant.drummer.scope.DrummerObservable;

public class TestDrummerJob implements DrummerObservable{
	
	Logger log=Logger.getLogger(TestDrummerJob.class.getSimpleName());
	
	@TestJob
	@DrummerJob(every=@Period(minute=30))
	public void every30minutes() {
		log.info("This job is working every 30 minutes.");
	}
	
	@TestJob(steps=20)
	@DrummerJob(every=@Period(day=5))
	public void every5days20Steps() {
		log.info("This job is working every 5 days.");
	}
	
	@TestJob(at=@DateMask(year=2050))
	@DrummerJob(at=@DateMask(month=1,day=1,hour=0,minute=0,second=0))
	public void atHappyNewYearTestAfter2050() {
		log.info("This job is working every New Year.");
	}
	
	
	


}
