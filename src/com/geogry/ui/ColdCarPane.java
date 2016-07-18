package com.geogry.ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 冷藏车
 * @author geogry
 *
 */
public class ColdCarPane extends MyPanel {

	private static final long serialVersionUID = 5322572011409292927L;

	private JLabel innerSizeLbl = null;
	
	private JTextField innerSizeTxt = null;
	
	private JLabel powerLbl = null;
	
	private JTextField powerTxt = null;
	
	private JLabel rangeLbl = null;
	
	private JTextField rangeTxt = null;
	
	public ColdCarPane() {
		innerSizeLbl = new JLabel("货箱尺寸m*m:");
		innerSizeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		innerSizeLbl.setBounds(0, 0, 100, 20);
		innerSizeTxt = new JTextField();
		innerSizeTxt.setName("35");
		innerSizeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		innerSizeTxt.setBounds(100, 0, 150, 20);
		
		powerLbl = new JLabel("功率kw:");
		powerLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		powerLbl.setBounds(0, 25, 100, 20);
		powerTxt = new JTextField();
		powerTxt.setName("36");
		powerTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		powerTxt.setBounds(100, 25, 150, 20);
		
		rangeLbl = new JLabel("温控范围°C:");
		rangeLbl.setFont(new Font("宋体", Font.PLAIN, 13));
		rangeLbl.setBounds(0, 50, 100, 20);
		rangeTxt = new JTextField();
		rangeTxt.setName("37");
		rangeTxt.setFont(new Font("宋体", Font.PLAIN, 13));
		rangeTxt.setBounds(100, 50, 150, 20);
		
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(10, 20, 280, 370);
		
		this.add(innerSizeLbl);
		this.add(innerSizeTxt);
		this.add(powerLbl);
		this.add(powerTxt);
		this.add(rangeLbl);
		this.add(rangeTxt);
	}

}
