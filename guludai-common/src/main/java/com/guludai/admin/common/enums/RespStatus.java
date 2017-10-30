/** 
 * Project Name:bill-common 
 * File Name:RespStatus.java 
 * Package Name:com.oriental.bill.common.pub.enums 
 * Date:2016年3月31日上午11:02:57 
 * Copyright (c) 2016, zhangmeng@oriental-finance.com All Rights Reserved. 
 * 
 */  
      
package com.guludai.admin.common.enums;
/** 
 * 响应码枚举
 * ClassName:RespStatus <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年10月26日 上午11:02:57 <br/>
 * @author   heqiao
 * @version   
 * @since    JDK 1.7
 * @see       
 */
public enum RespStatus {

	// 账单系统默认
	RESP_STATE_SUCCESS("0000", "接收成功"),
	RESP_STATE_FAILER("1111", "交易失败"),
	RESP_STATE_MIDDLE("2222", "处理中"),
	RESP_STATE_ABNORMAL("3333", "交易异常"),
	RESP_STATE_PART_SUCCESS("4444", "交易部分成功"),
	RESP_STATE_UNKNOW("5555", "交易未知"),
	RESP_STATE_REPEAT("6666", "订单重复"),

	// 系统内自定义
	RESP_STATE_A001("A001", "请求报文有误，请检查相关参数"),
	RESP_STATE_A002("A002", "非法渠道，请联系相关配置人员"),
	RESP_STATE_A003("A003", "签名失败"),
	RESP_STATE_A004("A004", "非法渠道IP，请联系相关配置人员"),
	RESP_STATE_A005("A005", "系统升级维护中，很抱歉暂时无法使用"),
	RESP_STATE_A006("A006", "系统路由配置有误，请联系相关人员"),
	RESP_STATE_A007("A007", "查询系统异常，暂时无法使用"),

	// 第三方响应
	RESP_STATE_B001("B001", "您的查询失败"),
	RESP_STATE_B005("B005", "第三方系统超时，请稍后重试"),
	RESP_STATE_B006("B006", "第三方系统异常，请稍后重试"),
	RESP_STATE_B008("B008", "第三方MAC校验失败")
	;
	private final String code;
	private final String desc;

	private RespStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static RespStatus get(String code) {
		for (RespStatus constants : RespStatus.values()) {
			if (constants.getCode().equals(code))
				return constants;
		}
		throw new IllegalArgumentException("RespStatus is not exist : "
				+ code);
	}
}
  