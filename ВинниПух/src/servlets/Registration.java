package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * Created by Маргарита on 28.12.2015.
 */
@WebServlet(name = "Registration")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Statement stmt = null;
        Connection conn = null;
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/javaclient";

        final String USER = "root";
        final String PASS = "root";

        response.setContentType("text/html");

        try{

            Class.forName(JDBC_DRIVER);
            System.out.println("Driver is registered");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute SQL query
            stmt = conn.createStatement();

            String sql = null;
            String surname = request.getParameter("surname");
            String name = request.getParameter("name");
            String log = request.getParameter("log");
            String pas = request.getParameter("pas");
            String sex = request.getParameter("sex");
            sql = "INSERT INTO client1(surname, name_client, login, pass, sex) VALUES ('"+surname+"','"+name+"','"+log+"','"+pas+"','"+sex+"')";

            boolean execute = stmt.execute(sql);
            if(execute){
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
            else{
            request.setAttribute("surname", surname);
            request.setAttribute("name_client", name);
            request.getRequestDispatcher("/hey.jsp").forward(request,response);}

            // Clean-up environment
            // rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException ignored){

            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
    }
}
