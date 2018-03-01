
package com.test.servlet;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{

    public HelloServlet()
    {
    }

    public void init()
        throws ServletException
    {
        System.out.println("===========init without parameters=======");
        super.init();
    }

    public void init(ServletConfig config)
        throws ServletException
    {
        System.out.println("===========init with parameters=======");
        super.init(config);
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        System.out.println("===========  service =======");
        PrintWriter pw = resp.getWriter();
        pw.println("Hello world.");
        pw.close();
    }

    public void destroy()
    {
        System.out.println("=========== destroy =======");
        super.destroy();
    }

    private static final long serialVersionUID = 1L;
}
