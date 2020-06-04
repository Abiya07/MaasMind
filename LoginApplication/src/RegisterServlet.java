

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import P1.RegisterBean;

/**
 * Servlet implementation class for Servlet: RegisterServlet
 *
 */
 public class RegisterServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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
		//retriveing form data
		String Firstname = request.getParameter("firstname");
		String Lastname = request.getParameter("lastname");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		//retrived from datas are stored in RegisterBean object(rb)
		RegisterBean rb = new RegisterBean();
			rb.setFirstname(Firstname);
			rb.setLastname(Lastname);
			rb.setUsername(Username);
			rb.setPassword(Password);
		
		RegisterAction ra = new RegisterAction();
			boolean status = ra.registerData(rb);//we have to share form data to the bean object
				if(status){
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/RegisterSuccess.jsp");
					rd.forward(request, response);
				}else{
					response.sendRedirect("RegisterUnsuccess.jsp");
				}
		// TODO Auto-generated method stub
	}   	  	    
}