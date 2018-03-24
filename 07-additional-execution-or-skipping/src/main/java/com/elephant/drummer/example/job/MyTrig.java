package com.elephant.drummer.example.job;

import java.util.Calendar;
import java.util.Date;

import com.elephant.drummer.trigger.base.DrumTrigger;
import com.elephant.drummer.trigger.base.TriggerType;
import com.elephant.drummer.trigger.customised.ProgramicTrigger;

public class MyTrig extends ProgramicTrigger{

	@Override
	public Date getNextRunTime(Date arg0) {
		Calendar c=Calendar.getInstance();
		c.setTime(arg0);
		c.add(Calendar.DAY_OF_YEAR, 1);
		return c.getTime();
	}



}
