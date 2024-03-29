package com.web;



import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet (urlPatterns = "/login.do")
public class LoginServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求乱码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取前台表单的用户名参数
        String username = req.getParameter("username");
        //取得密码参数
        String password = req.getParameter("password");
        //跳转之前把用户名和密码存入req对象
//       req.setAttribute("username", username);
//        //req.setAttribute("password", password);
//        //通过req跳转，服务器端跳转
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);
         HttpSession session = req.getSession();
         session.setAttribute("username",username);
          resp.sendRedirect("index.jsp");

    }
}