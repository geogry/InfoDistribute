package com.geogry.http;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpUtils {

	private BasicCookieStore cookieStore = null;
	
	private CloseableHttpClient client = null;
	
	private List<BasicNameValuePair> params = null;
	
	private HttpPost postRequest = null;
	
	private UrlEncodedFormEntity paramsFormatEntity = null;
	
	public HttpUtils(){
		cookieStore = new BasicCookieStore();
		client = HttpClients.custom()
				.setDefaultCookieStore(cookieStore)
				.build();
	}
	
	public void addCookie(Cookie cookie){
		if(!cookie.getName().equals("") && cookie.getName() != null)
			cookieStore.addCookie(cookie);
	}
	
	public void setParams(List<BasicNameValuePair> params) {
		this.params = params;
	}
	
	public void post(String url, List<BasicNameValuePair> params) throws IOException {
		this.setParams(params);
		this.post(url);
	}
	
	private void post(String url) throws IOException {
		HttpClientContext context = HttpClientContext.create();
		context.setCookieStore(cookieStore);

		paramsFormatEntity = new UrlEncodedFormEntity(this.params, "UTF-8");
		postRequest = new HttpPost(url);
		postRequest.setEntity(paramsFormatEntity);

		CloseableHttpResponse response = client.execute(postRequest, context);
		System.out.println("·ÃÎÊ×´Ì¬ : " + response.getStatusLine());
		HttpEntity entity = response.getEntity();
		if(entity != null)
			System.out.println(EntityUtils.toString(entity, "UTF-8"));
	}
	
	public void printCookies(){
		List<Cookie> cookies = cookieStore.getCookies();
		for(Cookie cookie : cookies)
			System.out.println(cookie.toString());
	}
	
	public List<Cookie> getCookies(){
		return cookieStore.getCookies();
	}
	
	public void closeClient(){
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
