package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 吸粪车
 * @author geogry
 *
 */
public class DeCarPane extends MyPanel {

	private static final long serialVersionUID = 6655150150659653059L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	public DeCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		capacityLbl = new JLabel("罐体容积m3:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 25, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("24");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 25, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}
