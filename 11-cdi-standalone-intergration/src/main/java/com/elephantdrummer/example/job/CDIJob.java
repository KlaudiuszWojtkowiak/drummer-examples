package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

@ApplicationScoped
public class CDIJob implements DrummerObservable{
	
	Logger log=Logger.getLogger(CDIJob.class.getName());
	
	@DrummerJob(every=@Every(second=10))
	public void jeeJobMethod() {
		log.info("i'm a cdi standalone job");
	}

}
