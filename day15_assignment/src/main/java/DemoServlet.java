import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg;
	String uname = "maika";
	String pword = "jorena";
	ServletConfig config;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) {
    	msg = "Kevin";
    	this.config = config;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = config.getInitParameter("email");
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(username.equals(uname) && (password.equals(pword))) {
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
