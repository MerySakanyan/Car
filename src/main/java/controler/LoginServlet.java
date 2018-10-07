package controler;

import repository.User_Repository;

import java.io.IOException;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {



//        String email=request.getParameter("email");
//        String password=request.getParameter("password");
//        User_Repository user_repository=new User_Repository();
//        User user=user_repository.getByEmailAndPassword(email, password);
//
//        if (user==null){
//           request.setAttribute("errMessage", "Wrong email or password");
//           request.getRequestDispatcher("/index.jsp").forward(request,response);
//     //         response.sendRedirect("/Pages/register.jsp");
//        }else {
//            request.getSession().setAttribute("user",user);
//           response.sendRedirect("/Pages/home.jsp");
//
//
//        }
    }


}
