package com.geogry.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.geogry.utils.LengthLimit;

/**
 * this class is a JFrame subclass, it shows the activate window and dell with the user's action.
 * @author geogry
 *
 */
public class ActivateWindow extends JFrame {

	private static final long serialVersionUID = 3625502924661567305L;
	//ʹ����ʾ
	private JLabel userTip = null;
	//��Ȩ����
	private JLabel copyright = null;
	//��ϵ�绰
	private JLabel phone = null;
	//��ַ
	private JLabel address = null;
	//������ʾ
	private JLabel activateTip = null;
	//ע�����һ����
	private JTextField key1 = null;
	//1��2���ַָ���
	private JLabel separator1 = null;
	//ע����ڶ�����
	private JTextField key2 = null;
	//2��3���ַָ���
	private JLabel separator2 = null;
	//ע�����������
	private JTextField key3 = null;
	//3��4���ַָ���
	private JLabel separator3 = null;
	//ע������Ĳ���
	private JTextField key4 = null;
	//4��5���ַָ���
	private JLabel separator4 = null;
	//ע������岿��
	private JTextField key5 = null;
	//���ť
	private JButton activate = null;
	//ͼ��
	private BufferedImage ico = null;
	//�����
	private ActivatePane contentPane = null;
	
	public ActivateWindow(){
		userTip = new JLabel("<html><body>�����״�ʹ�ñ�������뼤���������������ʹ��.</body></html>");
		userTip.setBounds(20, 30, 640, 50);
		userTip.setFont(new Font("����", Font.PLAIN, 18));
		copyright = new JLabel("<html><body>Orange��Ʒ��Ϣ���������Orange�������С�鿪����Orange��Ʒ��Ϣ����<br>�����Ȩ��Orange�������С������.</body></html>");
		copyright.setFont(new Font("����", Font.PLAIN, 18));
		copyright.setBounds(20, 85, 640, 50);
		phone = new JLabel("��ϵ�绰:***********");
		phone.setBounds(20, 140, 640, 40);
		phone.setFont(new Font("����", Font.PLAIN, 18));
		address = new JLabel("��ַ:�Ĵ�ʡ�ɶ������Ͻ�ͨ��ѧϬ��У��");
		address.setBounds(20, 185, 640, 40);
		address.setFont(new Font("����", Font.PLAIN, 18));
		activateTip = new JLabel("�����뼤�����Լ�����:");
		activateTip.setBounds(20, 230, 640, 40);
		activateTip.setFont(new Font("����", Font.PLAIN, 18));
		
		key1 = new JTextField();
		key1.setBounds(20, 275, 90, 40);
		key1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key1.setDocument(new LengthLimit(5));
		separator1 = new JLabel("-");
		separator1.setBounds(112, 275, 5, 40);
		key2 = new JTextField();
		key2.setBounds(119, 275, 90, 40);
		key2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key2.setDocument(new LengthLimit(5));
		separator2 = new JLabel("-");
		separator2.setBounds(211, 275, 5, 40);
		key3 = new JTextField();
		key3.setBounds(218, 275, 90, 40);
		key3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key3.setDocument(new LengthLimit(5));
		separator3 = new JLabel("-");
		separator3.setBounds(310, 275, 5, 40);
		key4 = new JTextField();
		key4.setBounds(317, 275, 90, 40);
		key4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key4.setDocument(new LengthLimit(5));
		separator4 = new JLabel("-");
		separator4.setBounds(409, 275, 5, 40);
		key5 = new JTextField();
		key5.setBounds(416, 275, 90, 40);
		key5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		key5.setDocument(new LengthLimit(5));
		
		activate = new JButton("�� ��");
		activate.setBounds(460, 370, 100, 30);
		activate.setFont(new Font("����", Font.BOLD, 18));
		activate.addActionListener(new ActivateBtnActionListener(new MainWindow(), this));
		
		contentPane = new ActivatePane();
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 640, 480);
		
		contentPane.add(userTip);
		contentPane.add(copyright);
		contentPane.add(phone);
		contentPane.add(address);
		contentPane.add(activateTip);
		contentPane.add(key1);
		contentPane.add(separator1);
		contentPane.add(key2);
		contentPane.add(separator2);
		contentPane.add(key3);
		contentPane.add(separator3);
		contentPane.add(key4);
		contentPane.add(separator4);
		contentPane.add(key5);
		contentPane.add(activate);
		
		this.setTitle("����");
		int x = (this.getToolkit().getScreenSize().width - 640) / 2;
		int y = (this.getToolkit().getScreenSize().height - 480) / 2;
		this.setLocation(x, y);
		this.pack();
		this.setBounds(x, y, 640, 480);
		this.setContentPane(contentPane);
		try {
			ico = ImageIO.read(new File(System.getProperty("user.dir") + "/resources/image/orange.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setIconImage(ico);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	class ActivateBtnActionListener implements ActionListener {

		private MainWindow mainWindow = null;
		
		private ActivateWindow activateWindow = null;
		
		public ActivateBtnActionListener(MainWindow mainWindow, ActivateWindow activateWindow){
			this.mainWindow = mainWindow;
			this.activateWindow = activateWindow;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String code1 = key1.getText();
			String code2 = key2.getText();
			String code3 = key3.getText();
			String code4 = key4.getText();
			String code5 = key5.getText();
			if(code1 != null && code2 != null && code3 != null && code4 != null && code5 != null
					&& !code1.equals("") && !code2.equals("") && !code3.equals("") && !code4.equals("") && !code5.equals("")){
				//�����ݿ��ѯ�����룬���Ϊ�գ�������֤ʧ�ܣ�������֤�������Ϊ�գ����ؼ������ʾ�����ڲ��޸������ļ�Ϊ������
				this.activateWindow.hide();
				this.mainWindow.show();
			} else {
				//������ʾ����������ȷ�ļ�����
				JOptionPane.showMessageDialog(this.activateWindow, "��������ȷ�ļ����룡", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
}
