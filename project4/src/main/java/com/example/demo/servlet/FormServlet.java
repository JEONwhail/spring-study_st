package com.example.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 서블릿 이름과 URL을 입력하여 서블릿 생성
@WebServlet(name = "FormServlet", urlPatterns = "/servlet/form")
public class FormServlet extends HttpServlet { // 상속받기

	// 사용자 요청을 처리하는 메소드 재정의
	// 사용자 요청이 올 때, 요청 및 응답 객체가 자동으로 생성됨
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 반활할 뷰 지정
		String viewPath = "/view/v2/form.jsp";

		// 응답 메세지 만들기
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);

	}

}
