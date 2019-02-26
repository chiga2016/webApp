package practice1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/add.do")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("OK");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding ("utf-8");
        //resp.setHeader("Content-Type", "text/html; charset=UTF-8");
        String user = req.getParameter("user");
        String user2 = req.getParameter("user2");
        String msg = req.getParameter("msg");



        MessageService svc = (MessageService) getServletContext().getAttribute("msgSvc");

        if (user!=null&msg!=null){
            svc.addMessage(user,msg,user2);
        }

        List<Message> messages =  svc.getAllMessages();
        for (Message mess : messages  ) {
            resp.getWriter().println(mess);
        }


    }


    }
