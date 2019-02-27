package practice1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
        resp.setContentType("text/html; charset=UTF-8");
        //resp.setCharacterEncoding ("utf-8");
        req.setCharacterEncoding("utf-8");
        //resp.setHeader("Content-Type", "text/html; charset=UTF-8");
        String user = req.getParameter("user");
        String user2 = req.getParameter("user2");
        String msg = req.getParameter("msg");



        MessageService svc = (MessageService) getServletContext().getAttribute("msgSvc");

        if (user!=null&msg!=null){
            if(user2!=""){
                svc.addMessage(user,user2,msg);
            }
            else{
                svc.addMessage(user,msg);
            }

        }

        List<Message> messages =  svc.getAllMessages();

        resp.setContentType("text/html; charset=utf-8");
        resp.setCharacterEncoding("utf-8");

       // req.getRequestDispatcher("oldstylejsp.jsp").forward(req, resp);

        req.setAttribute("messages",messages);
        req.getRequestDispatcher("messages.jsp").forward(req, resp);

//        String path = "/oldstylejsp.jsp";
//        ServletContext servletContext = getServletContext();
//        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//        requestDispatcher.forward(req, resp);


        PrintWriter writer = resp.getWriter();



        try {
            writer.println("<html>");
//            writer.println("<head>");
//            writer.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
//            writer.println("</head>");
            writer.println("<body>");
            writer.println("<body>");
                writer.println("<h2>Лог сообщений</h2>");
            writer.println("<UI>");
            for (Message mess : messages  ) {
                writer.println("<li>"+mess+"</li>");
            }
            writer.println("</UI>");
            writer.println("</body>");
            writer.println("</html>");


            // http://localhost:8090/hello?id=5&catName=%D0%91%D0%BE%D1%80%D0%B8%D1%81&nums=1&nums=2&nums=3
        } finally {
            writer.close();
        }



    }
 }
