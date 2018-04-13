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
public class DrummerCCDIIntegrator {

	private @Inject @Any Instance<DrummerObservable> joblist;
	
	private DrummerBoot starter=new DrummerBoot();
	
	
	@PostConstruct
	public void init(){
		starter.setConfigProperties(new HashMap<String,String>());
		List<DrummerObservable> l=new LinkedList<>();
		for (DrummerObservable dobs:joblist) {
			l.add(dobs);
		}
		
		System.out.println("inicjuje dla "+l.size());
		
		starter.boot(l);
	}
	
	@PreDestroy
	public void destroyMe(){
		starter.destroy();
	}
	

}
