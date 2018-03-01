package com.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet16
 */
public class LoginServlet16 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet16() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("======= dopost ===========");
	        String userName = request.getParameter("uname");
	        String password = request.getParameter("passwd");
	        System.out.println((new StringBuilder("用户名 ==》")).append(userName).toString());
	        System.out.println((new StringBuilder("密码 ==》")).append(password).toString());
	        String forward = null;
	        if(userName.equals("穆龙") && password.equals("12345"))
	        {
	            forward = "/16/success.jsp";
	            RequestDispatcher rd = request.getRequestDispatcher(forward);
	            rd.forward(request, response);
	            
	        } else{
	            forward = "/16/error.jsp";
	            RequestDispatcher rd = request.getRequestDispatcher(forward);
	            rd.forward(request, response);
	        }
	}

}
