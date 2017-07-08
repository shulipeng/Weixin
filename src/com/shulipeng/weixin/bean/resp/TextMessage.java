package com.shulipeng.weixin.bean.resp;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description:文本消息
 */
public class TextMessage extends BaseMessage {

	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		this.Content = content;
	}

}
