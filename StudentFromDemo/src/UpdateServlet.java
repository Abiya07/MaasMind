

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import P1.UpdateAction;
import P1.UpdateBean;

/**
 * Servlet implementation class for Servlet: UpdateServlet
 *
 */
 public class UpdateServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String phonenumber=request.getParameter("phonenumber");
		String doj=request.getParameter("doj");
		
		UpdateBean sb = new UpdateBean();
		sb.setId(id);
		sb.setName(name);
		sb.setAge(age);
		sb.setEmail(email);
		sb.setPhonenumber(phonenumber);
		sb.setDoj(doj);
		
		UpdateAction sa = new UpdateAction();
		boolean status = sa.updateData(sb);
		
		if(status){
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/FetchAllServlet");
			rd.forward(request, response);
		}else{
			response.sendRedirect("UpdateUnsuccess.jsp");
		}// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}