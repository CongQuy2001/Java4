package BTLAB;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/ChuNhat")
public class ChuNhatSevrver  extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("views/param/Chu-Nhat.jsp").forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double a = Double.parseDouble(req.getParameter("a"));
	double b = Double.parseDouble(req.getParameter("b"));
	double c = Double.parseDouble(req.getParameter("c"));
	if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
		double chuvi = a+b+c;
		String uri = req.getRequestURI();
		if (uri.contains("dien-tich")) {
			double chuvi2 = chuvi/2;
			double dientich = Math.sqrt(chuvi2*(chuvi2-a)*(chuvi2-b)*(chuvi2-c));
			req.setAttribute("message", "Diện tích tam giác là "+dientich);
		}else {
			req.setAttribute("message", "Chu vi tam giác là "+chuvi);
		}
	}else {
		req.setAttribute("message","Không thỏa mãn các cạnh của một tam giác!");
	}
	req.getRequestDispatcher("views/param/Ket-Qua.jsp").forward(req, resp);
}
	}

