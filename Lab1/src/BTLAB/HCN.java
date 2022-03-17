package BTLAB;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HCN.php")
public class HCN extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.getRequestDispatcher("/views/param/Chu-Nhat.jsp").forward(request, response);
	}
	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double d = Double.parseDouble(request.getParameter("dai"));
		double r = Double.parseDouble(request.getParameter("rong"));
		request.setAttribute("dientich", d*r);
		request.setAttribute("chuvi", 2*(d+r));
		request.getRequestDispatcher("/views/param/Ket-Qua.jsp").forward(request, response);
	}

}
