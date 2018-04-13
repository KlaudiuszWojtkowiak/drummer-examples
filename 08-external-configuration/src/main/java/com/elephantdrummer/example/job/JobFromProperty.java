package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.scope.DrummerObservable;

public class JobFromProperty implements DrummerObservable{
	
	Logger log=Logger.getLogger(JobFromProperty.class.getSimpleName());
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.FIRST)
	public void job() {
		log.info("properties based job named: "+DictDrummerJob.FIRST+" has been executed.");
	}
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.SECOND)
	public void job2() {
		log.info("properties based job named: "+DictDrummerJob.SECOND+" has been executed.");
	}
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.THIRD)
	public void job3() {
		log.info("properties based job named: "+DictDrummerJob.THIRD+" has been executed.");
	}

}
