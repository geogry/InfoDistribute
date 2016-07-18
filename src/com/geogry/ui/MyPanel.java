package com.geogry.ui;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public Map<String, String> getNameAndValue(){
		Map<String, String> attr = new HashMap<String, String>();
		Component[] components = this.getComponents();
		for(Component temp : components){
			if(temp instanceof JTextField){
				attr.put(temp.getName(), ((JTextField) temp).getText());
			} else if(temp instanceof JComboBox) {
				attr.put(temp.getName(), (String) ((JComboBox) temp).getSelectedItem());
			}
		}
		return attr;
	}
	
	public boolean isLegal(){
		return true;
	}
}
