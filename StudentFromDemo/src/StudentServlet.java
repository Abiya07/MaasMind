

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: StudentServlet
 *
 */
 public class StudentServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		
		StudentAction sa = new StudentAction();
		boolean status = sa.Studentdata(Name,Email);
		if(status){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/StudentSuccess.jsp");
			rd.forward(request, response);
		}
		else{
			response.sendRedirect("StudentUnsuccess.jsp");
		}	
			// TODO Auto-generated method stub
	}   	  	    
}