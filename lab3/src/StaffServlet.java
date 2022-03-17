
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

@MultipartConfig
@WebServlet("/StaffServlet")
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/staff.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		try {
			// Định dạng thời gian nhập vào
			DateTimeConverter dtc = new DateConverter(new Date(0));
			dtc.setPattern("MM/dd/yyyy");
			ConvertUtils.register(dtc, Date.class);
			Staff staff = new Staff();
			// Đọc tham số vào các thuộc tính của bean staff
			BeanUtils.populate(staff, request.getParameterMap());
         // dùng cách nối chuỗi để lấy ra giá trị của  hobbies
			// lấy từ mảng hobbies của đối tượng staff
			String hobbies = "";
			for (String i : staff.getHobbies()) {
				hobbies += i + ", ";
			}
			// gọi thẳng đến hobbiess đẻ lấy ra giá trị 
			request.setAttribute("hobbies", hobbies);

			// Chia sẻ với result.jsp
			request.setAttribute("bean", staff);
			File dir = new File(request.getServletContext().getRealPath("/files"));
			Part photo = request.getPart("photo_file");
			File photoFile = new File(dir, photo.getSubmittedFileName());
			photo.write(photoFile.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
