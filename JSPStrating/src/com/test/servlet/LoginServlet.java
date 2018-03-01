package com.test.servlet;

import java.io.IOException;
//import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet
{

    public LoginServlet()
    {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        System.out.println("======= goget ===========");
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        System.out.println("======= dopost ===========");
        String userName = req.getParameter("uname");
        String password = req.getParameter("upwd");
        System.out.println("用户名 ==》 "+ userName);
        System.out.println("密码 ==》 "+ password);
        String forward = null;
        if(userName.equals("mouron") && password.equals("12345"))
        {
            forward = "/15/success.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            rd.forward(req, resp);
        } else
        {
            forward = "/15/error";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            rd.forward(req, resp);
        }
    }

    private static final long serialVersionUID = 0xf698ea1ddb1b4f11L;
}
