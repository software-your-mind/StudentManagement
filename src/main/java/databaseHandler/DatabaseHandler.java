package databaseHandler;

import java.sql.*;

public class DatabaseHandler {
    public static String dbName;
    public static String userName;
    public static String password;
    public String querry(String sql){
        String result = new String();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Toilathanh1");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM  class");
            while (rs.next())
                result = result + (rs.getString("classId")+"  "+rs.getString("schoolYear")) + '\n';
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }
    public void update(String sql){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Toilathanh1");
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
