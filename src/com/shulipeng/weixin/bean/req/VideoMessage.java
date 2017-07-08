package com.shulipeng.weixin.bean.req;

/**
 * 
 * @author pengxianyang
 * @date 2017年7月8日
 * @Description: 请求消息之视频消息
 */
public class VideoMessage extends BaseMessage {

	// 媒体ID
	private String MediaId;
	// 语音格式
	private String ThumbMediaId;

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
