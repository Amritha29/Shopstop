

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet1
 */
@WebServlet("/Myservlet1")
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Creating ServletContext object
		ServletContext servCon = getServletContext();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Using ServletContext object to set and read context attributes");


		//Setting Request Attributes to be shared between multiple servlets
		servCon.setAttribute("Name", request.getParameter("username"));
		servCon.setAttribute("Percent", request.getParameter("percentile"));

		if(new Integer((String) servCon.getAttribute("Percent")) <90)
		{
		RequestDispatcher reqDispatch = servCon.getRequestDispatcher("/Myservlet2");
		reqDispatch.forward(request,response);
		}
		else
		{
		RequestDispatcher reqDispatch = servCon.getRequestDispatcher("/Myservlet3");
		reqDispatch.forward(request,response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
