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
@WebServlet(name = "LogIn")
public class LogIn extends HttpServlet {
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
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String surname=null, name_client=null;
            sql = "SELECT surname, name_client, pass FROM client1 WHERE login='" + login + "'";


            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String pas = rs.getString("pass");
                System.out.println(pas + " " + password);
                if(pas.compareTo(password)==0){
                    request.setAttribute("surname", rs.getString("surname"));
                    request.setAttribute("name_client", rs.getString("name_client"));
                    request.getRequestDispatcher("/hey.jsp").forward(request,response);
                }
                else{
                    request.getRequestDispatcher("/index.jsp").forward(request,response);
                }

            }

            // Clean-up environment
            rs.close();
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
        } //end try
    }
}
