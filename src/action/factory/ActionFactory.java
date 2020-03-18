package action.factory;

import action.AbstractAction;

import action.impl.IndexAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.user.LoggedUsersAction;
import action.impl.user.UserAddAction;
import action.impl.user.UserAllAction;


public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
		}
		
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
		}
		if(actionName.equalsIgnoreCase("/index")) {
			action = new IndexAction();
		}
		if(actionName.equalsIgnoreCase("../user/add")) {
			action = new UserAddAction();
		}
		if(actionName.equalsIgnoreCase("../user/all")) {
			action = new UserAllAction();
		}
		if(actionName.equalsIgnoreCase("../user/loggedUsers")) {
			action = new LoggedUsersAction();
		}
		return action;
	}
}
