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
		//xml��ʽ����Ӧ��Ϣ
				String respXml = null;
				//Ĭ�Ϸ��ص��ı�������Ϣ
				String respContent ="δ֪����Ϣ����";
			      try {
			            // ����parseXml��������������Ϣ
			            Map<String, String> requestMap = MessageUtil.parseXml(req);
			            // ���ͷ��ʺ�
			            String fromUserName = requestMap.get("FromUserName");
			            // ������΢�ź�
			            String toUserName = requestMap.get("ToUserName");
			            // ��Ϣ����
			            String msgType = requestMap.get("MsgType");

			            // �ظ��ı���Ϣ
			            TextMessage textMessage = new TextMessage();
			            textMessage.setToUserName(fromUserName);
			            textMessage.setFromUserName(toUserName);
			            textMessage.setCreateTime(new Date().getTime());
			            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

			            // �ı���Ϣ
			            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
			            	String requestContent = requestMap.get("Content");
			            	System.out.println(requestContent);
			            	if(requestContent.contains("����")){
			            		respContent = "����Сͯ���˰���/���� /���� /����";
			            	}else if(requestContent.contains("���")){
			            		respContent = "���ѽ������˭";
			            	}else if(requestContent.contains("ɵ")){
			            		respContent = "���ɵ������ɵ����Сͯ������ɵ/��ŭ ";
			            	}else if(requestContent.contains("love") || requestContent.contains("��")){
			            		respContent = "��ô�ɣ���Сͯ���Ҹ����㣡/����";
			            	}else{
			            		respContent = "�ܱ�Ǹ���Ҳ�֪������˵Щʲô���ܲ���˵���ң��ò��� /���� /����";
			            	}
			                
			            }
			            // ͼƬ��Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
			                respContent = "�����͵���ͼƬ��Ϣ��";
			            }
			            // ������Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
			                respContent = "�����͵���������Ϣ��";
			            }
			            // ��Ƶ��Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
			                respContent = "�����͵�����Ƶ��Ϣ��";
			            }
			            // ��Ƶ��Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)) {
			                respContent = "�����͵���С��Ƶ��Ϣ��";
			            }
			            // ����λ����Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
			                respContent = "�����͵��ǵ���λ����Ϣ��";
			            }
			            // ������Ϣ
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
			                respContent = "�����͵���������Ϣ��";
			            }
			            // �¼�����
			            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
			                // �¼�����
			                String eventType = requestMap.get("Event");
			                // ��ע
			                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
			                    respContent = "лл���Ĺ�ע��";
			                }
			                // ȡ����ע
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
			                    // TODO ȡ�����ĺ��û��������յ������˺ŷ��͵���Ϣ����˲���Ҫ�ظ�
			                }
			                // ɨ���������ά��
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
			                    // TODO ����ɨ���������ά���¼�
			                }
			                // �ϱ�����λ��
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
			                    // TODO �����ϱ�����λ���¼�
			                }
			                // �Զ���˵�
			                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
			                    // TODO ����˵�����¼�
			                }
			            }
			            // �����ı���Ϣ������
			            textMessage.setContent(respContent);
			            // ���ı���Ϣ����ת����xml
			            respXml = MessageUtil.messageToXml(textMessage);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        return respXml;
	}
	
	
}
