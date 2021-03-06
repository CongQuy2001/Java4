
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.*;


/**
 * Servlet implementation class userSevlet
 */
@WebServlet("/userSevlet")
public class userSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> users = Arrays.asList(new User[] {
				new User("Username 1", "Password 1", true),
				new User("Username 2", "Password 2", false),
				new User("Username 3", "Password 3", true)
				});
		request.setAttribute("message", "Quản lý người sử dụng!");
		request.setAttribute("form", users.get(0));
		request.setAttribute("items", users);
		
		request.getRequestDispatcher("/user/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
