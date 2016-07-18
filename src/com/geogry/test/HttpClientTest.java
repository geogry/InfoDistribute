package com.geogry.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.geogry.file.FileOperator;

public class HttpClientTest {

	private BasicCookieStore cookieStore = null;
	
	private CloseableHttpClient httpClient = null;
	
	public void login(){
		String vid = UUID.randomUUID().toString();
		vid = vid.replace("-", "");
		vid = vid.toUpperCase();
		String PHPSESSID = UUID.randomUUID().toString();
		PHPSESSID = PHPSESSID.replace("-", "");
		
		FileOperator db = new FileOperator(); 
		
		cookieStore = new BasicCookieStore();
		httpClient = HttpClients.custom()
				.setDefaultCookieStore(cookieStore)
				.build();
		HttpPost httpPost = new HttpPost("http://china.makepolo.com/ucenter/login/new_login_p.php");
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("username", "576909590@qq.com"));
		params.add(new BasicNameValuePair("passwd", "wy7082391.,"));
		params.add(new BasicNameValuePair("remember_state", "0"));
		params.add(new BasicNameValuePair("gotourl", "http://my.b2b.makepolo.com/ucenter"));
		
		List<NameValuePair> attr = new ArrayList<NameValuePair>();
		attr.add(new BasicNameValuePair("4724[11526][one]", "243156_olopekam_其他"));
		attr.add(new BasicNameValuePair("4724[11526][other]", "5425"));
		attr.add(new BasicNameValuePair("4724[11527][one]", "303223_olopekam_其他"));
		attr.add(new BasicNameValuePair("4724[11527][other]", "3"));
		attr.add(new BasicNameValuePair("4724[11528]", "213"));
		attr.add(new BasicNameValuePair("4724[154321]", "钱1243"));
		attr.add(new BasicNameValuePair("4724[154322]", "4652345346"));
		attr.add(new BasicNameValuePair("4724[154323]", "342"));
		attr.add(new BasicNameValuePair("4724[154324]", "3124"));
		attr.add(new BasicNameValuePair("4724[154325]", "324"));
		attr.add(new BasicNameValuePair("4724[154326]", "哇3432"));
		attr.add(new BasicNameValuePair("4724[154327]", "324"));
		attr.add(new BasicNameValuePair("4724[154328]", "12"));
		attr.add(new BasicNameValuePair("4724[154329]", "65"));
		attr.add(new BasicNameValuePair("4724[154330]", "123"));
		attr.add(new BasicNameValuePair("4724[154331]", "4325"));
		attr.add(new BasicNameValuePair("4724[154332]", "32"));
		attr.add(new BasicNameValuePair("4724[154333]", "76"));
		attr.add(new BasicNameValuePair("4724[154334]", "12341"));
		attr.add(new BasicNameValuePair("4724[154335]", "654"));
		attr.add(new BasicNameValuePair("4724[154336]", "213"));
		attr.add(new BasicNameValuePair("4724[157731]", "324"));
		attr.add(new BasicNameValuePair("4724[162107]", "212"));
		attr.add(new BasicNameValuePair("4724_11526", "11526,类型,"));
		attr.add(new BasicNameValuePair("4724_11527", "11527,品牌,"));
		attr.add(new BasicNameValuePair("4724_11528", "11528,型号,"));
		attr.add(new BasicNameValuePair("4724_154321", "154321,底盘型号,"));
		attr.add(new BasicNameValuePair("4724_154322", "154322,整车外型尺寸,mm"));
		attr.add(new BasicNameValuePair("4724_154323", "154323,罐体容积,m3"));
		attr.add(new BasicNameValuePair("4724_154324", "154324,发动机型号,"));
		attr.add(new BasicNameValuePair("4724_154325", "154325,洒水量,L/m2"));
		attr.add(new BasicNameValuePair("4724_154326", "154326,洒水宽度,m"));
		attr.add(new BasicNameValuePair("4724_154327", "154327,吸水深度,m"));
		attr.add(new BasicNameValuePair("4724_154328", "154328,射程,m"));
		attr.add(new BasicNameValuePair("4724_154329", "154329,百公里油耗,L"));
		attr.add(new BasicNameValuePair("4724_154330", "154330,额定载质量,Kg"));
		attr.add(new BasicNameValuePair("4724_154331", "154331,水泵流量,"));
		attr.add(new BasicNameValuePair("4724_154332", "154332,水泵压力,Mpa"));
		attr.add(new BasicNameValuePair("4724_154333", "154333,轴距,mm"));
		attr.add(new BasicNameValuePair("4724_154334", "154334,最高车速,Km/h"));
		attr.add(new BasicNameValuePair("4724_154335", "154335,最小离地间隙,mm"));
		attr.add(new BasicNameValuePair("4724_154336", "154336,作业速度,Km/h"));
		attr.add(new BasicNameValuePair("4724_157731", "157731,整备质量,kg"));
		attr.add(new BasicNameValuePair("4724_162107", "162107,洒水压力,MPa"));
		attr.add(new BasicNameValuePair("corp_id", "100013271567"));
		attr.add(new BasicNameValuePair("first_cat", "0"));
		attr.add(new BasicNameValuePair("five_cate", "4724"));
		attr.add(new BasicNameValuePair("image_1_id", "4_5b35c10e17cab8420a4a31bf9406b111.jpg"));
		attr.add(new BasicNameValuePair("image_2_id", "4_aaf4158638fcc75480d52a28e96d7da8.jpg"));
		attr.add(new BasicNameValuePair("image_3_id", "4_aaf4158638fcc75480d52a28e96d7da8.jpg"));
		attr.add(new BasicNameValuePair("image_4_id", ""));
		attr.add(new BasicNameValuePair("img_queue_domain", "queue.img.makepolo.com"));
		attr.add(new BasicNameValuePair("integrity", "78"));
		attr.add(new BasicNameValuePair("min_purchase_type", "0"));
		attr.add(new BasicNameValuePair("pagetype", "add"));
		attr.add(new BasicNameValuePair("price_unit", "14"));
		attr.add(new BasicNameValuePair("price_unit_name", "件"));
		attr.add(new BasicNameValuePair("pro_category", "10,4724"));
		attr.add(new BasicNameValuePair("publish_title", "公路街道东风5吨洒水车水地车"));
		attr.add(new BasicNameValuePair("radio_val", "303223_olopekam_其他,243156_olopekam_其他"));
		attr.add(new BasicNameValuePair("stock_state", "0"));
		attr.add(new BasicNameValuePair("title", "洒水车"));
		attr.add(new BasicNameValuePair("unit_price", "12000"));
		attr.add(new BasicNameValuePair("xyz", ""));
		attr.add(new BasicNameValuePair("tongyi", ""));
		attr.add(new BasicNameValuePair("stock_num1", ""));
		attr.add(new BasicNameValuePair("stock_num1", ""));
		attr.add(new BasicNameValuePair("source", ""));
		attr.add(new BasicNameValuePair("s_weight", ""));
		attr.add(new BasicNameValuePair("promotional_posters", ""));
		attr.add(new BasicNameValuePair("maket_price", ""));
		attr.add(new BasicNameValuePair("old_publish_title", ""));
		attr.add(new BasicNameValuePair("paramname[]", "参数名"));
		attr.add(new BasicNameValuePair("paramval[]", "参数名"));
		attr.add(new BasicNameValuePair("content", "gchsfgshfgshfgdhsdfhfdghfgsddfvfdgdgsfl;sakjfwepo[jkl;cmkl;xcmvncsvndfgahskl;dgsvnxcdzfnl;skdhjgjjfbankdbxncjbsfjhsgbsdfgsfg"));
		
		HttpPost category = new HttpPost("http://my.b2b.makepolo.com/ucenter/product/product_add_p_new.php");
		
		
		try {
			httpPost.addHeader("Cookie", "PHPSESSID=" + PHPSESSID + ";_vid=" + vid);
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(params, "UTF-8");
			httpPost.setEntity(uefEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if(entity != null)
				System.out.println(EntityUtils.toString(entity, "UTF-8"));
			List<Cookie> cookies = cookieStore.getCookies();
			String cookie = "";
			for(int i = 0; i < cookies.size(); i++){
				System.out.println(cookies.get(i).toString());
				cookie += cookies.get(i).getName() + "=" + cookies.get(i).getValue() + ";";
			}
			cookie += "PHPSESSID=" + PHPSESSID + ";_vid=" + vid;
			//cookie += ";cate_id=4724;cate_ids=10,4724";
			cookie += ";integrity=78";
			category.addHeader("Cookie", cookie);
			UrlEncodedFormEntity productEntity = new UrlEncodedFormEntity(attr, "UTF-8");
			category.setEntity(productEntity);
			response = httpClient.execute(category);
			entity = response.getEntity();
			System.out.println("访问状态：" + response.getStatusLine());
			if(entity != null)
				System.out.println(EntityUtils.toString(entity, "UTF-8"));
			System.out.println("最后cookies");
			cookies = cookieStore.getCookies();
			for(int i = 0; i < cookies.size(); i++){
				System.out.println(cookies.get(i).toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
