package com.tulum.prueba.escuelita.dto;

import java.io.Serializable;

public class ResultDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String success;
	private String msg;
	
	public ResultDTO() {}
	
	public ResultDTO(String successValue, String msgValue){
		this.success = successValue;
		this.msg = msgValue;
	}
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
