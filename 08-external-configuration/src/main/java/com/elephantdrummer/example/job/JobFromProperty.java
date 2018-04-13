package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.scope.DrummerObservable;

public class JobFromProperty implements DrummerObservable{
	
	Logger log=Logger.getLogger(JobFromProperty.class.getSimpleName());
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.EVERY_10_SECONDS)
	public void job() {
		log.info("properties based job named: "+DictDrummerJob.EVERY_10_SECONDS+" has been executed.");
	}
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.EVERY_3_OR_4_SECONDS)
	public void job2() {
		log.info("properties based job named: "+DictDrummerJob.EVERY_3_OR_4_SECONDS+" has been executed.");
	}
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.AT_10_SECOND_TWO_THREADS)
	public void job3() {
		log.info("properties based job named: "+DictDrummerJob.AT_10_SECOND_TWO_THREADS+" has been executed.");
	}

}