package com.shulipeng.weixin.controller.core;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shulipeng.common.util.SignUtil;
import com.shulipeng.weixin.service.core.CoreService;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description: 核心控制器 用于处理微信的请求并且返回响应
 */
@Controller
@RequestMapping("core")
public class CoreController {
	
	@Autowired
	private CoreService coreServiceImpl;

	private static final Logger LOGGER = Logger.getLogger(CoreController.class);
	
	/**
	 * 确认请求来自微信服务器
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @return
	 */
	@RequestMapping(value="execute",method={RequestMethod.GET})
	@ResponseBody
	public String checkSignature(String signature,String timestamp,String nonce,String echostr){
		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		if(SignUtil.checkSignature(signature,timestamp,nonce)){
			return echostr;
		}
		return null;
	}
	
	/**
	 *  处理微信服务器发来的消息
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="execute",method={RequestMethod.POST}, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String execute(HttpServletRequest req) throws IOException{
		//���ú���ҵ���������Ϣ��������Ϣ
		String respXml = coreServiceImpl.processRequest(req);
		return respXml;
	}
}
