<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "java.sql.Connection" %>
<%@page import= "java.sql.DriverManager" %>
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.Statement" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 	
			 String sql = "select * from tbl_user";;
			 Connection conn = null;
			 Statement st = null;
			 ResultSet rs = null;
			 
			 try { 
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","12345");
				 st = conn.createStatement();
				 rs = st.executeQuery(sql);
				 
				 while(rs.next()){
					 System.out.print(rs.getInt("id") + " ");
					 System.out.print(rs.getString("name") +" ");
					 System.out.print(rs.getString("email") + " ");
					 System.out.println();
				 }
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				try {
						rs.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				try {
						st.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				try {
						conn.close();
				} catch (Exception e4) {
					e4.printStackTrace();
				}
				
			}
			
%>