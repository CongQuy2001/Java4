

import java.util.List;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// tạo danh sách sản phẩm item
		List<Item> items = Arrays.asList(new Item[] {
				new Item("Desktop Computer1", "desktop.jpg", 500, 0.1, null),
				new Item("Desktop Computer2", "desktop.jpg", 700, 0.15, null),
				new Item("Desktop Computer3", "desktop.jpg", 900, 0.25, null),
				new Item("Desktop Computer4", "desktop.jpg", 55, 0.3, null),
				
				});
		// gán ds vào thuôc tính item
				request.setAttribute("items", items);
				
				String name = request.getParameter("name");
				// if khác null người dùng đã kick vào ảnh để xm chi tiết
				if(name != null)
					// tìm trong ds sp dựa vào name
				{
					for(Item item : items) {
						// nếu tìm thấy sp, gán sp vào 1 thuộc tính
						if(item.getName().equals(name)) {
							request.setAttribute("item", item);
							// chuyển trang chi tiết
							request.getRequestDispatcher("/item/details.jsp").forward(request, response);
						}
					}
				}
				request.getRequestDispatcher("/item/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
