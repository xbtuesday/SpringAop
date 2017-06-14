package com.Lpan.SaopTest.payCenter.model;

import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class HttpRequestModel extends BaseModel{
	
	private String uri;
	private String getOrPost;
	private String charset="UTF-8";
	private String contentType="application/x-www-form-urlencoded; charset=UTF-8";
	private Map<String,Object> paramMap;
	private boolean isSSLValidate = false;
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getGetOrPost() {
		return getOrPost;
	}
	public void setGetOrPost(String getOrPost) {
		this.getOrPost = getOrPost;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Map<String, Object> getParamMap() {
		return paramMap;
	}
	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}
	public boolean isSSLValidate() {
		return isSSLValidate;
	}
	public void setSSLValidate(boolean isSSLValidate) {
		this.isSSLValidate = isSSLValidate;
	}
	
}
