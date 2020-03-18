package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class IndexAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		
		return ViewConstants.INDEX;
	}

}
