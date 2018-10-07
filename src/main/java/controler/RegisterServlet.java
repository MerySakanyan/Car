package controler;

import model.User;
import repository.User_Repository;
import util.MailSender;
import util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        User users = new User();
        users.setName(request.getParameter("name"));
        users.setSurname(request.getParameter("surname"));
        users.setUsername(request.getParameter("email"));
        users.setPassword(request.getParameter("password"));
     //   MailSender.send("merysyan9@gmail.com", Util.generateRandomString(), "title");
        User_Repository user_repository = new User_Repository();
        user_repository.setUser(users);
        response.sendRedirect("index.jsp");

    }


}
