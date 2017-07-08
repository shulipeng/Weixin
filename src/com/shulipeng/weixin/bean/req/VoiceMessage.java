package com.shulipeng.weixin.bean.req;

/**
 * 
 * @author pengxianyang
 * @date 2017年7月8日
 * @Description: 请求消息之音频消息
 */
public class VoiceMessage extends BaseMessage {

	// 媒体ID
	private String MediaId;
	// 语音格式
	private String Format;

	public String getMediaId() {
		return MediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
