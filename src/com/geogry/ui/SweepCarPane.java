package com.geogry.ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 扫路车
 * @author geogry
 *
 */
public class SweepCarPane extends MyPanel {

	private static final long serialVersionUID = -7130316528734404597L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel dustLbl = null;
	
	private JTextField dustTxt = null;
	
	private JLabel clearWidthLbl = null;
	
	private JTextField clearWidthTxt = null;
	
	private JLabel maxEfficLbl = null;
	
	private JTextField maxEfficTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel speedLbl = null;
	
	private JTextField speedTxt = null;
	
	private JLabel filterAreaLbl = null;
	
	private JTextField filterAreaTxt = null;
	
	private JLabel conTimeLbl = null;
	
	private JTextField conTimeTxt = null;
	
	private JLabel edgeDiaLbl = null;
	
	private JTextField edgeDiaTxt = null;
	
	private JLabel mainDiaLbl = null;
	
	private JTextField mainDiaTxt = null;
	
	public SweepCarPane(){
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		dustLbl = new JLabel("除尘方式:");
		dustLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		dustLbl.setBounds(0, 25, 100, 20);
		dustTxt = new JTextField();
		dustTxt.setName("52");
		dustTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		dustTxt.setBounds(100, 25, 150, 20);
		
		clearWidthLbl = new JLabel("清扫宽度m:");
		clearWidthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		clearWidthLbl.setBounds(0, 50, 100, 20);
		clearWidthTxt = new JTextField();
		clearWidthTxt.setName("53");
		clearWidthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		clearWidthTxt.setBounds(100, 50, 150, 20);
		
		maxEfficLbl = new JLabel("最大效率m2/h:");
		maxEfficLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		maxEfficLbl.setBounds(0, 75, 100, 20);
		maxEfficTxt = new JTextField();
		maxEfficTxt.setName("54");
		maxEfficTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		maxEfficTxt.setBounds(100, 75, 150, 20);
		
		capacityLbl = new JLabel("尘箱容积L:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 100, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("55");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 100, 150, 20);
		
		speedLbl = new JLabel("前进速度km/h:");
		speedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		speedLbl.setBounds(0, 125, 100, 20);
		speedTxt = new JTextField();
		speedTxt.setName("56");
		speedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		speedTxt.setBounds(100, 125, 150, 20);
		
		filterAreaLbl = new JLabel("过滤面积m2:");
		filterAreaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		filterAreaLbl.setBounds(0, 150, 100, 20);
		filterAreaTxt = new JTextField();
		filterAreaTxt.setName("57");
		filterAreaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		filterAreaTxt.setBounds(100, 150, 150, 20);
		
		conTimeLbl = new JLabel("连续工作时间h:");
		conTimeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		conTimeLbl.setBounds(0, 175, 100, 20);
		conTimeTxt = new JTextField();
		conTimeTxt.setName("58");
		conTimeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		conTimeTxt.setBounds(100, 175, 150, 20);
		
		edgeDiaLbl = new JLabel("边刷直径mm:");
		edgeDiaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		edgeDiaLbl.setBounds(0, 200, 100, 20);
		edgeDiaTxt = new JTextField();
		edgeDiaTxt.setName("59");
		edgeDiaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		edgeDiaTxt.setBounds(100, 200, 150, 20);
		
		mainDiaLbl = new JLabel("主刷直径mm:");
		mainDiaLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		mainDiaLbl.setBounds(0, 225, 100, 20);
		mainDiaTxt = new JTextField();
		mainDiaTxt.setName("60");
		mainDiaTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		mainDiaTxt.setBounds(100, 225, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(dustLbl);
		this.add(dustTxt);
		this.add(clearWidthLbl);
		this.add(clearWidthTxt);
		this.add(maxEfficLbl);
		this.add(maxEfficTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(speedLbl);
		this.add(speedTxt);
		this.add(filterAreaLbl);
		this.add(filterAreaTxt);
		this.add(conTimeLbl);
		this.add(conTimeTxt);
		this.add(edgeDiaLbl);
		this.add(edgeDiaTxt);
		this.add(mainDiaLbl);
		this.add(mainDiaTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}
	
}
