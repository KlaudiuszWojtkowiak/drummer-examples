package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class CronExample implements DrummerObservable{
	
	Logger log=Logger.getLogger(CronExample.class.getSimpleName());
	
	
	@TestJob(executeJob=false)
	@DrummerJob(cron="0/15 * * * * ?")
	public void cron1() {
		log.info("Every 15 seconds");
	}
	
	@TestJob(executeJob=false)
	@DrummerJob(cron= {
			"0/15 * * * * ?",
			"0/7 * * * * ?",
			"0/3 * * * * ?"
			})
	public void cron2() {
		log.info("Every 15 or 7 or 3 seconds");
	}
	
	
	@TestJob(executeJob=false)
	@DrummerJob(cron="0 15 10 ? * 6L")
	public void cron3() {
		log.info("Fire at 10:15 AM on the last Friday of every month");
	}
	

	

}
