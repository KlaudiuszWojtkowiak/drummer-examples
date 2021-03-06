package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.DayOfWeek;
import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.After;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.annotation.trigger.TimeZoneEnum;
import com.elephantdrummer.scope.DrummerObservable;

public class Examples implements DrummerObservable{
	
	
	Logger log=Logger.getLogger(Examples.class.getSimpleName());
	
	@TestJob(executeJob=false)
	@DrummerJob(at={@At(second=2),@At(second=30)})
	public void test01() {
		
	}
	
	@TestJob(executeJob=false)
	@DrummerJob(at= @At(hour=2,timezone=TimeZoneEnum.AMERICA_CHICAGO))
	public void test02() {
		
	}
	
	@TestJob(executeJob=false)
	@DrummerJob(at=@At(hour=10,minute=14,second=30,dayOfWeek=DayOfWeek.FRIDAY))
	public void test03() {
		
	}

}
