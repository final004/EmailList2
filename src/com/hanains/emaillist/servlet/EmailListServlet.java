package com.hanains.emaillist.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.emaillist.http.action.EmailListActionFactory;
import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

@WebServlet("/el")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ActionFactory actionFactory = new EmailListActionFactory();
		
		String actionName = request.getParameter("a");
		Action action = actionFactory.getAction(actionName);
		action.execute(request,response);
		
		/*
		String actionName = request.getParameter("a");
		if("form".equals(actionName)){
			HttpUtil.forwarding(request, response, "/WEB-INF/views/form.jsp");
		}else if("insert".equals(actionName)){
			
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			String email = request.getParameter("email");
			
			EmailListVo vo = new EmailListVo();
			vo.setFirstName(firstName);
			vo.setLastName(lastName);
			vo.setEmail(email);
			
			EmailListDao dao = new EmailListDao();
			dao.insert(vo);
			
			response.sendRedirect("/emaillist2/el");
		}else{ //index (default action)
			 EmailListDao dao = new EmailListDao();
			 List<EmailListVo> list = dao.getList();
			 
			 request.setAttribute("list", list);

			HttpUtil.forwarding(request, response, "/WEB-INF/views/index.jsp");
			 
		}*/
	}

}
