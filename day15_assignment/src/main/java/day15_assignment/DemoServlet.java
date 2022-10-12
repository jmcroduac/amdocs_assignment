package day15_assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day15_assignment.web.service.LoginService;
import day15_assignment.web.service.LoginServiceImpl;

//import day15_assignment.PasswordTable;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String msg;
	ServletConfig config;
	CourseOperations courseOps;
	LoginService service;
	//PasswordTable loginCredentials;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
    	super();
    	//loginCredentials = new PasswordTable();
    	//loginCredentials.insertEntity();
    	
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) {
    	msg = "Kevin";
    	this.config = config;
    	service = new LoginServiceImpl();
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
		
		courseOps = new CourseOperations();
    	//courseOps.insertEntity();
		
		ArrayList<Course> courseList = courseOps.returnAllEntity();
		request.setAttribute("courseTable", courseList);
		
		boolean valid = service.isValid(username,password);
		if(valid) {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
