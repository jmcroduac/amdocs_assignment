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
	LoginService service;
	PasswordTable loginCredentials;

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
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		boolean valid = service.isValid(username,password);
		String userType = service.returnUserType(username,password);
		
		ArrayList<LogIn> userList = service.returnAllUser();
		
		request.setAttribute("uname", username);
		request.setAttribute("pwd", password);
		request.setAttribute("userlist", userList);
		
		if(valid && userType.equalsIgnoreCase("user")) {
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			rd.forward(request, response);
		}else if(valid && userType.equalsIgnoreCase("admin")){
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
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
