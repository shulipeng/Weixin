package com.shulipeng.weixin.service.core;

import javax.servlet.http.HttpServletRequest;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日  
* @Description: 核心服务层 用于响应微信的请求
 */
public interface CoreService {

	/**
	 * 对微信请求返回对应的响应
	 * @param req
	 * @return
	 */
	String processRequest(HttpServletRequest req);
}
