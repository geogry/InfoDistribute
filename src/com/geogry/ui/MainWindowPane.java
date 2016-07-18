package com.geogry.ui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.atlanticbb.tantlinger.shef.HTMLEditorPane;

import com.geogry.file.FileOperator;
import com.geogry.http.HttpClient;
import com.geogry.timer.PublishTimer;

/**
 * This class disign a panel that display the main window.
 * @author geogry
 *
 */
public class MainWindowPane extends JPanel {

	private static final long serialVersionUID = 105183309903841130L;
	//ƽ̨����ѡ�����
	private JPanel platformChoosePane = null;
	//ͨ�ò������
	private MyPanel commonConfPane = null;
	//ר�ò������
	private JPanel specialConfPane = null;
	//�����������
	private JPanel publishPane = null;
	//ƽ̨ѡ���ǩ
	private JLabel platformChooseLbl = null;
	//ƽ̨ѡ�������б��
	private JComboBox<String> platformChooseCombo = null;
	//�û�����ǩ
	private JLabel usernameLbl = null;
	//�û��������
	private JTextField usernameTxt = null;
	//�����ǩ
	private JLabel passwordLbl = null;
	//���������
	private JTextField passwordTxt = null;
	//�����û���ť
	private JButton saveUserBtn = null;
	//����ѡ���ǩ
	private JLabel carTypeLbl = null;
	//����ѡ���
	private  JComboBox<String> carTypeCombo = null;
	//��Ʒ����
	private JLabel productTitleLbl = null;
	//��Ʒ���������
	private JTextField productTitleTxt = null;
	//��ϵ�绰
	private JLabel phoneLbl = null;
	//��ϵ�绰�����
	private JTextField phoneTxt = null;
	//�ؼ���
	private JLabel keywordLbl = null;
	//�ؼ��������
	private JTextField keywordTxt = null;
	//�۸�
	private JLabel priceLbl = null;
	//�۸������
	private JTextField priceTxt = null;
	//����
	private JLabel countLbl = null;
	//���������
	private JTextField countTxt = null;
	//����ˢ��
	private JLabel refreshTimeLbl = null;
	//����ˢ��ѡ���
	private JComboBox<String> refreshTimeCombo = null;
	//�������
	private JLabel publishTimeLbl = null;
	//�������ѡ���
	private JComboBox<String> publishTimeCombo = null;
	
	private JLabel brandLbl = null;
	
	private JTextField brandTxt = null;
	
	private JLabel modelLbl = null;
	
	private JTextField modelTxt = null;
	
	private JLabel fuelLbl = null;
	
	private JTextField fuelTxt = null;
	
	private JLabel motorLbl = null;
	
	private JTextField motorTxt = null;
	
	private JLabel outputLbl = null;
	
	private JTextField outputTxt = null;
	
	private JLabel chassisLbl = null;
	
	private JTextField chassisTxt = null;
	
	private JLabel letLbl = null;
	
	private JTextField letTxt = null;
	
	private JLabel powerLbl = null;
	
	private JTextField powerTxt = null;
	
	private JLabel loadLbl = null;
	
	private JTextField loadTxt = null;
	
	private JLabel axleLbl = null;
	
	private JTextField axleTxt = null;
	
	private JLabel maxSpeedLbl = null;
	
	private JTextField maxSpeedTxt = null;
	
	private JLabel averageOilLbl = null;
	
	private JTextField averageOilTxt = null;
	
	private JLabel weightLbl = null;
	
	private JTextField weightTxt = null;
	
	private JLabel sizeLbl = null;
	
	private JTextField sizeTxt = null;
	
	private JLabel addressLbl = null;
	
	private JTextField addressTxt = null;
	
	private ImageIcon background = null;
	
	private ClearCarPane clearCar;
	
	private AshCarPane ashCar;
	
	private ColdCarPane coldCar;
	
	private DeCarPane deCar;
	
	private FireCarPane fireCar;
	
	private HijackCarPane hijackCar;
	
	private MixCarPane mixCar;
	
	private OtherCarPane otherCar;
	
	private OverheadCarPane overheadCar;
	
	private SuctionSewerCarPane suctionSewerCar;
	
	private SweepCarPane sweepCar;
	
	private TankCarPane tankCar;
	
	private WaterCarPane waterCar;
	
	private WreckerCarPane wreckerCar;
	
	private AdCarPane adCar;
	
	private TruckCarPane truckCar;
	
	private Map<Integer, MyPanel> reverseCode;
	
	private JPanel smallPigPane;
	
	private JPanel contentPigPane;
	
	private JLabel smallPigTip;
	
	private JLabel contentPigTip;
	
	private JTextArea smallPig;
	
	private JTextArea contentPig;
	
	private JPanel detailsPane;
	
	private HTMLEditorPane htmlEditorPane;
	
	private JButton publish;
	
	private JButton pause;
	
	private JButton save;
	
	private FileOperator fileOperator;
	
	private HttpClient httpClient;
	
	private PublishTimer timer;
	
	public MainWindowPane(){
		fileOperator = new FileOperator();
		httpClient = new HttpClient();
		timer = new PublishTimer(httpClient, this);
		
		clearCar = new ClearCarPane();
		ashCar = new AshCarPane();
		coldCar = new ColdCarPane();
		deCar = new DeCarPane();
		fireCar = new FireCarPane();
		hijackCar = new HijackCarPane();
		mixCar = new MixCarPane();
		otherCar = new OtherCarPane();
		suctionSewerCar = new SuctionSewerCarPane();
		overheadCar = new OverheadCarPane();
		sweepCar= new SweepCarPane();
		tankCar = new TankCarPane();
		waterCar = new WaterCarPane();
		wreckerCar = new WreckerCarPane();
		adCar = new AdCarPane();
		truckCar = new TruckCarPane();
		
		reverseCode = new HashMap<Integer, MyPanel>();
		reverseCode.put(1, waterCar);
		reverseCode.put(2, sweepCar);
		reverseCode.put(3, suctionSewerCar);
		reverseCode.put(4, deCar);
		reverseCode.put(5, ashCar);
		reverseCode.put(6, coldCar);
		reverseCode.put(7, wreckerCar);
		reverseCode.put(8, truckCar);
		reverseCode.put(9, hijackCar);
		reverseCode.put(10, fireCar);
		reverseCode.put(11, tankCar);
		reverseCode.put(12, adCar);
		reverseCode.put(13, clearCar);
		reverseCode.put(14, overheadCar);
		reverseCode.put(15, mixCar);
		reverseCode.put(16, otherCar);
		
		initPlatformChoosePane();
		initPublishPane();
		initCommonConfPane();
		initSpecialConfPane();
		initSmallPigPane();
		initContentPigPane();
		initDetailsPane();
		
		background = new ImageIcon(System.getProperty("user.dir") + "/resources/image/bg.jpg");
		
		publish = new JButton("һ������");
		publish.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int platformId = platformChooseCombo.getSelectedIndex();
				if(platformId == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "����ѡ��ƽ̨");
					platformChooseCombo.requestFocus();
					platformChooseCombo.showPopup();
					return;
				}
				int carType = carTypeCombo.getSelectedIndex();
				if(carType == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "��ѡ��Ҫ�����ĳ���");
					carTypeCombo.requestFocus();
					carTypeCombo.showPopup();
					return;
				}
				//��ȡѡ���ר�ò������
				if(!((reverseCode.get(carType)).isLegal() && MainWindowPane.this.isLegal())){
					JOptionPane.showMessageDialog(MainWindowPane.this, "<html><body>��*�Ĳ���Ϊ�������<br>����д�����ٷ���</body></html>");
					return;
				}
				//��ȡ�����б�
				fileOperator.readCarInfo(platformId + "_" + carType);
				Map<String, String> names = fileOperator.getNotReadyAttr();
				Map<String, String> allAttr = fileOperator.getReadyAttr();
				Map<String, String> values = reverseCode.get(carType).getNameAndValue();
				Map<String, String> commonValues = commonConfPane.getNameAndValue();
				Set<String> keys = values.keySet();
				for(String key : keys) {
					if(names.get(key) != null && !names.get(key).equals(""))
						allAttr.put(names.get(key), values.get(key));
				}
				keys = commonValues.keySet();
				for(String key : keys)
					if(names.get(key) != null && !names.get(key).equals(""))
						allAttr.put(names.get(key), commonValues.get(key));
				//����ͼƬ
				String images = smallPig.getText();
				String[] image = images.split("\n");
				if(image.length <= 3) {
					for(int i = 0; i < image.length; i++)
						allAttr.put(names.get(1005 + i + ""), image[i]);
				}
				else {
					JOptionPane.showMessageDialog(MainWindowPane.this, "ͼƬ����һ��������ţ�ÿ��һ��");
					return;
				}
				allAttr.put(names.get("1001"), productTitleTxt.getText());
				allAttr.put(names.get("1002"), keywordTxt.getText());
				allAttr.put(names.get("1003"), priceTxt.getText());
				allAttr.put(names.get("1004"), htmlEditorPane.getText());
				//��¼����ȡcorpid
				String username = usernameTxt.getText();
				String password = passwordTxt.getText();
				try {
					httpClient.login(username, password, platformId);
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(MainWindowPane.this, "��¼��������������������Ƿ���Ч");
					return;
				}
				//�������в������������������
				int time = publishTimeCombo.getSelectedIndex() * 3;
				if(time == 0)
					try {
						httpClient.publish(allAttr, platformId);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(MainWindowPane.this, "������Ϣ�������������õĲ��������������Ƿ���Ч");
						return;
					}
				else {
					timer.setIndex(platformId);
					timer.setParams(allAttr);
					timer.setTime(time);
					timer.start();
				}
				pause.setEnabled(true);
				publish.setEnabled(false);
			}
			
		});
		pause = new JButton("��ͣ");
		pause.setEnabled(false);
		pause.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					timer.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				pause.setEnabled(false);
				publish.setEnabled(true);
			}
			
		});
		
		save = new JButton("����Ϊģ��");
		publish.setFont(new Font("����", Font.PLAIN, 13));
		save.setFont(new Font("����", Font.PLAIN, 13));
		publish.setBounds(940, 600, 120, 30);
		save.setBounds(940, 640, 120, 30);
		
		this.setSize(1085, 900);
		this.setLayout(null);
		this.add(platformChoosePane);
		this.add(publishPane);
		this.add(commonConfPane);
		this.add(specialConfPane);
		this.add(smallPigPane);
		this.add(contentPigPane);
		this.add(detailsPane);
		this.add(publish);
		this.add(save);
	}
	
	/**
	 * ��ʼ������ƽ̨������������
	 */
	private void initPlatformChoosePane(){
		platformChooseLbl = new JLabel("*ƽ̨ѡ��:");
		platformChooseLbl.setBounds(20, 20, 70, 20);
		platformChooseLbl.setFont(new Font("����", Font.PLAIN, 13));
		
		String[] platformName = {"-��ѡ��-", "��ɲ���", "���繤��", "�۴���", "51����", "�����", "һ����Ӧ"};
		platformChooseCombo = new JComboBox<String>(platformName);
		platformChooseCombo.setSelectedIndex(0);
		platformChooseCombo.setFont(new Font("����", Font.PLAIN, 13));
		platformChooseCombo.setBounds(90, 20, 100, 20);
		platformChooseCombo.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(platformChooseCombo.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "����ƽ̨����Ϊ��!");
					platformChooseCombo.requestFocus();
					platformChooseCombo.showPopup();
				}
			}
			
		});
		
		usernameLbl = new JLabel("*�û���:");
		usernameLbl.setFont(new Font("����", Font.PLAIN, 13));
		usernameLbl.setBounds(200, 20, 60, 20);
		
		usernameTxt = new JTextField();
		usernameTxt.setFont(new Font("����", Font.PLAIN, 13));
		usernameTxt.setBounds(260, 20, 150, 20);
		
		passwordLbl = new JLabel("*����:");
		passwordLbl.setFont(new Font("����", Font.PLAIN, 13));
		passwordLbl.setBounds(420, 20, 50, 20);
		
		passwordTxt = new JTextField();
		passwordTxt.setFont(new Font("����", Font.PLAIN, 13));
		passwordTxt.setBounds(470, 20, 150, 20);
		
		saveUserBtn = new JButton("�����û�");
		saveUserBtn.setFont(new Font("����", Font.PLAIN, 13));
		saveUserBtn.setBounds(630, 20, 90, 20);
		
		platformChoosePane = new JPanel();
		platformChoosePane.setBorder(BorderFactory.createTitledBorder("ƽ̨����"));
		platformChoosePane.setSize(870, 50);
		platformChoosePane.setBounds(10, 5, 870, 50);
		platformChoosePane.setLayout(null);
		platformChoosePane.setOpaque(false);
		
		platformChoosePane.add(platformChooseLbl);
		platformChoosePane.add(platformChooseCombo);
		platformChoosePane.add(usernameLbl);
		platformChoosePane.add(usernameTxt);
		platformChoosePane.add(passwordLbl);
		platformChoosePane.add(passwordTxt);
		platformChoosePane.add(saveUserBtn);
	}
	
	/**
	 * ��ʼ�����з�������ϵĿؼ�
	 */
	private void initPublishPane(){
		carTypeLbl = new JLabel("*����ѡ��:");
		carTypeLbl.setFont(new Font("����", Font.PLAIN, 13));
		carTypeLbl.setBounds(20, 20, 70, 20);
		
		String[] carType = {"-��ѡ��-", "��ˮ��", "ɨ·��", "���೵", "������", "��س�", "���ϳ�", "�泵��",
				"������", "������", "�͹޳�", "��泵", "��ѹ��ϴ��", "�߿���ҵ��", "���������賵", "����ר�ó�"};
		carTypeCombo = new JComboBox<String>(carType);
		carTypeCombo.setFont(new Font("����", Font.PLAIN, 13));
		carTypeCombo.setBounds(90, 20, 110, 20);
		carTypeCombo.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(carTypeCombo.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(MainWindowPane.this, "���Ͳ���Ϊ��!");
					carTypeCombo.requestFocus();
					carTypeCombo.showPopup();
				}
			}
			
		});
		carTypeCombo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				specialConfPane.removeAll();
				if(carTypeCombo.getSelectedIndex() != 0){
					specialConfPane.add(reverseCode.get(carTypeCombo.getSelectedIndex()));
				}
				specialConfPane.repaint();
			}
			
		});
		
		productTitleLbl = new JLabel("*����:");
		productTitleLbl.setFont(new Font("����", Font.PLAIN, 13));
		productTitleLbl.setBounds(210, 20, 50, 20);
		
		productTitleTxt = new JTextField();
		productTitleTxt.setFont(new Font("����", Font.PLAIN, 13));
		productTitleTxt.setBounds(260, 20, 250, 20);
		productTitleTxt.setName("1001");
		
		phoneLbl = new JLabel("��ϵ�绰:");
		phoneLbl.setFont(new Font("����", Font.PLAIN, 13));
		phoneLbl.setBounds(520, 20, 70, 20);
		
		phoneTxt = new JTextField();
		phoneTxt.setFont(new Font("����", Font.PLAIN, 13));
		phoneTxt.setBounds(590, 20, 90, 20);
		
		keywordLbl = new JLabel("*�ؼ���:");
		keywordLbl.setFont(new Font("����", Font.PLAIN, 13));
		keywordLbl.setBounds(20, 50, 70, 20);
		
		keywordTxt = new JTextField();
		keywordTxt.setFont(new Font("����", Font.PLAIN, 13));
		keywordTxt.setBounds(90, 50, 300, 20);
		keywordTxt.setName("1002");
		
		priceLbl = new JLabel("*����:");
		priceLbl.setFont(new Font("����", Font.PLAIN, 13));
		priceLbl.setBounds(400, 50, 60, 20);
		
		priceTxt = new JTextField();
		priceTxt.setFont(new Font("����", Font.PLAIN, 13));
		priceTxt.setBounds(460, 50, 70, 20);
		priceTxt.setName("1003");
		
		countLbl = new JLabel("*��Ʒ���:");
		countLbl.setFont(new Font("����", Font.PLAIN, 13));
		countLbl.setBounds(540, 50, 70, 20);
		countTxt = new JTextField();
		countTxt.setFont(new Font("����", Font.PLAIN, 13));
		countTxt.setBounds(610, 50, 70, 20);
		
		refreshTimeLbl = new JLabel("����ˢ��ʱ��:");
		refreshTimeLbl.setFont(new Font("����", Font.PLAIN, 13));
		refreshTimeLbl.setBounds(690, 50, 90, 20);
		
		String[] refreshTime = {"��һ��", "1����", "5����"};
		refreshTimeCombo = new JComboBox<String>(refreshTime);
		refreshTimeCombo.setFont(new Font("����", Font.PLAIN, 13));
		refreshTimeCombo.setSelectedIndex(0);
		refreshTimeCombo.setBounds(780, 50, 70, 20);
		
		publishTimeLbl = new JLabel("�������ʱ��:");
		publishTimeLbl.setFont(new Font("����", Font.PLAIN, 13));
		publishTimeLbl.setBounds(690, 20, 90, 20);
		
		String[] publishTime = {"��һ��", "3����", "6����", "9����"};
		publishTimeCombo = new JComboBox<String>(publishTime);
		publishTimeCombo.setFont(new Font("����", Font.PLAIN, 13));
		publishTimeCombo.setSelectedIndex(0);
		publishTimeCombo.setBounds(780, 20, 70, 20);
		
		publishPane = new JPanel();
		publishPane.setBorder(BorderFactory.createTitledBorder("��������"));
		publishPane.setSize(870, 80);
		publishPane.setBounds(10, 60, 870, 80);
		publishPane.setLayout(null);
		publishPane.setOpaque(false);
		
		publishPane.add(carTypeLbl);
		publishPane.add(carTypeCombo);
		publishPane.add(productTitleLbl);
		publishPane.add(productTitleTxt);
		publishPane.add(phoneLbl);
		publishPane.add(phoneTxt);
		publishPane.add(keywordLbl);
		publishPane.add(keywordTxt);
		publishPane.add(priceLbl);
		publishPane.add(priceTxt);
		publishPane.add(countLbl);
		publishPane.add(countTxt);
		publishPane.add(refreshTimeLbl);
		publishPane.add(refreshTimeCombo);
		publishPane.add(publishTimeLbl);
		publishPane.add(publishTimeCombo);
	}
	
	private void initCommonConfPane(){
		brandLbl = new JLabel("*Ʒ��:");
		brandLbl.setFont(new Font("����", Font.PLAIN, 13));
		brandLbl.setBounds(10, 20, 100, 20);
		brandTxt = new JTextField();
		brandTxt.setName("1");
		brandTxt.setFont(new Font("����", Font.PLAIN, 13));
		brandTxt.setBounds(110, 20, 150, 20);
		
		modelLbl = new JLabel("*�ͺ�:");
		modelLbl.setFont(new Font("����", Font.PLAIN, 13));
		modelLbl.setBounds(10, 45, 100, 20);
		modelTxt = new JTextField();
		modelTxt.setName("2");
		modelTxt.setFont(new Font("����", Font.PLAIN, 13));
		modelTxt.setBounds(110, 45, 150, 20);
		
		fuelLbl = new JLabel("ȼ������:");
		fuelLbl.setFont(new Font("����", Font.PLAIN, 13));
		fuelLbl.setBounds(10, 70, 100, 20);
		fuelTxt = new JTextField();
		fuelTxt.setName("3");
		fuelTxt.setFont(new Font("����", Font.PLAIN, 13));
		fuelTxt.setBounds(110, 70, 150, 20);
		
		motorLbl = new JLabel("�������ͺ�:");
		motorLbl.setFont(new Font("����", Font.PLAIN, 13));
		motorLbl.setBounds(10, 95, 100, 20);
		motorTxt = new JTextField();
		motorTxt.setName("4");
		motorTxt.setFont(new Font("����", Font.PLAIN, 13));
		motorTxt.setBounds(110, 95, 150, 20);
		
		outputLbl = new JLabel("*����L:");
		outputLbl.setFont(new Font("����", Font.PLAIN, 13));
		outputLbl.setBounds(10, 120, 100, 20);
		outputTxt = new JTextField();
		outputTxt.setName("5");
		outputTxt.setFont(new Font("����", Font.PLAIN, 13));
		outputTxt.setBounds(110, 120, 150, 20);
		
		chassisLbl = new JLabel("�����ͺ�:");
		chassisLbl.setFont(new Font("����", Font.PLAIN, 13));
		chassisLbl.setBounds(10, 145, 100, 20);
		chassisTxt = new JTextField();
		chassisTxt.setName("6");
		chassisTxt.setFont(new Font("����", Font.PLAIN, 13));
		chassisTxt.setBounds(110, 145, 150, 20);
		
		letLbl = new JLabel("�ŷű�׼:");
		letLbl.setFont(new Font("����", Font.PLAIN, 13));
		letLbl.setBounds(10, 170, 100, 20);
		letTxt = new JTextField();
		letTxt.setName("7");
		letTxt.setFont(new Font("����", Font.PLAIN, 13));
		letTxt.setBounds(110, 170, 150, 20);
		
		powerLbl = new JLabel("�����kw:");
		powerLbl.setFont(new Font("����", Font.PLAIN, 13));
		powerLbl.setBounds(10, 195, 100, 20);
		powerTxt = new JTextField();
		powerTxt.setName("8");
		powerTxt.setFont(new Font("����", Font.PLAIN, 13));
		powerTxt.setBounds(110, 195, 150, 20);
		
		loadLbl = new JLabel("�������kg:");
		loadLbl.setFont(new Font("����", Font.PLAIN, 13));
		loadLbl.setBounds(10, 220, 100, 20);
		loadTxt = new JTextField();
		loadTxt.setName("9");
		loadTxt.setFont(new Font("����", Font.PLAIN, 13));
		loadTxt.setBounds(110, 220, 150, 20);
		
		axleLbl = new JLabel("���mm:");
		axleLbl.setFont(new Font("����", Font.PLAIN, 13));
		axleLbl.setBounds(10, 245, 100, 20);
		axleTxt = new JTextField();
		axleTxt.setName("10");
		axleTxt.setFont(new Font("����", Font.PLAIN, 13));
		axleTxt.setBounds(110, 245, 150, 20);
		
		maxSpeedLbl = new JLabel("��߳���km/h:");
		maxSpeedLbl.setFont(new Font("����", Font.PLAIN, 13));
		maxSpeedLbl.setBounds(10, 270, 100, 20);
		maxSpeedTxt = new JTextField();
		maxSpeedTxt.setName("11");
		maxSpeedTxt.setFont(new Font("����", Font.PLAIN, 13));
		maxSpeedTxt.setBounds(110, 270, 150, 20);
		
		sizeLbl = new JLabel("���γߴ�m*m*m:");
		sizeLbl.setFont(new Font("����", Font.PLAIN, 13));
		sizeLbl.setBounds(10, 295, 100, 20);
		sizeTxt = new JTextField();
		sizeTxt.setName("12");
		sizeTxt.setFont(new Font("����", Font.PLAIN, 13));
		sizeTxt.setBounds(110, 295, 150, 20);
		
		averageOilLbl = new JLabel("�ͺ�L/100km:");
		averageOilLbl.setFont(new Font("����", Font.PLAIN, 13));
		averageOilLbl.setBounds(10, 320, 100, 20);
		averageOilTxt = new JTextField();
		averageOilTxt.setName("13");
		averageOilTxt.setFont(new Font("����", Font.PLAIN, 13));
		averageOilTxt.setBounds(110, 320, 150, 20);
		
		addressLbl = new JLabel("�������ڵ�:");
		addressLbl.setFont(new Font("����", Font.PLAIN, 13));
		addressLbl.setBounds(10, 345, 100, 20);
		addressTxt = new JTextField();
		addressTxt.setName("14");
		addressTxt.setFont(new Font("����", Font.PLAIN, 13));
		addressTxt.setBounds(110, 345, 150, 20);
		
		weightLbl = new JLabel("������kg:");
		weightLbl.setFont(new Font("����", Font.PLAIN, 13));
		weightLbl.setBounds(10, 370, 100, 20);
		weightTxt = new JTextField();
		weightTxt.setName("15");
		weightTxt.setFont(new Font("����", Font.PLAIN, 13));
		weightTxt.setBounds(110, 370, 150, 20);
		
		commonConfPane = new MyPanel();
		commonConfPane.setLayout(null);
		commonConfPane.setBorder(BorderFactory.createTitledBorder("ͨ�ò���"));
		commonConfPane.setBounds(10, 145, 270, 400);
		commonConfPane.setOpaque(false);
		commonConfPane.setAutoscrolls(true);
		
		commonConfPane.add(brandLbl);
		commonConfPane.add(brandTxt);
		commonConfPane.add(modelLbl);
		commonConfPane.add(modelTxt);
		commonConfPane.add(fuelLbl);
		commonConfPane.add(fuelTxt);
		commonConfPane.add(motorLbl);
		commonConfPane.add(motorTxt);
		commonConfPane.add(outputLbl);
		commonConfPane.add(outputTxt);
		commonConfPane.add(chassisLbl);
		commonConfPane.add(chassisTxt);
		commonConfPane.add(letLbl);
		commonConfPane.add(letTxt);
		commonConfPane.add(powerLbl);
		commonConfPane.add(powerTxt);
		commonConfPane.add(loadLbl);
		commonConfPane.add(loadTxt);
		commonConfPane.add(axleLbl);
		commonConfPane.add(axleTxt);
		commonConfPane.add(maxSpeedLbl);
		commonConfPane.add(maxSpeedTxt);
		commonConfPane.add(sizeLbl);
		commonConfPane.add(sizeTxt);
		commonConfPane.add(averageOilLbl);
		commonConfPane.add(averageOilTxt);
		commonConfPane.add(addressLbl);
		commonConfPane.add(addressTxt);
		commonConfPane.add(weightLbl);
		commonConfPane.add(weightTxt);
	}
	
	private void initSpecialConfPane(){
		specialConfPane = new JPanel();
		specialConfPane.setBorder(BorderFactory.createTitledBorder("ר�ò���"));
		specialConfPane.setBounds(290, 145, 270, 400);
		specialConfPane.setOpaque(false);
		specialConfPane.setLayout(null);
	}
	
	private void initSmallPigPane(){
		smallPigTip = new JLabel("СͼƬ�������(��дͼƬ�����ַ):");
		smallPigTip.setFont(new Font("����", Font.PLAIN, 12));
		smallPigTip.setBounds(10, 20, 200, 20);
		smallPig = new JTextArea();
		smallPig.setName("1005");
		smallPig.setLineWrap(true);
		smallPig.setFont(new Font("����", Font.PLAIN, 13));
		smallPig.setBounds(10, 45, 480, 140);
		
		smallPigPane = new JPanel();
		smallPigPane.setBorder(BorderFactory.createTitledBorder("СͼƬ"));
		smallPigPane.setBounds(570, 145, 500, 195);
		smallPigPane.setLayout(null);
		smallPigPane.setOpaque(false);
		
		smallPigPane.add(smallPigTip);
		smallPigPane.add(smallPig);
	}
	
	private void initContentPigPane(){
		contentPigTip = new JLabel("����ͼƬ��������(��дͼƬ�����ַ):");
		contentPigTip.setFont(new Font("����", Font.PLAIN, 12));
		contentPigTip.setBounds(10, 20, 300, 20);
		contentPig = new JTextArea();
		contentPig.setLineWrap(true);
		contentPig.setFont(new Font("����", Font.PLAIN, 13));
		contentPig.setBounds(10, 45, 480, 140);
		
		contentPigPane = new JPanel();
		contentPigPane.setBorder(BorderFactory.createTitledBorder("����ͼƬ"));
		contentPigPane.setLayout(null);
		contentPigPane.setOpaque(false);
		contentPigPane.setBounds(570, 345, 500, 195);
		
		contentPigPane.add(contentPigTip);
		contentPigPane.add(contentPig);
	}
	
	private void initDetailsPane(){
		detailsPane = new JPanel();
		detailsPane.setBorder(BorderFactory.createTitledBorder("��Ʒ����"));
		detailsPane.setLayout(null);
		detailsPane.setOpaque(false);
		detailsPane.setBounds(10, 545, 920, 300);
		
		htmlEditorPane = new HTMLEditorPane();
		htmlEditorPane.setBounds(10, 20, 900, 270);
		htmlEditorPane.setName("1004");
		
		detailsPane.add(htmlEditorPane);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getImage(), 0, 0, 1085, 900, null);
	}
	
	
	private boolean isLegal() {
		if(usernameTxt.getText() != null && !usernameTxt.getText().equals("")
				&& passwordTxt.getText() != null && !passwordTxt.getText().equals("")
				&& productTitleTxt.getText() != null && !productTitleTxt.getText().equals("")
				&& keywordTxt.getText() != null && !keywordTxt.getText().equals("")
				&& priceTxt.getText() != null && !priceTxt.getText().equals("")
				&& countTxt.getText() != null && !countTxt.getText().equals("")
				&& brandTxt.getText() != null && !brandTxt.getText().equals("")
				&& modelTxt.getText() != null && !modelTxt.getText().equals("")
				&& outputTxt.getText() != null && !outputTxt.getText().equals("")
				&& smallPig.getText() != null && !smallPig.getText().equals(""))
			return true;
		else
			return false;
	}
}
