package com.shulipeng.weixin.bean.event;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description: 自定义菜单事件
 */
public class MenuEvent extends BaseEvent {

	// 事件KEY值，与自定义菜单接口中KEY值对应
	private String EventKey;

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

}
