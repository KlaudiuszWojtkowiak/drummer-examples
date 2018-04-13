package com.elephant.drummer.example;


import java.util.Properties;

import com.elephant.drummer.DrummerStarter;

/**
 * Start Drummer for java standallone mode
 * 
 * @author Klaudiusz Wojtkowiak, Elephant Software 2018
 */
public class DrummerStartup {
	public static void main(String[] args) {
		
		Properties config=new Properties();
		config.put("drummer.first.everySecond", "10");
		config.put("drummer.second.1.everySecond", "4");
		config.put("drummer.second.2.everySecond", "3");
		config.put("drummer.three.atSecond", "10");
		config.put("drummer.three.threads", "2");
		DrummerStarter.init(config);
	}

}
