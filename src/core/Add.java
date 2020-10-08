package core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Add {
	
	File config;
	FileWriter writer;
	
	public Add() {
		
		config = new File("src/core/config.cfg");
		try {
			writer = new FileWriter(config, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addCommand(String cmd) {
		try {
			
			writer.write(System.lineSeparator() + cmd);
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
