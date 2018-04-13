package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.scope.DrummerObservable;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringJob implements DrummerObservable{

	Logger log=Logger.getLogger(SpringJob.class.getSimpleName());
	
	@TestJob
	@DrummerJob(at=@At(second=1))
	public void test() {
		log.info("Spring Job at 1 second");
	}
}
