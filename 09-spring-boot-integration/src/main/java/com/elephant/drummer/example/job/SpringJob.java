package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.TestJob;
import com.elephant.drummer.annotation.trigger.On;
import com.elephant.drummer.scope.DrummerObservable;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringJob implements DrummerObservable{

	Logger log=Logger.getLogger(SpringJob.class.getSimpleName());
	
	@TestJob
	@DrummerJob(on=@On(second=1))
	public void test() {
		log.info("Spring Job at 1 second");
	}
}
