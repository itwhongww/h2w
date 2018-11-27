package com.wax.h2w.config.vo;

/**
 * 全局异常构造体
 * 
 * @author maoyl05
 *
 * @param <T>
 */
public class ReturnInfo<T> {
	private String code;
	private String message;
	private String url;
	private T data;

	public ReturnInfo(){}
	public ReturnInfo(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ErrorInfo [code=" + code + ", message=" + message + ", url="
				+ url + ", data=" + data + "]";
	}
}
