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
 * Servlet implementation class CookieListerServlet
 */
@WebServlet("/CookieListerServlet")
public class CookieListerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private List<String> adminUsers = new ArrayList<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieListerServlet() {
        super();
        
        adminUsers.add("admin1");
        adminUsers.add("admin2");
        adminUsers.add("admin3");
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		
		Cookie[] allCookies = request.getCookies();
	
		for (Cookie aCookie : allCookies) {
			
			String name = aCookie.getName();
			
			String value = aCookie.getValue();
			
			if (isAdminUser(value)) {
				
				writer.write("Welcome Admin user. You have privileges to use all the functions");
			}else {
				writer.write("Welcome user " + value);
			}			
		}
		
		writer.close();
	}
	
	private boolean isAdminUser(String username) {
		
		return adminUsers.contains(username);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
