package com.geogry.entities;

import java.util.HashMap;
import java.util.Map;

public class Car {

	private String name;
	
	private String webId;
	
	private Map<String, Attribute> allAttributes;
	
	public Car(){
		allAttributes = new HashMap<String, Attribute>();
	}
	
	public Car(String name, String webId){
		this.setName(name);
		this.setWebId(webId);
		allAttributes = new HashMap<String, Attribute>();
	}
	
	public void addAttribte(Attribute attr){
		allAttributes.put(attr.getViewId(), attr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebId() {
		return webId;
	}

	public void setWebId(String webId) {
		this.webId = webId;
	}

	public Map<String, Attribute> getAllAttributes() {
		return allAttributes;
	}

	public void setAllAttributes(Map<String, Attribute> allAttributes) {
		this.allAttributes = allAttributes;
	}
	
	
}
