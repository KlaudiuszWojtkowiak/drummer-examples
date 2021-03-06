package com.elephantdrummer.example;


import java.util.Properties;

import com.elephantdrummer.DrummerStarter;

/**
 * Start Drummer for java standallone mode
 * 
 * @author Klaudiusz Wojtkowiak, Elephant Software 2018
 */
public class DrummerStartup {
	public static void main(String[] args) {
		
		Properties config=new Properties();
		config.put("drummer.first.at.second", "10");
		
		config.put("drummer.second.1.every.second", "4");
		config.put("drummer.second.2.every.second", "3");
		
		config.put("drummer.third.at.second", "10");
		config.put("drummer.third.threads", "2");
		DrummerStarter.init(config);
	}

}
