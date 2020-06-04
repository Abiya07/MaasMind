

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: FetchServlet
 *
 */
 public class FetchServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public FetchServlet() {
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
		String name=request.getParameter("name");
		FetchAction fa = new FetchAction();
		ResultSet rs = fa.FetchData(name);
		try{
		if(rs.next()){
		PrintWriter p=response.getWriter();
		p.print(rs.getString(1));
		request.setAttribute("name", rs.getString(2));
		request.setAttribute("age", rs.getString(3));
		request.setAttribute("email", rs.getString(4));
		request.setAttribute("phonenumber", rs.getString(5));
		Date d = rs.getDate(6);
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
		String date=sd.format(d);
		request.setAttribute("doj", date);
	
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/FetchSuccess.jsp");
		rd.forward(request, response);
		}
		else{
			response.sendRedirect("FetchUnsuccess.jsp");
		}
		}catch(SQLException e){
			e.printStackTrace();
		}	
		// TODO Auto-generated method stub
	}   	  	    
}