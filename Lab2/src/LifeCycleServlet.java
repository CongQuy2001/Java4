

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	int count;
	String path = "C:\\temp\\count.txt.TXT"; // s xm luôn hô cho b 3 lab3 phát đâu
	@Override
    public void init() throws ServletException {
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
                count = 0;
            } else {
                count = Integer.parseInt(Files.readAllLines(Paths.get(path)).get(0));
            }
        } catch (Exception e){

        }
    }
//	public void init(ServletConfig config) throws ServletException {
//	try {
//		// đọc từ file count.txt, ép qua kiểu số và gán vào biến count
//		count = Integer.parseInt(Files.readAllLines(path).get(0));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	}

	
	public void destroy() {
        try {
            Files.write(Paths.get(path), String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
        } catch (Exception e){

        }
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// tăng sô người truy cập  lên 1 
		count = count+1;
		// gán count  vào thuộc tính
		request.setAttribute("message", count);
		// chuyển sang trang hit.jsp
		request.getRequestDispatcher("/hit-counter.jsp").forward(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
