package com.geogry.ui;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 垃圾车
 * @author geogry
 *
 */
public class AshCarPane extends MyPanel {

	private static final long serialVersionUID = -1364511817111880558L;

	private JLabel typeLbl = null;
	
	private JTextField typeTxt = null;
	
	private JLabel carTypeLbl = null;
	
	private JTextField carTypeTxt = null;
	
	private JLabel capacityLbl = null;
	
	private JTextField capacityTxt = null;
	
	private JLabel sizeLbl = null;
	
	private JTextField sizeTxt = null;
	
	private JLabel holeSizeLbl = null;
	
	private JTextField holeSizeTxt = null;
	
	private JLabel inWidthLbl = null;
	
	private JTextField inWidthTxt = null;
	
	public AshCarPane() {
		typeLbl = new JLabel("*类型:");
		typeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		typeLbl.setBounds(0, 0, 100, 20);
		typeTxt = new JTextField();
		typeTxt.setName("22");
		typeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		typeTxt.setBounds(100, 0, 150, 20);
		
		carTypeLbl = new JLabel("*车型:");
		carTypeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		carTypeLbl.setBounds(0, 25, 100, 20);
		carTypeTxt = new JTextField();
		carTypeTxt.setName("23");
		carTypeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		carTypeTxt.setBounds(100, 25, 150, 20);
		
		capacityLbl = new JLabel("罐体容积m3:");
		capacityLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityLbl.setBounds(0, 50, 100, 20);
		capacityTxt = new JTextField();
		capacityTxt.setName("24");
		capacityTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		capacityTxt.setBounds(100, 50, 150, 20);
		
		sizeLbl = new JLabel("缸径×冲程:");
		sizeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		sizeLbl.setBounds(0, 75, 100, 20);
		sizeTxt = new JTextField();
		sizeTxt.setName("25");
		sizeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		sizeTxt.setBounds(100, 75, 150, 20);
		
		holeSizeLbl = new JLabel("填料口尺寸m:");
		holeSizeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		holeSizeLbl.setBounds(0, 100, 100, 20);
		holeSizeTxt = new JTextField();
		holeSizeTxt.setName("26");
		holeSizeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		holeSizeTxt.setBounds(100, 100, 150, 20);
		
		inWidthLbl = new JLabel("投入口宽度m:");
		inWidthLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		inWidthLbl.setBounds(0, 125, 100, 20);
		inWidthTxt = new JTextField();
		inWidthTxt.setName("27");
		inWidthTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		inWidthTxt.setBounds(100, 125, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(typeLbl);
		this.add(typeTxt);
		this.add(carTypeLbl);
		this.add(carTypeTxt);
		this.add(capacityLbl);
		this.add(capacityTxt);
		this.add(sizeLbl);
		this.add(sizeTxt);
		this.add(holeSizeLbl);
		this.add(holeSizeTxt);
		this.add(inWidthLbl);
		this.add(inWidthTxt);
	}
	
	public boolean isLegal(){
		if(typeTxt.getText() != null && carTypeTxt.getText() != null && !"".equals(typeTxt.getText()) && !"".equals(carTypeTxt.getText()))
			return true;
		else
			return false;
	}
	
}
