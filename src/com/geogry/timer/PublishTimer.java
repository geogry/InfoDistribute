package com.geogry.timer;

import java.io.IOException;
import java.util.Map;

import javax.swing.JOptionPane;

import com.geogry.http.HttpClient;
import com.geogry.ui.MainWindowPane;

public class PublishTimer extends Thread {

	private Map<String, String> params;
	
	private int index;
	
	private HttpClient httpClient;
	
	private MainWindowPane windowPane;
	
	private int time;
	
	public PublishTimer(HttpClient httpClient, MainWindowPane windowPane) {
		this.httpClient = httpClient;
		this.windowPane = windowPane;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep((long) time * 60 * 1000);
			httpClient.publish(params, index);
		} catch (IOException | InterruptedException e) {
			JOptionPane.showMessageDialog(this.windowPane, "发布信息出错，请检查你设置的参数及网络连接是否有效");
			e.printStackTrace();
		}
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
