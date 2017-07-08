package com.shulipeng.weixin.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
* @author pengxianyang
* @date 2017年7月8日 
* @Description: 后台管理登陆控制器
 */
@Controller
@RequestMapping("login")
public class LoginController {
	
	/**
	 * 进入登陆页面
	 * @return
	 */
	@RequestMapping("toPage")
	public String toLoginPage(){
		return "/login";
	}

}
