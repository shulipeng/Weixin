package com.shulipeng.weixin.bean.resp;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description:视频消息
 */
public class VideoMessage extends BaseMessage{
	
	// 视频
	private Video Video;

	public Video getVideo() {
		return Video;
	}

	public void setVideo(Video video) {
		this.Video = video;
	}
	
	

}
