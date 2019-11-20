package com.yx.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.yx.ssm.po.Infomation;

public class InfomationHttpRequestHandler implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		// 相当于setAttribute
		request.setAttribute("infomations", infomations);
		
		// 设置视图
		request.getRequestDispatcher("/WEB-INF/jsp/infomation.jsp").forward(request, response);
	}

}
