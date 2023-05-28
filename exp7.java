EXPERIMENT 7: -write a servlet to display the username and password accepted from the client server
  
Program: -
  
  
input.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form method="get" action="DemoServlet">
<pre>
Enter your name: <input type="text" name=t1>
<input type=submit>
<input type=reset>
</pre>
</form>
</body>
</html>


DemoServlet.java


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public DemoServlet() {
 super();
 // TODO Auto-generated constructor stub
 }
 /**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
 */
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 // TODO Auto-generated method stub
 //response.getWriter().append("Served at:
").append(request.getContextPath());
 PrintWriter pw=response.getWriter();
 String s=request.getParameter("t1");
 pw.println("<h1>Hello,"+s);
 pw.close();
 }
 /**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
response)
 */
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 // TODO Auto-generated method stub
 doGet(request, response);
 }
}
 
