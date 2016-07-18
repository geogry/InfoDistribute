package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 其它专用车
 * @author geogry
 *
 */
public class OtherCarPane extends MyPanel {

	private static final long serialVersionUID = 580370706076850781L;

	private JLabel minDiaLbl = null;
	
	private JTextField minDiaTxt = null;
	
	private JLabel maxGradientLbl = null;
	
	private JTextField maxGradientTxt = null;
	
	private JLabel frontLbl = null;
	
	private JTextField frontTxt = null;
	
	private JLabel rearLbl = null;
	
	private JTextField rearTxt = null;
	
	private JLabel rampAngleLbl = null;
	
	private JTextField rampAngleTxt = null;
	
	private JLabel depAngleLbl = null;
	
	private JTextField depAngleTxt = null;
	
	private JLabel typeLbl;
	
	private JTextField typeTxt;
	
	public OtherCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		minDiaLbl = new JLabel("最小转弯半径m:");
		minDiaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		minDiaLbl.setBounds(0, 25, 100, 20);
		minDiaTxt = new JTextField();
		minDiaTxt.setName("16");
		minDiaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		minDiaTxt.setBounds(100, 25, 150, 20);
		
		maxGradientLbl = new JLabel("最大爬坡度°:");
		maxGradientLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxGradientLbl.setBounds(0, 50, 100, 20);
		maxGradientTxt = new JTextField();
		maxGradientTxt.setName("17");
		maxGradientTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxGradientTxt.setBounds(100, 50, 150, 20);
		
		frontLbl = new JLabel("前悬mm:");
		frontLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		frontLbl.setBounds(0, 75, 100, 20);
		frontTxt = new JTextField();
		frontTxt.setName("18");
		frontTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		frontTxt.setBounds(100, 75, 150, 20);
		
		rearLbl = new JLabel("后悬mm:");
		rearLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rearLbl.setBounds(0, 100, 100, 20);
		rearTxt = new JTextField();
		rearTxt.setName("19");
		rearTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rearTxt.setBounds(100, 100, 150, 20);
		
		rampAngleLbl = new JLabel("接近角°:");
		rampAngleLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rampAngleLbl.setBounds(0, 125, 100, 20);
		rampAngleTxt = new JTextField();
		rampAngleTxt.setName("20");
		rampAngleTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rampAngleTxt.setBounds(100, 125, 150, 20);
		
		depAngleLbl = new JLabel("离去角°:");
		depAngleLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		depAngleLbl.setBounds(0, 150, 100, 20);
		depAngleTxt = new JTextField();
		depAngleTxt.setName("21");
		depAngleTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		depAngleTxt.setBounds(100, 150, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(minDiaLbl);
		this.add(minDiaTxt);
		this.add(maxGradientLbl);
		this.add(maxGradientTxt);
		this.add(frontLbl);
		this.add(frontTxt);
		this.add(rearLbl);
		this.add(rearTxt);
		this.add(rampAngleLbl);
		this.add(rampAngleTxt);
		this.add(depAngleLbl);
		this.add(depAngleTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}
