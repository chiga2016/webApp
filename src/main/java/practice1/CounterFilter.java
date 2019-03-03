package practice1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//WebFilter("/CounterFilter")
public class CounterFilter implements Filter {

	private FilterConfig filterConfig = null;
	AtomicInteger counter1 = new AtomicInteger(0);

	//int counter1;
	//private ServletContext context;
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
		//counter1 =0;
		//this.context = fConfig.getServletContext();
		//this.context.log("CounterFilter initialized");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//counter1 = Integer.parseInt((String) req.getSession().getAttribute("CounterSessionTxt"))+1;
		counter1.getAndIncrement();

		if (req.getSession().getAttribute("CounterSessionTxt")!=null){
			req.getSession().setAttribute("CounterSessionTxt",counter1);
		}
		else {
			req.getSession().setAttribute("CounterSessionTxt",counter1);
		}

		//filterConfig.getServletContext().setAttribute("globalCounter", counter1);


		//req.getSession().setAttribute("CounterSessionTxt",counter1 );
		/*
		String uri = req.getRequestURI();
		this.context.log("Requested Resource::"+uri);
		
		HttpSession session = req.getSession(false);
		
		if(session == null && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))){
			this.context.log("Unauthorized access request");
			res.sendRedirect("login.html");
		}else{ */
			// pass the request along the filter chain
			chain.doFilter(request, response);
		//}
		
		
	}

	public FilterConfig getFilterConfig() {  return (this.filterConfig);  }

	public void destroy() {
		//close any resources here
	}

}
