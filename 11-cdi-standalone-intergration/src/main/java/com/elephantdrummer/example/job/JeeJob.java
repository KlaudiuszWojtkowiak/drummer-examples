package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.trigger.Every;
import com.elephant.drummer.scope.DrummerObservable;

@ApplicationScoped
public class JeeJob implements DrummerObservable{
	
	Logger log=Logger.getLogger(JeeJob.class.getName());
	
	@DrummerJob(every=@Every(second=10))
	public void jeeJobMethod() {
		log.info("i'm a cdi standalone job");
	}

}
