package day15_assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import day15_assignment.PasswordTable;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg;
	ServletConfig config;
	PasswordTable loginCredentials;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
    	super();
    	loginCredentials = new PasswordTable();
    	//loginCredentials.insertEntity();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) {
    	msg = "Kevin";
    	this.config = config;
    	//loginCredentials.insertEntity();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = config.getInitParameter("email");
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		//boolean retVal = loginTable.findEntity(username, password);
		
		/*
		if(retVal ==  true) {
			out.println("<html><body>");
			out.println("<h1>Login successful:</h1>");
			out.println("<h2>Welcome " + username + "</h2>");
			out.println("/<body></html>");
		}else {
			out.println("<html><body>");
			out.println("<h1>Login failed</h1>");
			out.println("<h2>Try again</h2>");
			out.println("/<body></html>");
		}
		*/
		
		HashMap<String, String> allLoginCreds = loginCredentials.returnAllEntity();
		
		
		request.setAttribute("loginCreds", allLoginCreds);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
