package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.flow.AfterDrummerJobNamed;
import com.elephantdrummer.annotation.flow.BeforeDrummerJobNamed;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.example.DictDrummerJob;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class FlowExample implements DrummerObservable{
	
	Logger log=Logger.getLogger(FlowExample.class.getSimpleName());
	
	/**
	 * Basic example how to use Drummer for simple period execution
	 */
	@DrummerJob(name=DictDrummerJob.EXAMPLE_JOB,every=@Every(second=20))
	public void helloWorld() {
		log.info("...this is main job execution");
	}
	@AfterDrummerJobNamed(name=DictDrummerJob.EXAMPLE_JOB,priority=1)
	public void after1() {
		log.info(">>>> this method is called AFTER job execution with priority1.");
	}
	
	@AfterDrummerJobNamed(name=DictDrummerJob.EXAMPLE_JOB,priority=2)
	public void after2() {
		log.info(">>>>>>>> this method is called AFTER job execution with priority2.");
	}
	
	@BeforeDrummerJobNamed(name=DictDrummerJob.EXAMPLE_JOB,priority=1)
	public void before1() {
		log.info(">>>>  this method is called BEFORE job execution with priority1.");
	}
	


}
