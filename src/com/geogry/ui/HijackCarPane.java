package com.geogry.ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 防暴车
 * @author geogry
 *
 */
public class HijackCarPane extends MyPanel {
	
	private static final long serialVersionUID = 1638694387295329300L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel minDiaLbl = null;
	
	private JTextField minDiaTxt = null;
	
	private JLabel maxGradientLbl = null;
	
	private JTextField maxGradientTxt = null;
	
	public HijackCarPane() {
		typeLbl = new JLabel("类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		capacityLbl = new JLabel("实际容量m3:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 25, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("39");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 25, 150, 20);
		
		minDiaLbl = new JLabel("最小转弯半径m:");
		minDiaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		minDiaLbl.setBounds(0, 50, 100, 20);
		minDiaTxt = new JTextField();
		minDiaTxt.setName("16");
		minDiaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		minDiaTxt.setBounds(100, 50, 150, 20);
		
		maxGradientLbl = new JLabel("最大爬坡度°:");
		maxGradientLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxGradientLbl.setBounds(0, 75, 100, 20);
		maxGradientTxt = new JTextField();
		maxGradientTxt.setName("17");
		maxGradientTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxGradientTxt.setBounds(100, 75, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(minDiaLbl);
		this.add(minDiaTxt);
		this.add(maxGradientLbl);
		this.add(maxGradientTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}
