/** 
 * Project Name:bill-common 
 * File Name:Request.java 
 * Package Name:com.oriental.bill.common.pub.vo.req 
 * Date:2016年3月30日下午5:51:57 
 * Copyright (c) 2016, zhangmeng@oriental-finance.com All Rights Reserved. 
 * 
 */  
      
package com.guludai.admin.common.bean.req;

import java.io.Serializable;

/** 
 * 公共请求对象父类
 * ClassName:Request <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2016年3月30日 下午5:51:57 <br/> 
 * @author   mencius 
 * @version   
 * @since    JDK 1.7
 * @see       
 */
public class Request implements Serializable{

	/** 
	 * serialVersionUID:TODO 
	 * @since JDK 1.7
	 */ 
	private static final long serialVersionUID = 1L;
	
	// 请求流水号
	private String tradeFlow;

	// 备用1
	private String spare1;

	// 备用2
	private String spare2;
	
	public String getTradeFlow() {
		return tradeFlow;
	}

	public void setTradeFlow(String tradeFlow) {
		this.tradeFlow = tradeFlow;
	}

	public String getSpare1() {
		return spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

	public String getSpare2() {
		return spare2;
	}

	public void setSpare2(String spare2) {
		this.spare2 = spare2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
  