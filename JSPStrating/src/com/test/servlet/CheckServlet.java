package com.test.servlet;

import com.test.entity.User;
import com.test.service.CheckUserService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class CheckServlet extends HttpServlet
{
	 private static final long serialVersionUID = 1L;
	 private CheckUserService cku;
	
    public CheckServlet()
    {
        cku = new CheckUserService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        String uname = request.getParameter("uname");
        String passwd = request.getParameter("passwd");
        System.out.println("用户名 ==》 "+ uname);
        System.out.println("密码 ==》 "+ passwd);
        
        RequestDispatcher rd = null;
        String forward = null;
        if(uname == null || passwd == null)
        {
            request.setAttribute("msg", "用户名或者密码为空");
            rd = request.getRequestDispatcher("/15/error.jsp");
            rd.forward(request, response);
        } else
        {
            User user = new User();
            user.setName(uname);
            user.setPasswword(passwd);
            boolean bool = cku.check(user);
            if(bool)
            {
                forward = "/15/success.jsp";
            } else
            {
                request.setAttribute("msg", "用户名或者密码有误！");
                forward = "/15/error.jsp";
            }
            rd = request.getRequestDispatcher(forward);
            rd.forward(request, response);
        }
    }
}
