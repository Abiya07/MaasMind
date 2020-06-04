

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import P1.FetchAllBean;

/**
 * Servlet implementation class for Servlet: FetchAllServlet
 *
 */
 public class FetchAllServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public FetchAllServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax	.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FetchAllAction fa = new FetchAllAction();
		List<FetchAllBean> rs = fa.FetchAllData();
		request.setAttribute("list", rs);
		if(rs!=null){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/FetchAllSuccess.jsp");
			rd.forward(request,response);
		}else{
			response.sendRedirect("FetchAllUnsuccess.jsp");
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