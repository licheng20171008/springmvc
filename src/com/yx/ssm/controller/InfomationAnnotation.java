package com.yx.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yx.ssm.po.Infomation;

// 控制器注解标识
@Controller
public class InfomationAnnotation {

	
	@RequestMapping("/queryInfomation4")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// 调用service查询数据
		List<Infomation> infomations = new ArrayList<Infomation>();

		Infomation infomation1 = new Infomation();
		infomation1.setName("李成1");
		infomation1.setPassword("112111");

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
//		modelAndView.setViewName("/WEB-INF/jsp/infomation.jsp");
		modelAndView.setViewName("infomation");

		return modelAndView;
	}
}
