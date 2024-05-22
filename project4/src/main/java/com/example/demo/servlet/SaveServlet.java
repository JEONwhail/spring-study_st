package com.example.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.example.demo.domain.Member;
import com.example.demo.domain.MemberRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SaveServlet", urlPatterns = "/servlet/save")
public class SaveServlet extends HttpServlet {

	MemberRepository repository = new MemberRepository();

	// 사용자 요청을 처리하는 메소드 재정의
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        // 요청 메세지에서 사용자가 전달한 파라미터 꺼내기
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 회원 추가
        Member member = new Member(0, username, password);
        repository.save(member);
        request.setAttribute("member", member);

        // 반활할 뷰 지정 (코드중복)
        String viewPath = "/view/v2/save.jsp";

        // 응답 메세지 만들기 (코드중복)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);

	}

}
