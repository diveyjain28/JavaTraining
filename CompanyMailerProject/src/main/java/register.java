

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String dbURL = "jdbc:mysql://localhost:3306/servlet";
		String n=request.getParameter("login");  
	    String p=request.getParameter("passwd");  
	    PrintWriter out = response.getWriter();  

		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn = DriverManager.getConnection(dbURL,"root", "");
			String sql = "INSERT INTO maileruser VALUES (?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,n);
			statement.setString(2,p);
		
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				out.println("A new user was inserted successfully!");		}
 		} catch (Exception ex) {
			ex.printStackTrace();			}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
