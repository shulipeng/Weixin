package com.shulipeng.weixin.bean.req;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description: 请求消息之文本消息
 */
public class TextMessage extends BaseMessage {

	// 内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}



}
