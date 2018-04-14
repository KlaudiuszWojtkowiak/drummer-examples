package com.elephantdrummer.example.job;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.elephantdrummer.DrummerBoot;
import com.elephantdrummer.scope.DrummerObservable;

@Singleton
@Startup
@ApplicationScoped
public class DrummerJavaEEIIntegrator {

	private @Inject @Any Instance<DrummerObservable> joblist;
	
	private DrummerBoot starter=new DrummerBoot();
	
	
	@PostConstruct
	public void init(){
		if (joblist==null) return;
		//put your properties here
		starter.setConfigProperties(new HashMap<String,String>());
		
		List<DrummerObservable> jobs=new LinkedList<>();
		joblist.forEach(jobs::add);
		starter.boot(jobs);
	}
	
	@PreDestroy
	public void destroyMe(){
		starter.destroy();
	}
	

}
