package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 清洗车
 * @author geogry
 *
 */
public class ClearCarPane extends MyPanel {

	private static final long serialVersionUID = -279695485499938013L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel preLbl = null;
	
	private JTextField preTxt = null;
	
	private JLabel fluxLbl = null;
	
	private JTextField fluxTxt = null;
	
	private JLabel pumpPowerLbl = null;
	
	private JTextField pumpPowerTxt = null;
	
	private JLabel volLbl = null;
	
	private JTextField volTxt = null;
	
	private JLabel lengthLbl = null;
	
	private JTextField lengthTxt = null;
	
	private JLabel speedLbl = null;
	
	private JTextField speedTxt = null;
	
	private JLabel diaLbl = null;
	
	private JTextField diaTxt = null;
	
	public ClearCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt= new JTextField();
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
		
		preLbl = new JLabel("水压MPa:");
		preLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		preLbl.setBounds(0, 50, 100, 20);
		preTxt = new JTextField();
		preTxt.setName("28");
		preTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		preTxt.setBounds(100, 50, 150, 20);
		
		fluxLbl = new JLabel("水流量L/min:");
		fluxLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		fluxLbl.setBounds(0, 75, 100, 20);
		fluxTxt = new JTextField();
		fluxTxt.setName("29");
		fluxTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		fluxTxt.setBounds(100, 75, 150, 20);
		
		pumpPowerLbl = new JLabel("水泵功率kw:");
		pumpPowerLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpPowerLbl.setBounds(0, 100, 100, 20);
		pumpPowerTxt = new JTextField();
		pumpPowerTxt.setName("30");
		pumpPowerTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpPowerTxt.setBounds(100, 100, 150, 20);
		
		volLbl = new JLabel("工作电压v:");
		volLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		volLbl.setBounds(0, 125, 100, 20);
		volTxt = new JTextField();
		volTxt.setName("31");
		volTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		volTxt.setBounds(100, 125, 150, 20);
		
		lengthLbl = new JLabel("清理长度m:");
		lengthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		lengthLbl.setBounds(0, 150, 100, 20);
		lengthTxt = new JTextField();
		lengthTxt.setName("32");
		lengthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		lengthTxt.setBounds(100, 150, 150, 20);
		
		speedLbl = new JLabel("清理速度r/min:");
		speedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		speedLbl.setBounds(0, 175, 100, 20);
		speedTxt = new JTextField();
		speedTxt.setName("33");
		speedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		speedTxt.setBounds(100, 175, 150, 20);
		
		diaLbl = new JLabel("疏通管道直径mm:");
		diaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		diaLbl.setBounds(0, 200, 100, 20);
		diaTxt = new JTextField();
		diaTxt.setName("34");
		diaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		diaTxt.setBounds(100, 200, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(preLbl);
		this.add(preTxt);
		this.add(fluxLbl);
		this.add(fluxTxt);
		this.add(pumpPowerLbl);
		this.add(pumpPowerTxt);
		this.add(volLbl);
		this.add(volTxt);
		this.add(lengthLbl);
		this.add(lengthTxt);
		this.add(speedLbl);
		this.add(speedTxt);
		this.add(diaLbl);
		this.add(diaTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}

}
