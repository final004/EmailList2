package com.hanains.emaillist.http.action;

import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

public class EmailListActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if("form".equals(actionName)){
			action = new FormAction();
		}else{
			action = new IndexAction();
		}
		return action;
	}
}
