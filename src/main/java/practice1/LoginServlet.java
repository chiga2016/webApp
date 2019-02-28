package practice1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        //resp.getWriter().println("post");
        //resp.setCharacterEncoding ("utf-8");

        String login = req.getParameter("login");
        String pass = req.getParameter("pass");
        //resp.getWriter().println(login);
        if(login!=null&&pass!=null) {
            if (login.substring(0, 1).equals(pass)) {
                req.getSession().setAttribute("username", login);
                req.getRequestDispatcher("newMessage.jsp").forward(req, resp);
            } else {
            resp.getWriter().println("Access denied");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }


        }
    }
}
