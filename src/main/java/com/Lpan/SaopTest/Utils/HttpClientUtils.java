package com.Lpan.SaopTest.Utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;

import com.Lpan.SaopTest.payCenter.model.HttpRequestModel;

public class HttpClientUtils {
	
	/**
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
		if("POST".equals(httpRequestModel.getGetOrPost())){
			HttpPost httppost = new HttpPost(httpRequestModel.getUri());
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			if(httpRequestModel.getParamMap() != null && !httpRequestModel.getParamMap().isEmpty()){
				//循环map取出键和值  放到requestModel中
			}
			
		}
		return requestbase;
	}

}
