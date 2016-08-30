package com.b5m.www.B5Capi;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.*;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.http.*;

import com.gargoylesoftware.htmlunit.util.NameValuePair;

public class TestPost {

	public static void main(String[] args) {
		  // 创建默认的httpClient实例.    
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        // 创建httppost    
        HttpPost httppost = new HttpPost("http://b5caiapi.stage.com/user/login.json");  
        // 创建参数队列    
        List<org.apache.http.NameValuePair> formparams = new ArrayList<org.apache.http.NameValuePair>();  
        formparams.add(new BasicNameValuePair("account", "15921826291"));  
        formparams.add(new BasicNameValuePair("pwd", "dc483e80a7a0bd9ef71d8cf973673924"));  
        UrlEncodedFormEntity uefEntity;  
        try {  
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
            httppost.setEntity(uefEntity);  
            System.out.println("executing request " + httppost.getURI());  
            CloseableHttpResponse response = httpclient.execute(httppost);  
            try {  
                HttpEntity entity = response.getEntity();  
                if (entity != null) {  
                    System.out.println("--------------------------------------");  
                    System.out.println("Response content: " +  EntityUtils.toString(entity, "UTF-8"));  
                    System.out.println("--------------------------------------");  
                    System.out.println("Response HTTP Code: " + response.getStatusLine());
                }  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e1) {  
            e1.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            // 关闭连接,释放资源    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
	}

}
