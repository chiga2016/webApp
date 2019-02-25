package practice1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;


@WebListener
    public class AppListener implements ServletContextListener {
//...
public void contextInitialized (ServletContextEvent sce){
    sce.getServletContext().setAttribute("msgSvc", new MessageService());
}


//...
    }



