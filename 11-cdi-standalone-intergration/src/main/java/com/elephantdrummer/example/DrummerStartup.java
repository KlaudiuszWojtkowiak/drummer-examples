package com.elephant.drummer.example;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.elephant.drummer.DrummerBoot;
import com.elephant.drummer.scope.DrummerObservable;

/**
 * Start Drummer for java standallone mode
 * 
 * @author Klaudiusz Wojtkowiak, Elephant Software 2018
 */
@ApplicationScoped
public class DrummerStartup implements Runnable{
	
	private @Inject @Any Instance<DrummerObservable> joblist;

	private DrummerBoot starter=new DrummerBoot();
	
	
	public static void main(String[] args) {
//		DrummerStarter.init();
		Weld weld = new Weld();
	    WeldContainer container = weld.initialize();
	    DrummerStartup application = container.instance().select(DrummerStartup.class).get();
	    application.run();
	    weld.shutdown();
	}

	@Override
	public void run() {
		starter.setConfigProperties(new HashMap<String,String>());
		List<DrummerObservable> l=new LinkedList<>();
		for (DrummerObservable dobs:joblist) {
			l.add(dobs);
		}
		
		
		starter.boot(l);
		
		
		while (true) {
			try {
				Thread.sleep(1000*60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
	

	@PreDestroy
	public void destroyMe(){
		starter.destroy();
	}

}
