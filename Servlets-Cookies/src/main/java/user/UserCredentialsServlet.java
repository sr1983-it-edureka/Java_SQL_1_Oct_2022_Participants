package user;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserCredentialsServlet
 */
@WebServlet("/UserCredentialsServlet")
public class UserCredentialsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCredentialsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    /*
     * Interaction
     * 1) Client access the server
     * 2) Server provides the form
     * 3) Client fill in the form and submit
     * 4) UserCredentialServlet gets the control 
     * 	  Generate the cookie and send this to the client
     * 	  provideAForm() / provideALink
     * 5) Client -> Submitting Form / ClickingLink
     *    Client not making any explicit efforts to send the cookie
     *    [Browser will do it]
     * 6) Servlet2 gets the control
     * 7) Read all the cookie information that has come from the client
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("userpassword");
		
		PrintWriter writer = response.getWriter();
				
		Cookie usernameCookie = new Cookie("usernameCookie", username);
		
		response.addCookie(usernameCookie);		
		
		showAllCookiesForm(writer);	
		
		writer.flush();

		writer.close();
	}
	
	private void showAllCookiesForm(PrintWriter writer) {
		
		writer.print("<form action='cookie-action' method='post'>");

		writer.print("<input type='submit' value='Click me to show all the cookies'>");
		
		writer.print("</form>");	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
