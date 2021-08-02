

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();  
		 String n=(String) request.getParameter("login");  
		 String p=(String) request.getParameter("passwd"); 
		 //HttpSession httpSession= request.getSession();
         //httpSession.setAttribute("login",request.getParameter("login") );
         //httpSession.setAttribute("name",resultSet.getString("name") );
		 //request.getSession().setAttribute(String name, Object o);
		//request.getSession().setAttribute(n, p);
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
//here javadb is database name, root is username and password  
Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from maileruser");
			out.println("<html> <body>");
			while (rs.next())
				if(n.equals(rs.getString(1))&&p.equals(rs.getString(2)))
					{out.print("<h1>logged in sucessfully</h1>");
					out.print("<a href = \"http://localhost:8080/CompanyMailerProject/Welcome.html\">click here to continue</a>");

					
					HttpSession httpSession= request.getSession();
		            //httpSession.setAttribute("authenticated", true);
		            httpSession.setAttribute("login",request.getParameter("login") );
		            //httpSession.setAttribute("n",rs.getString("name") );
		            //res.sendRedirect("welcome");
		            out.print("<a href = \"http://localhost:8080/CompanyMailerProject/Welcome.html\">click here to continue</a>");

					
					//					RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.html");
//					request.setAttribute("login", "passwd"); // set your String value in the attribute
//					dispatcher.forward( request, response );
//					
					//RequestDispatcher rd = request.getRequestDispatcher("welcome");
					//rd.forward(request, response);
					break;
					}
					con.close();
			out.println("</body></html> ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
