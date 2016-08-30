package com.b5m.www.B5Capi;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;
import org.jboss.netty.handler.codec.http.HttpResponse;

public class TestHTTPClient {

	public static void main(String[] args){
		HttpBasic basic = new HttpBasic();
		basic.Get("http://b5caiapi.stage.com/index/topbnr.json");
		System.out.println(basic.content);
		System.out.println(basic.httpCode);
		System.out.println(basic.contentLength);
		System.out.println(basic.getURI);
		System.out.println("-------------------------------------");
		System.out.println(basic.GetResponse(basic.content,"code"));
		
    }  

	}


