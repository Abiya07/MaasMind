

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ValidateServlet
 *
 */
 public class ValidateServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ValidateServlet() {
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

		StudentBean vb = new StudentBean();
		vb.setName(name);
		vb.setAge(age);
		vb.setEmail(email);
		vb.setPhonenumber(phonenumber);
		vb.setDoj(doj);
		int b=vb.Validate();
		
		if(b>0){
			HashMap<String,String> err = vb.getErrormap();
			request.setAttribute("errmap", err);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Validate.jsp");
			rd.forward(request, response);
		}
		if(b==0){
			ValidateAction va = new ValidateAction();
			boolean status = va.validateData(vb);
			
			if(status){
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/ValidateSuccess.jsp");
				rd.forward(request, response);
			}
			else{
				response.sendRedirect("ValidateUnsuccess.jsp");
			}
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