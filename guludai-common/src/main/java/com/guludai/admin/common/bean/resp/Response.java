package com.guludai.admin.common.bean.resp;

import java.io.Serializable;

/**
 * 公共响应对象父类
 * ClassName: Response <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年3月30日 下午6:44:40 <br/> 
 * 
 * @author mencius 
 * @version  
 * @since JDK 1.7
 */
public class Response implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 901629064397797622L;

	/**
	 * 成功返回码
	 */
	public static final String SUCCESS_RESPONSE_CODE = "0000";
	
	public Response(){
		super();
	}

	/**
	 * 
	 * @param code
	 */
	public Response(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @param code
	 * @param msg
	 */
	public Response(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	/**
	 * 返回码
	 */
	private String code;

	/**
	 * 返回信息
	 */
	private String msg;

	/**
	 *  备用1
	 */
	private String spare1;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSpare1() {
		return spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

	
}
