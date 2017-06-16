package com.Lpan.SaopTest.Utils;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.Lpan.SaopTest.payCenter.model.HttpRequestModel;

public class HttpClientUtils {
	
	/**
	 * @throws URISyntaxException 
	 * 
	 * @Title: createHttpClient
	 * @Description: TODO(创建httpclient)
	 * @param @param httpRequestModel
	 * @param @return    设定文件
	 * @return HttpRequestBase    返回类型
	 * @auther shipan
	 * @throws
	 */
	public HttpRequestBase createHttpClient(HttpRequestModel httpRequestModel){
		HttpRequestBase requestbase = null;
		try {
			if("POST".equalsIgnoreCase(httpRequestModel.getGetOrPost())){
				HttpPost httppost = new HttpPost(httpRequestModel.getUri());
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				if(httpRequestModel.getParamMap() != null && !httpRequestModel.getParamMap().isEmpty()){
					//循环map取出键和值  放到requestModel中  (取出所有的键)
					Set<Entry<String,Object>> entrySet = httpRequestModel.getParamMap().entrySet();
					for(Map.Entry<String, Object> entry:entrySet){
						params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
					}
					//设置post请求的参数
					httppost.setEntity(new UrlEncodedFormEntity(params,httpRequestModel.getCharset().toUpperCase()));
					requestbase = httppost;
				}
			}else if("GET".equalsIgnoreCase(httpRequestModel.getGetOrPost())){
				Set<Entry<String,Object>> entrySet = httpRequestModel.getParamMap().entrySet();
				StringBuffer sb = new StringBuffer();
				sb.append(httpRequestModel.getUri()+"?");
				for(Map.Entry<String, Object> entry:entrySet){
					sb.append(entry.getKey()).append("=").append(entry.getValue());
					sb.append("&");
				}
				String realUrl = sb.substring(0, sb.length()-1);
				HttpGet httpGet = new HttpGet();
				httpGet.setURI(new URI(realUrl));
				requestbase = httpGet;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(URISyntaxException e){
			e.printStackTrace();
		}
		return requestbase;
	}
	
	
	/**
	 * 
	* @Title: createHttpClient
	* @Description: TODO(创建httpclient)
	* @param @param isSSLValidate
	* @param @return    设定文件
	* @return HttpClient    返回类型
	* @auther shipan
	* @throws
	 */
	public HttpClient createHttpClient(boolean isSSLValidate){
		HttpClient httpClient = null;
		if(isSSLValidate){
			
		}else{
			httpClient = new DefaultHttpClient();
		}
		return httpClient;
	}

}
