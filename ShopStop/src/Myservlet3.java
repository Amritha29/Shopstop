

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet3
 */
@WebServlet("/Myservlet3")
public class Myservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext servCon = getServletContext();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<b>" + "Hello " + servCon.getAttribute("Name") + "," + "</b>");
		out.println("<br/>");

		out.println("<br/>");
		out.println("<br/>");
		out.println("<br/>");
		out.println("<b>Congratulations, you are eligible to get a scholarship at our university, <b>");
		out.println("<b> because your percentage of " + servCon.getAttribute("Percent") + " meets our criteria.</b>");

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
