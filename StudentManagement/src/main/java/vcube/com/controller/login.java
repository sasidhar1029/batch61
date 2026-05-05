package vcube.com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vcube.com.dao.StudentDao;
import vcube.com.dto.LoginUser;

@WebServlet("/login")
public class login extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		LoginUser user = new LoginUser();
		user.setName(name);
		user.setPassword(password);

		StudentDao sd = new StudentDao();
		boolean status = sd.registerStudent(user);

		if (status) {
			response.getWriter().println("Login successfull");
		} else {
			response.getWriter().println("Invalid Credentails");
		}
	}

}
