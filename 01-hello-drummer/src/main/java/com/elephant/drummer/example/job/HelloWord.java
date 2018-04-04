package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.trigger.Every;
import com.elephant.drummer.scope.DrummerObservable;

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
	@DrummerJob(every=@Every(second=10))
	public void helloWorld() {
		log.info("Hello! Your first Drummer Job is working!");
	}
	

}
