package com.elephantdrummer.example.job;

import com.elephantdrummer.annotation.DrummerJob;
import com.elephantdrummer.annotation.TestJob;
import com.elephantdrummer.annotation.trigger.After;
import com.elephantdrummer.annotation.trigger.At;
import com.elephantdrummer.annotation.trigger.Before;
import com.elephantdrummer.annotation.trigger.Every;
import com.elephantdrummer.scope.DrummerObservable;

public class EveryVsAtExtra implements DrummerObservable{
	
	
	
	/**
	 * Run job with following triggers:
	 * -every 40 minutes
	 * -every 15 minutes
	 * -at 4th minut of hour
	 * -at 14th minut of hour
	 * 
	 * TestJob printout:
	 * *** Step:1 for date: Fri Mar 23 13:19:01 CET 2018 next execution: Fri Mar 23 13:30:00 CET 2018 ***
	 * *** Step:2 for date: Fri Mar 23 13:30:00 CET 2018 next execution: Fri Mar 23 13:40:00 CET 2018 ***
	 * *** Step:3 for date: Fri Mar 23 13:40:00 CET 2018 next execution: Fri Mar 23 13:45:00 CET 2018 ***
	 * *** Step:4 for date: Fri Mar 23 13:45:00 CET 2018 next execution: Fri Mar 23 14:00:00 CET 2018 ***
	 * *** Step:5 for date: Fri Mar 23 14:00:00 CET 2018 next execution: Fri Mar 23 14:04:00 CET 2018 ***
	 * *** Step:6 for date: Fri Mar 23 14:04:00 CET 2018 next execution: Fri Mar 23 14:14:00 CET 2018 ***
	 * *** Step:7 for date: Fri Mar 23 14:14:00 CET 2018 next execution: Fri Mar 23 14:15:00 CET 2018 ***
	 * *** Step:8 for date: Fri Mar 23 14:15:00 CET 2018 next execution: Fri Mar 23 14:20:00 CET 2018 ***
	 * *** Step:9 for date: Fri Mar 23 14:20:00 CET 2018 next execution: Fri Mar 23 14:30:00 CET 2018 ***
	 * *** Step:10 for date: Fri Mar 23 14:30:00 CET 2018 next execution: Fri Mar 23 14:45:00 CET 2018 ***
	 */
	@TestJob(executeJob=false)
	@DrummerJob(
			every= { @Every(minute=40),@Every(minute=15) }, 
			at= { @At(minute=4),@At(minute=14) }
			)
	public void test01() {
		
	}

	
	/**
	 * Execute job every 10 seconds in first half of minute or every 11 seconds in second half of minute
	 * 
	 * TestJob printout:
	 * *** Step:1 for date: Fri Mar 23 13:40:23 CET 2018 next execution: Fri Mar 23 13:40:27 CET 2018 ***
	 * *** Step:2 for date: Fri Mar 23 13:40:27 CET 2018 next execution: Fri Mar 23 13:40:30 CET 2018 ***
	 * *** Step:3 for date: Fri Mar 23 13:40:30 CET 2018 next execution: Fri Mar 23 13:40:40 CET 2018 ***
	 * *** Step:4 for date: Fri Mar 23 13:40:40 CET 2018 next execution: Fri Mar 23 13:40:50 CET 2018 ***
	 * *** Step:5 for date: Fri Mar 23 13:40:50 CET 2018 next execution: Fri Mar 23 13:41:00 CET 2018 ***
	 * *** Step:6 for date: Fri Mar 23 13:41:00 CET 2018 next execution: Fri Mar 23 13:41:11 CET 2018 ***
	 * *** Step:7 for date: Fri Mar 23 13:41:11 CET 2018 next execution: Fri Mar 23 13:41:22 CET 2018 ***
	 * *** Step:8 for date: Fri Mar 23 13:41:22 CET 2018 next execution: Fri Mar 23 13:41:30 CET 2018 ***
	 * *** Step:9 for date: Fri Mar 23 13:41:30 CET 2018 next execution: Fri Mar 23 13:41:40 CET 2018 ***
	 * *** Step:10 for date: Fri Mar 23 13:41:40 CET 2018 next execution: Fri Mar 23 13:41:50 CET 2018 ***
	 */
	@TestJob(executeJob=false)
	@DrummerJob(every= { 
					@Every(second=10,after=@After(second=30)),
					@Every(second=11,before=@Before(second=30))
					}
			)
	public void test02() {
		
	}

}
