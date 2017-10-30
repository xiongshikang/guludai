package com.guludai.admin.common.exception;

/**
 * 异常代码，加入默认说明，这样减少配置文件的写入了
 */
public enum PlatformErrorCode {
	//检验错误,0开头
	VALIDATE_ISNULL("000001","{0} 为空"),
	VALIDATE_OVERLENGTH("000002","{0} 过长"),
	VALIDATE_PARAMER_FAIL("000003","参数不合法"),
	VALIDATE_SIGN_FAIL("000004","验签失败"),

	//系统错误，1开头
	DEFAULT("100001", "默认，无具体信息"), 
	UNKNOWN_ERROR("100002", "未知错误"), 
	

	//业务错误，2开头
	XML_SIGN_ERROR("200000","xml报文签名错误"),
	IP_ACCESS_APP_PERMISSION_ERROR("200009","此IP没有访问权限"),
	CON_THIRD_ERROR("200002", "连接第三方异常"), 
	CON_THIRD_TIMEOUT("200003", "连接第三方超时"),
	
	;
	
	private String code;

	private String defaultMessage;

	PlatformErrorCode(String code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public String getErrorCode() {
		return this.code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

}
