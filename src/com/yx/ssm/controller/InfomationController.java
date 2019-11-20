package com.yx.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yx.ssm.po.Infomation;

public class InfomationController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 调用service查询数据
		List<Infomation> infomations = new ArrayList<Infomation>();
		
		Infomation infomation1 = new Infomation();
		infomation1.setName("李成1");
		infomation1.setPassword("111111");
		
		Infomation infomation2 = new Infomation();
		infomation2.setName("李成2");
		infomation2.setPassword("222222");
		
		Infomation infomation3 = new Infomation();
		infomation3.setName("李成3");
		infomation3.setPassword("333333");
		infomations.add(infomation1);
		infomations.add(infomation2);
		infomations.add(infomation3);
		
		// 返回MODELVIEW
		ModelAndView modelAndView = new ModelAndView();
		
		// 相当于setAttribute
		modelAndView.addObject("infomations", infomations);
		
		// 设置视图
		modelAndView.setViewName("/WEB-INF/jsp/infomation.jsp");
		
		return modelAndView;
	}
}
