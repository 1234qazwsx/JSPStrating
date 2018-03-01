package com.test.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FilterOne
 */ 
public class FilterOne implements Filter {

    /**
     * Default constructor. 
     */
    public FilterOne() {
        System.out.println("======= 构造函数 ========");
    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("======= init 函数 ========");
        String initParam = fConfig.getInitParameter("param");
        System.out.println(" param == " + initParam);
	}
   

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("======= 开始执行dofilter函数 ========");
		//chain.doFilter(request, response);
        System.out.println("======= 结束执行dofilter函数 ========");

	}

    
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
        System.out.println("======= destroy 函数 ========");
	}
	
}
