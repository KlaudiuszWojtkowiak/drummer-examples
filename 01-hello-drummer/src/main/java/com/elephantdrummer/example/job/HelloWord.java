package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

/**
 * 
 * @author Klaudiusz Wojtkowiak Elephant Software 2018
 *
 */
public class HelloWord implements DrummerObservable{
	
	Logger log=Logger.getLogger(HelloWord.class.getSimpleName());
	
	/**
	 * Basic example how to use Drummer for simple period execution
	 */
	@TestJob
	@DrummerJob(every=@Every(second=10))
	public void helloWorld() {
		log.info("Hello! Your first Drummer Job is working!");
	}
	

}
