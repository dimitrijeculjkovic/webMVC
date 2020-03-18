package action.impl.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LoggedUsersAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		List<User> loggedUser = (List<User>) request.getServletContext().getAttribute("loggedUser");
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if (loggedUser.contains(user)) {
			if (loggedUser.isEmpty()) {
				request.setAttribute("errorMessage", "List is empty!");
			}
			return ViewConstants.LOGGED_USERS;
		}else {
			return "/index.jsp";
		}
	}

}
