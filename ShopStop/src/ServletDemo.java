import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo implements Servlet{  ServletConfig config=null;  
  
public void init(ServletConfig config){  
this.config=config;  
System.out.println("servlet is initialized");  
}  
  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
res.setContentType("Text/Html");
PrintWriter out = res.getWriter();
  

out.print("<html><body>");  
out.print("<b>hello simple servlet</b>");  
out.print("</body></html>");   
}  

public void destroy(){
System.out.println("servlet is destroyed");
}
  
public ServletConfig getServletConfig(){

return config;}  

public String getServletInfo()
{
return "copyright 2010-2019";
}  
  
} 
