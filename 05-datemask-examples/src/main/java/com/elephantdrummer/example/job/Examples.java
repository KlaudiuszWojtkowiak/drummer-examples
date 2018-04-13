package com.elephant.drummer.example.job;

import java.util.logging.Logger;

import com.elephant.drummer.annotation.DayOfWeek;
import com.elephant.drummer.annotation.DrummerJob;
import com.elephant.drummer.annotation.TestJob;
import com.elephant.drummer.annotation.trigger.At;
import com.elephant.drummer.scope.DrummerObservable;

public class Examples implements DrummerObservable{
	
	
	Logger log=Logger.getLogger(Examples.class.getSimpleName());
	
	@TestJob(executeJob=false)
	@DrummerJob(at= @At(hour=2,dayOfWeek=DayOfWeek.FRIDAY))
	public void test01() {
		
	}

}
