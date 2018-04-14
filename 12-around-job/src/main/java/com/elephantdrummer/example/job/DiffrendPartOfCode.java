package com.elephantdrummer.example.job;

import java.util.logging.Logger;

import com.elephantdrummer.annotation.flow.BeforeDrummerJobNamed;
import com.elephantdrummer.example.DictDrummerJob;
import com.elephantdrummer.scope.DrummerObservable;

public class DiffrendPartOfCode implements DrummerObservable{
	
	Logger log=Logger.getLogger(FlowExample.class.getSimpleName());
	
	
	@BeforeDrummerJobNamed(name=DictDrummerJob.EXAMPLE_JOB,priority=2)
	public void before2() {
		log.info(">>>>>>>>  this method is called BEFORE job execution with priority2.");
	}

}
