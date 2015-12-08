package com.hanains.emaillist.http.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.emaillist.dao.EmailListDao;
import com.hanains.emaillist.vo.EmailListVo;
import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;

//@RequestMapping("")
public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		 EmailListDao dao = new EmailListDao();
		 List<EmailListVo> list = dao.getList();
		 
		 request.setAttribute("list", list);

		try {
			HttpUtil.forwarding(request, response, "/WEB-INF/views/index.jsp");
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
