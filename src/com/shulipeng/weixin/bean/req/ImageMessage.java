package com.shulipeng.weixin.bean.req;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description:请求消息之图片消息
 */
public class ImageMessage extends BaseMessage{

	// 图片链接
    private String PicUrl;
    private String MediaId;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	
}
