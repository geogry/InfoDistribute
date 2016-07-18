package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 洒水车
 * @author geogry
 *
 */
public class WaterCarPane extends MyPanel {

	private static final long serialVersionUID = 58121128051208707L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel waterCountLbl = null;
	
	private JTextField waterCountTxt = null;
	
	private JLabel waterWidthLbl = null;
	
	private JTextField waterWidthTxt = null;
	
	private JLabel waterPreLbl = null;
	
	private JTextField waterPreTxt = null;
	
	private JLabel waterDepthLbl = null;
	
	private JTextField waterDepthTxt = null;
	
	private JLabel rangeLbl = null;
	
	private JTextField rangeTxt = null;
	
	private JLabel pumpFluxLbl = null;
	
	private JTextField pumpFluxTxt = null;
	
	private JLabel pumpPreLbl = null;
	
	private JTextField pumpPreTxt = null;
	
	private JLabel operateSpeedLbl = null;
	
	private JTextField operateSpeedTxt = null;
	
	public WaterCarPane(){
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
		
		waterCountLbl = new JLabel("洒水量L/m2:");
		waterCountLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		waterCountLbl.setBounds(0, 50, 100, 20);
		waterCountTxt = new JTextField();
		waterCountTxt.setName("62");
		waterCountTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		waterCountTxt.setBounds(100, 50, 150, 20);
		
		waterWidthLbl = new JLabel("洒水宽度m:");
		waterWidthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		waterWidthLbl.setBounds(0, 75, 100, 20);
		waterWidthTxt = new JTextField();
		waterWidthTxt.setName("63");
		waterWidthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		waterWidthTxt.setBounds(100, 75, 150, 20);
		
		waterPreLbl = new JLabel("洒水压力MPa:");
		waterPreLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		waterPreLbl.setBounds(0, 100, 100, 20);
		waterPreTxt = new JTextField();
		waterPreTxt.setName("64");
		waterPreTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		waterPreTxt.setBounds(100, 100, 150, 20);
		
		waterDepthLbl = new JLabel("吸水深度m:");
		waterDepthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		waterDepthLbl.setBounds(0, 125, 100, 20);
		waterDepthTxt = new JTextField();
		waterDepthTxt.setName("65");
		waterDepthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		waterDepthTxt.setBounds(100, 125, 150, 20);
		
		rangeLbl = new JLabel("射程m:");
		rangeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rangeLbl.setBounds(0, 150, 100, 20);
		rangeTxt = new JTextField();
		rangeTxt.setName("66");
		rangeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rangeTxt.setBounds(100, 150, 150, 20);
		
		pumpFluxLbl = new JLabel("水泵流量:");
		pumpFluxLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpFluxLbl.setBounds(0, 175, 100, 20);
		pumpFluxTxt = new JTextField();
		pumpFluxTxt.setName("67");
		pumpFluxTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpFluxTxt.setBounds(100, 175, 150, 20);
		
		pumpPreLbl = new JLabel("水泵压力MPa:");
		pumpPreLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpPreLbl.setBounds(0, 200, 100, 20);
		pumpPreTxt = new JTextField();
		pumpPreTxt.setName("68");
		pumpPreTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		pumpPreTxt.setBounds(100, 200, 150, 20);
		
		operateSpeedLbl = new JLabel("作业速度km/h:");
		operateSpeedLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		operateSpeedLbl.setBounds(0, 225, 100, 20);
		operateSpeedTxt = new JTextField();
		operateSpeedTxt.setName("69");
		operateSpeedTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		operateSpeedTxt.setBounds(100, 225, 150, 20);
		
		this.setLayout(null);
		this.setBounds(10, 20, 280, 360);
		this.setOpaque(false);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(waterCountLbl);
		this.add(waterCountTxt);
		this.add(waterWidthLbl);
		this.add(waterWidthTxt);
		this.add(waterPreLbl);
		this.add(waterPreTxt);
		this.add(waterDepthLbl);
		this.add(waterDepthTxt);
		this.add(rangeLbl);
		this.add(rangeTxt);
		this.add(pumpFluxLbl);
		this.add(pumpFluxTxt);
		this.add(pumpPreLbl);
		this.add(pumpPreTxt);
		this.add(operateSpeedLbl);
		this.add(operateSpeedTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && !"".equals(typeTxt.getText()))
			return true;
		else
			return false;
	}
}
