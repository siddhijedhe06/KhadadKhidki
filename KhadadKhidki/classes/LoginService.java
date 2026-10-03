import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginService")   // URL to call this servlet
public class LoginService extends HttpServlet {

    public boolean loginUser(String email, String password) {
        boolean valid = false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fooddb",
                "root",
                "Root123"   // ✅ Put your DB password here (not empty)
            );

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();
            if (rs.next()) valid = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if(rs != null) rs.close(); } catch(Exception e) {}
            try { if(ps != null) ps.close(); } catch(Exception e) {}
            try { if(conn != null) conn.close(); } catch(Exception e) {}
        }

        return valid;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password"); // ✅ your HTML must use name="password"

        boolean valid = loginUser(email, password);

        if(valid) {
            out.println("<h3>✅ Login Successful! Welcome " + email + "</h3>");
        } else {
            out.println("<h3>❌ Invalid email or password.</h3>");
        }
    }
}
