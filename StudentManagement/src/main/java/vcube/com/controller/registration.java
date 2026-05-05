package vcube.com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vcube.com.dao.StudentDao;
import vcube.com.dto.LoginUser;

@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String Re_password = request.getParameter("Re_password");

		LoginUser lu = new LoginUser();
		lu.setName(name);
		lu.setEmail(email);
		lu.setPassword(password);
		lu.setRe_password(Re_password);

		StudentDao sd = new StudentDao();
		boolean status = sd.registerStudent(lu);
		if (status) {
			response.sendRedirect("home.jsp");

		} else {
			response.sendRedirect("registration.jsp");
		}

	}
}
