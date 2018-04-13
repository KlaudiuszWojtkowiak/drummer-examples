package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DayOfWeek;
import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.scope.DrummerObservable;

public class Examples implements DrummerObservable{
	
	
	Logger log=Logger.getLogger(Examples.class.getSimpleName());
	
	@TestJob(executeJob=false)
	@DrummerJob(at= @At(hour=2,dayOfWeek=DayOfWeek.FRIDAY))
	public void test01() {
		
	}

}
