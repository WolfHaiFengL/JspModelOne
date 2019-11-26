package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ToRemberDb {

    private static final String driver = "com.mysql.jdbc.Driver";

    private static final String url = "jdbc:mysql://localhost:3306/shopping?useUnicode=true&characterEncoding=UTF-8";
    private static final String username = "root";
    private static final String password = "root";

    private static Connection conn = null;

    static
    {
        try
        {
            Class.forName(driver);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception
    {
        if (conn == null)
        {
            conn = DriverManager.getConnection(url,username,password);
            return conn;
        }
        return conn;
    }

    public static void main(String[] args){

        try {
            Connection conn  = ToRemberDb.getConnection();
            if (conn!=null)
            {
                System.out.println("access seccess");
            }
            else
            {
                System.out.println("access error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}


