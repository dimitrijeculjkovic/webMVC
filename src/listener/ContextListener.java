package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import domain.User;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	List<User> users = new ArrayList<User>();
		users.add(new User("dimitrije", "123"));
		users.add(new User("admin", "admin"));
		sce.getServletContext().setAttribute("users", users);
		List<User> LoggedUser = new ArrayList<User>();
		sce.getServletContext().setAttribute("loggedUser", LoggedUser);
    }
	
}
