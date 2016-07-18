package com.geogry.entities;

public class Attribute {
	
	private String name;
	
	private String value;
	
	private String viewId;
	
	private String webId;
	
	private String unit;
	
	public Attribute(){
		
	}
	
	public Attribute(String name, String value, String viewId, String webId, String unit){
		this.setName(name);
		this.setUnit(unit);
		this.setValue(value);
		this.setViewId(viewId);
		this.setWebId(webId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getViewId() {
		return viewId;
	}

	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	public String getWebId() {
		return webId;
	}

	public void setWebId(String webId) {
		this.webId = webId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
