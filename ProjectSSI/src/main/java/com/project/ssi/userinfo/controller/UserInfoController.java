package com.project.ssi.userinfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * 测试
 * @author Administrator
 *
 */
public class UserInfoController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
         ModelAndView mav = new ModelAndView("hello");        //这个类是用来保存view和返回信息的。
         mav.addObject("message", "Hello World!");   
        return mav;                                     //返回给hello.jsp这个视图
	}

}
