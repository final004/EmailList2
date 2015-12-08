package com.hanains.emaillist.dao.test;

import java.util.List;

import com.hanains.emaillist.dao.EmailListDao;
import com.hanains.emaillist.vo.EmailListVo;

public class EmailListDaoTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertTest();
		getListTest();
	}

	public static void insertTest(){
		EmailListDao dao = new EmailListDao();
		EmailListVo vo = new EmailListVo();
		vo.setFirstName("junsung");
		vo.setLastName("moon");
		vo.setEmail("final001@naver.com");
		
		dao.insert(vo);
	}
	
	public static void getListTest(){
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.getList();
		for(EmailListVo vo : list){
			System.out.println(vo);
		}
		
	}
}
