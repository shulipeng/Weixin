package com.shulipeng.weixin.bean.resp;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description:音频消息
 */
public class VoiceMessage extends BaseMessage {

	// 语音
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		this.Voice = voice;
	}

}
