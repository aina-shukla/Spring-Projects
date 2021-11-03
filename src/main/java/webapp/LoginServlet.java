package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private UserValidationService uValidService = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>MVC Application</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("MVC application check..");
//		out.println("<br>");
//		out.println("My First Servlet is working");
//		out.println("<br>");
//		out.println("Application check done..");
//		out.println("</body>");
//		out.println("</html>");

		// From JSP
		// String name= request.getParameter("name");
//		request.setAttribute("uname", request.getParameter("uname"));
//		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		boolean isUserValid = uValidService.isUserValid(uname, password);

		if (isUserValid) {
			request.setAttribute("uname", uname);
			request.setAttribute(password, "password");
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}
