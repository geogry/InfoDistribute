package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 高空作业车
 * @author geogry
 *
 */
public class OverheadCarPane extends MyPanel {

	private static final long serialVersionUID = 5946055113610120497L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel structLbl = null;
	
	private JTextField structTxt = null;
	
	private JLabel loadLbl = null;
	
	private JTextField loadTxt = null;
	
	private JLabel armLengthLbl = null;
	
	private JTextField armLengthTxt = null;
	
	private JLabel maxArmWeightLbl = null;
	
	private JTextField maxArmWeightTxt = null;
	
	private JLabel widthLbl = null;
	
	private JTextField widthTxt = null;
	
	private JLabel maxHeightLbl = null;
	
	private JTextField maxHeightTxt = null;
	
	private JLabel rotateSpeedLbl = null;
	
	private JTextField rotateSpeedTxt = null;
	
	public OverheadCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setBounds(0, 0, 100, 20);
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		structLbl = new JLabel("*伸展结构:");
		structLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		structLbl.setBounds(0, 25, 100, 20);
		structTxt = new JTextField();
		structTxt.setName("45");
		structTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		structTxt.setBounds(100, 25, 150, 20);
		
		loadLbl = new JLabel("工作斗载荷kg:");
		loadLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		loadLbl.setBounds(0, 50, 100, 20);
		loadTxt = new JTextField();
		loadTxt.setName("46");
		loadTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		loadTxt.setBounds(100, 50, 150, 20);
		
		armLengthLbl = new JLabel("起重臂长m:");
		armLengthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		armLengthLbl.setBounds(0, 75, 100, 20);
		armLengthTxt = new JTextField();
		armLengthTxt.setName("47");
		armLengthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		armLengthTxt.setBounds(100, 75, 150, 20);
		
		maxArmWeightLbl = new JLabel("最大起重量kg:");
		maxArmWeightLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxArmWeightLbl.setBounds(0, 100, 100, 20);
		maxArmWeightTxt = new JTextField();
		maxArmWeightTxt.setName("48");
		maxArmWeightTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxArmWeightTxt.setBounds(100, 100, 150, 20);
		
		widthLbl = new JLabel("支腿跨距mm:");
		widthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		widthLbl.setBounds(0, 125, 100, 20);
		widthTxt = new JTextField();
		widthTxt.setName("49");
		widthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		widthTxt.setBounds(100, 125, 150, 20);
		
		maxHeightLbl = new JLabel("*最大起重高度m:");
		maxHeightLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxHeightLbl.setBounds(0, 150, 100, 20);
		maxHeightTxt = new JTextField();
		maxHeightTxt.setName("50");
		maxHeightTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxHeightTxt.setBounds(100, 150, 150, 20);
		
		rotateSpeedLbl = new JLabel("回转速度r/min:");
		rotateSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rotateSpeedLbl.setBounds(0, 175, 100, 20);
		rotateSpeedTxt = new JTextField();
		rotateSpeedTxt.setName("51");
		rotateSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rotateSpeedTxt.setBounds(100, 175, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(structLbl);
		this.add(structTxt);
		this.add(loadLbl);
		this.add(loadTxt);
		this.add(armLengthLbl);
		this.add(armLengthTxt);
		this.add(maxArmWeightLbl);
		this.add(maxArmWeightTxt);
		this.add(widthLbl);
		this.add(widthTxt);
		this.add(maxHeightLbl);
		this.add(maxHeightTxt);
		this.add(rotateSpeedLbl);
		this.add(rotateSpeedTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()) && structTxt.getText() != null && !"".equals(structTxt.getText()))
			return true;
		else
			return false;
	}

}
