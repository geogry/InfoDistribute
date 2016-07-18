package com.geogry.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class FileOperator {

	private String path;
	
	private Map<String, String> readyAttr;
	
	private Map<String, String> notReadyAttr;
	
	private String corp;
	
	public FileOperator() {
		path = System.getProperty("user.dir") + "/bin/carinfo/";
	}
	
	public void readCarInfo(String filename) {
		readyAttr = new HashMap<String, String>();
		notReadyAttr = new HashMap<String, String>();
		
		File file = new File(path + filename + ".txt");
		if(file.exists() && file.isFile()){
			try {
				InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
				BufferedReader br = new BufferedReader(reader);
				String line = "";
				while((line = br.readLine()) != null) {
					String[] elem = line.split("\t");
					if(elem[2].equals("0")) {
						readyAttr.put(elem[0], elem[1]);
					} else if (elem[2].equals("-1")) {
						corp = elem[0];
					} else {
						notReadyAttr.put(elem[2], elem[0]);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public Map<String, String> getReadyAttr() {
		return readyAttr;
	}

	public Map<String, String> getNotReadyAttr() {
		return notReadyAttr;
	}

	public String getCorp() {
		return corp;
	}
}
