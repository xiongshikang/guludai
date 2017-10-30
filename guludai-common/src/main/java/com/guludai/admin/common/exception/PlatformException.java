package com.guludai.admin.common.exception;

import java.text.MessageFormat;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * 自定义Exception ClassName: PlatformException <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2016年3月14日 下午8:25:27 <br/>
 * 
 * @author mencius
 * @version
 * @since
 */
public class PlatformException extends RuntimeException {

	private static final long serialVersionUID = 8087751174148354521L;

	// 日誌工具類
	private static final Logger logger = Logger.getLogger(PlatformException.class);
	
	protected PlatformErrorCode errorCode;
	
	protected String realCode;
	
	private Object[] arguments;
	
	private String errorMsg;

	public PlatformException() {
		super();
	}

	public PlatformException(String message) {
		super(message);
	}

	public PlatformException(Throwable cause) {
		super(cause);
	}

	public PlatformException(String message, Throwable cause) {
		super(message, cause);
	}


	public PlatformErrorCode getErrorCode() {
		return errorCode;
	}

	public PlatformException(PlatformErrorCode errorCode, String errorMsg,
			Object... arguments) {
		super();
		this.errorCode = errorCode;
		this.realCode = errorCode.getErrorCode();
		this.errorMsg = errorMsg;
		this.arguments = arguments;
	}

	public PlatformException(PlatformErrorCode errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.realCode = errorCode.getErrorCode();
	}

	@Override
	public String getMessage() {
		String notMessage = "not error, not message";
		if (errorCode == null || StringUtils.isBlank(realCode)) {
			return notMessage;
		}
		String defaultMessage = "";

		// 如果是debug模式
		if (logger.isDebugEnabled()) {
			defaultMessage = errorMsg;
		} else {
			defaultMessage = errorCode.getDefaultMessage();
		}
		if (StringUtils.isBlank(defaultMessage)) {
			return notMessage;
		}
		return MessageFormat.format(defaultMessage, this.arguments);
	}

	public String getRealCode() {
		return realCode;
	}

	public static void main(String args[]) {
		PlatformException e = new PlatformException(
				PlatformErrorCode.IP_ACCESS_APP_PERMISSION_ERROR,
				PlatformErrorCode.IP_ACCESS_APP_PERMISSION_ERROR
						.getDefaultMessage(), "A", "C");
		System.out.println(e.getMessage());
	}
}
