package com.hb.mvc2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter	out = response.getWriter();
//		out.print("<h1>Controller Index</h1>");
		
		System.out.println(request.getParameter("id")); //주소에 있는 파라미터 값을 가져옴.
		
		request.setAttribute("msg", "hello");
		
		request.getSession(); //리퀘스트 객체한테 세션 요청한다.
		HttpSession session = request.getSession();
		session.setAttribute("msg2", "JavaWorld");
		System.out.println(session.getAttribute("msg2"));
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
//		rd.forward(request, response);
		
		//response.sendRedirect("Ex01.do?id=aaa");
		//response.sendRedirect("/Ex01.do?id="+request.getParameter("id")); 앞에 이거 /붙으면 컨텍스트명이 빠진다.
		//response.sendRedirect("Ex01.do?id="+request.getParameter("id"));
	
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
		rd.forward(request, response); //but 얘는 잘나온다. 왜??
		
		//주소줄로 파라미터로 보내고 싶지 않으면 셋어트리뷰트를 해줘야 한다.
		//주소표시줄을 쓸 수 없을때는 
		
		//sendRedirect 하는 순간 새로운 객체로 만들어져서 다시 온다?.
		//그래서 값이 깨진다. 주소줄에.
		
		//그래서 값을 계속 저장할 수 있는 스코프가 필요하고 그게 세션이다.
		
		
		
		
		
	}//method end

}//class end
