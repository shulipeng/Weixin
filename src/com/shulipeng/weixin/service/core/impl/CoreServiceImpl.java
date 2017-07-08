package com.shulipeng.weixin.service.core.impl;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.shulipeng.common.util.MessageUtil;
import com.shulipeng.weixin.bean.resp.TextMessage;
import com.shulipeng.weixin.service.core.CoreService;

@Service
public class CoreServiceImpl implements CoreService{

	@Override
	public String processRequest(HttpServletRequest req) {
		//xml格式的响应信息
				String respXml = null;
				//默认返回的文本内容消息
				String respContent ="未知的消息类型";
			      try {
			            // 调用parseXml方法解析请求消息
			            Map<String, String> requestMap = MessageUtil.parseXml(req);
			            // 发送方帐号
			            String fromUserName = requestMap.get("FromUserName");
			            // 开发者微信号
			            String toUserName = requestMap.get("ToUserName");
			            // 消息类型
			            String msgType = requestMap.get("MsgType");

			            // 回复文本消息
			            TextMessage textMessage = new TextMessage();
			            textMessage.setToUserName(fromUserName);
			            textMessage.setFromUserName(toUserName);
			            textMessage.setCreateTime(new Date().getTime());
			            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

			            // 文本消息
			            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
			            	String requestContent = requestMap.get("Content");
			            	System.out.println(requestContent);
			            	if(requestContent.contains("你是")){
			            		respContent = "爱黄小童的人啊！/害羞 /害羞 /害羞";
			            	}else if(requestContent.contains("你好")){
			            		respContent = "你好呀，你是谁";
			            	}else if(requestContent.contains("傻")){
			            		respContent = "你才傻，你最傻！黄小童！你最傻/发怒 ";
			            	}else if(requestContent.contains("love") || requestContent.contains("爱")){
			            		respContent = "这么巧，黄小童，我更爱你！/害羞";
			            	}else{
			            		respContent = "很抱歉，我不知道你在说些什么！能不能说爱我，好不好 /可怜 /流泪";
			            	}
			                
			            }
			            // 图片消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
			                respContent = "您发送的是图片消息！";
			            }
			            // 语音消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
			                respContent = "您发送的是语音消息！";
			            }
			            // 视频消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
			                respContent = "您发送的是视频消息！";
			            }
			            // 视频消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)) {
			                respContent = "您发送的是小视频消息！";
			            }
			            // 地理位置消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
			                respContent = "您发送的是地理位置消息！";
			            }
			            // 链接消息
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
			                respContent = "您发送的是链接消息！";
			            }
			            // 事件推送
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
			                // 事件类型
			                String eventType = requestMap.get("Event");
			                // 关注
			                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
			                    respContent = "谢谢您的关注！";
			                }
			                // 取消关注
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
			                    // TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
			                }
			                // 扫描带参数二维码
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
			                    // TODO 处理扫描带参数二维码事件
			                }
			                // 上报地理位置
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
			                    // TODO 处理上报地理位置事件
			                }
			                // 自定义菜单
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
			                    // TODO 处理菜单点击事件
			                }
			            }
			            // 设置文本消息的内容
			            textMessage.setContent(respContent);
			            // 将文本消息对象转换成xml
			            respXml = MessageUtil.messageToXml(textMessage);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        return respXml;
	}
	
	
}
