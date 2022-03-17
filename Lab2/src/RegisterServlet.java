
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//set the MIME type of the response, "text/html"
	    response.setContentType("text/html;charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
	    
		String userName = request.getParameter("username");
		String age = request.getParameter("age");
		String country = request.getParameter("country");
		String Gender = request.getParameter("gioiTinh");
		String[] Hobby = request.getParameterValues("soThich");

		response.getWriter().write("<center><h2>THÔNG TIN ĐĂNG NHẬP</h2><center>");
		response.getWriter().write("<h3>Tên Của Bạn Là:  " + userName + "</h3>");
		response.getWriter().write("<h3>Tuổi Của Bạn Là:  " + age + "</h3>");
		response.getWriter().write("<h3>Quốc Gia Của Bạn Là:  " + country + "</h3>");
		response.getWriter().write("<h3>Giới Tính Của Bạn Là:  " + Gender + "</h3>");
		response.getWriter().write("<h3>Sở Thích Của Bạn Là:  ");
		for (String item : Hobby) {
			response.getWriter().write(item +  ",");
		}
		response.getWriter().write("</h3>");
	}

}
