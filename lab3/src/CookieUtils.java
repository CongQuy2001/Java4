import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.iap.Response;

public class CookieUtils {
	public static Cookie add(String name, String value, int hours, HttpServletResponse response) { 
		// tạo cookie
			Cookie cookie = new Cookie(name, value);
			// tuổi thọ cookie tồn tại
			cookie.setMaxAge(hours*60*60);
			// hiển thị có hiệu lực trên toàn site 
			cookie.setPath("/");
			// gửi vào phái client
			response.addCookie(cookie);
			return cookie;
		
			}
	// Đọc giá trị cookie gửi từ client
	public static String get(String name, HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
		for(Cookie cookie: cookies) {
		if(cookie.getName().equalsIgnoreCase(name)) {
		return cookie.getValue();
		}
		}
		}
		return "";
		}

}
