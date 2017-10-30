package com.guludai.admin.common.validate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 公共请求参数
 * @Description: 
 * @author duziqiang  
 * @date 2016年5月23日 上午10:02:31 
 * @version V1.0
 */
public class RequestVo {
	@NotBlank(message = "A001,版本号不能为空", groups = InsertCheck.class)
	protected String version;// 版本号

	@Length(max = 14, message = "A001,请求时间长度不能超过14位")
	protected String reqTime;// 请求时间
	@NotBlank(message = "A001,渠道号不能为空", groups = InsertCheck.class)
	@Length(max = 20, message = "A001,渠道号长度不能超过20位")
	protected String channelCode;// 渠道号
	@NotBlank(message = "A001,签名不能为空", groups = InsertCheck.class)
	protected String sign;// sign签名

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getReqTime() {
		return reqTime;
	}

	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
