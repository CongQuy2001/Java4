

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;	
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sendMail_servlet
 */
@WebServlet("/sendMail_servlet")
public class sendMail_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("/senMail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Thong tin dang nhap Email 
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); //TLS
         // Lấy đối tượng Session mặc định
		Session sess = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			// mail và mật khẩu cá nhân
			return new javax.mail.PasswordAuthentication("lecongquy2401@gmail.com", "123456789quy");
			}
		} );
		//Gui mail
		String mailTo = request.getParameter("to");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		try {
      //	Tạo một đối tượng MimeMessage
			Message mess = new MimeMessage(sess);
			mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
			// đạt tiêu đề
			mess.setSubject(subject);
			// nội dung gửi thư
			mess.setText(content);
			// gửi thư
			Transport.send(mess);
			System.out.print("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("message", "Gửi thành Công");
		request.getRequestDispatcher("/senMail.jsp").forward(request, response);
	}
}
