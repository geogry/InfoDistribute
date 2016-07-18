package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 搅拌车
 * @author geogry
 *
 */
public class MixCarPane extends MyPanel {

	private static final long serialVersionUID = 318603477677808622L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel inSpeedLbl = null;
	
	private JTextField inSpeedTxt = null;
	
	private JLabel outSpeedLbl = null;
	
	private JTextField outSpeedTxt = null;
	
	private JLabel rotateSpeedLbl = null;
	
	private JTextField rotateSpeedTxt = null;
	
	private JLabel hightLbl = null;
	
	private JTextField hightTxt = null;
	
	public MixCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		capacityLbl = new JLabel("搅拌桶容量m3:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 25, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("40");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 25, 150, 20);
		
		inSpeedLbl = new JLabel("进料速度m3/分:");
		inSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		inSpeedLbl.setBounds(0, 50, 100, 20);
		inSpeedTxt = new JTextField();
		inSpeedTxt.setName("41");
		inSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		inSpeedTxt.setBounds(100, 50, 150, 20);
		
		outSpeedLbl = new JLabel("出料速度m3/分:");
		outSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		outSpeedLbl.setBounds(0, 75, 100, 20);
		outSpeedTxt = new JTextField();
		outSpeedTxt.setName("42");
		outSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		outSpeedTxt.setBounds(100, 75, 150, 20);
		
		rotateSpeedLbl = new JLabel("搅拌速度r/min:");
		rotateSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rotateSpeedLbl.setBounds(0, 100, 100, 20);
		rotateSpeedTxt = new JTextField();
		rotateSpeedTxt.setName("43");
		rotateSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rotateSpeedTxt.setBounds(100, 100, 150, 20);
		
		hightLbl = new JLabel("桶离地高度mm:");
		hightLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		hightLbl.setBounds(0, 125, 100, 20);
		hightTxt = new JTextField();
		hightTxt.setName("44");
		hightTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		hightTxt.setBounds(100, 125, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(inSpeedLbl);
		this.add(inSpeedTxt);
		this.add(outSpeedLbl);
		this.add(outSpeedTxt);
		this.add(rotateSpeedLbl);
		this.add(rotateSpeedTxt);
		this.add(hightLbl);
		this.add(hightTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}
