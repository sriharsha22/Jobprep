package harsha.servlet;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloworld
 */
@WebServlet("/empdetails")
public class Helloworld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	public void init() throws ServletException {
		super.init();
	}
	@Override
	public void destroy() {
		super.destroy();
	}
	public Helloworld() {
    	System.out.println("I am in Constructor");
    }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello I am in service method Time is "+ new java.util.Date());
    	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname = request.getParameter("fname");
		String place = request.getParameter("place");
		String occupation = request.getParameter("occupation");
		String lname = request.getParameter("lname");
		System.out.println("Fname ="+ fname);
		System.out.println("Lname = "+ lname);
		out.println("<html>");
		out.println("<body>");
		out.println("<table style=\"border: 1cm;\">");
		out.println("<tr><td>NAME</td><td>Place</td><td>Occupation</td></tr>");
		
		for(int i =0 ; i < 5; i++){
			out.println("<tr><td>"+fname+"</td><td>"+place+"</td><td>"+occupation+"</td></tr>");	
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
    
		}
	
	

}
