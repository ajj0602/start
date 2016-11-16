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
		
		System.out.println(request.getParameter("id")); //�ּҿ� �ִ� �Ķ���� ���� ������.
		
		request.setAttribute("msg", "hello");
		
		request.getSession(); //������Ʈ ��ü���� ���� ��û�Ѵ�.
		HttpSession session = request.getSession();
		session.setAttribute("msg2", "JavaWorld");
		System.out.println(session.getAttribute("msg2"));
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
//		rd.forward(request, response);
		
		//response.sendRedirect("Ex01.do?id=aaa");
		//response.sendRedirect("/Ex01.do?id="+request.getParameter("id")); �տ� �̰� /������ ���ؽ�Ʈ���� ������.
		//response.sendRedirect("Ex01.do?id="+request.getParameter("id"));
	
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
		rd.forward(request, response); //but ��� �߳��´�. ��??
		
		//�ּ��ٷ� �Ķ���ͷ� ������ ���� ������ �¾�Ʈ����Ʈ�� ����� �Ѵ�.
		//�ּ�ǥ������ �� �� �������� 
		
		//sendRedirect �ϴ� ���� ���ο� ��ü�� ��������� �ٽ� �´�?.
		//�׷��� ���� ������. �ּ��ٿ�.
		
		//�׷��� ���� ��� ������ �� �ִ� �������� �ʿ��ϰ� �װ� �����̴�.
		
		
		
		
		
	}//method end

}//class end
