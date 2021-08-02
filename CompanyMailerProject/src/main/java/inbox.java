

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class inbox
 */
@WebServlet("/inbox")
public class inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inbox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		HttpSession httpSession= request.getSession(false);
		
		 //String n=request.getParameter("login");  
		 String p=(String) httpSession.getAttribute("login"); 
		 
		 //out.print(p);
		 //response.getWriter().append(p);
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
				////here javadb is database name, root is username and password  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from inbox where receiver='"+p+"';");
			out.println("<html> <body>");
			out.println("receiver        sender          subject<br/>");
			while (rs.next())
				//if(p.equals(rs.getString(1))&&p.equals(rs.getString(2)))
					{
				    out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"<br/>");
					//out.print("<a href = \"http://localhost:8080/CompanyMailerProject/Welcome.html\">click here to continue</a>");
					//break;
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
