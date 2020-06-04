

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import P1.StudentRegAction;
import P1.StudentRegBean;

/**
 * Servlet implementation class for Servlet: StudentRegServlet
 *
 */
 public class StudentRegServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public StudentRegServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String phonenumber=request.getParameter("phonenumber");
		String doj=request.getParameter("doj");
		
		StudentRegBean sb = new StudentRegBean();
		sb.setName(name);
		sb.setAge(age);
		sb.setEmail(email);
		sb.setPhonenumber(phonenumber);
		sb.setDoj(doj);
		
		StudentRegAction sa = new StudentRegAction();
		boolean status = sa.registerData(sb);
		
		if(status){
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/StudentRegSuccess.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("StudentRegUnsuccess.jsp");
		}
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}