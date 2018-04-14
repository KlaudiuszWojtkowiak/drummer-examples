package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.ConfigurationForDrummerJobNamed;
import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.classconfig.DrummerJobConfiguration;
import com.elephantdrummer.classconfig.JobClassConfig;
import com.elephantdrummer.classconfig.base.EveryConfig;
import com.elephantdrummer.scope.DrummerObservable;
import com.elephantdrummer.example.DictDrummerJob;

public class CustomTrigger implements DrummerObservable{
	
	Logger log=Logger.getLogger(CustomTrigger.class.getSimpleName());
	
	@TestJob
	@DrummerJob(name=DictDrummerJob.EXAMPLE_JOB)
	public void jobExecution() {
		log.info("test");
	}
	
	
	@ConfigurationForDrummerJobNamed(DictDrummerJob.EXAMPLE_JOB)
	public JobClassConfig jobConfiguration() {
		DrummerJobConfiguration d= new DrummerJobConfiguration()
				.every(EveryConfig.everySecond(15),EveryConfig.everyHour(1))
				;
		

		return d;
	}

}
