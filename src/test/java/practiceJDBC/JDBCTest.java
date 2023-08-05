package practiceJDBC;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        /**
         * We need  3 things to connect to Data Base
         * 1. Connection object
         * 2.Statement object
         * 3.ResultSet object
         */

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "Ostafi1994"
        );

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees");

      //  resultSet.next();

       // System.out.println(resultSet.getString(1));

       // resultSet.next();
      //  System.out.println(resultSet.getString(1));
//        resultSet.next();
//       System.out.println(resultSet.getString(2));
//       resultSet.next();
//       System.out.println(resultSet.getString(3));
      // String fullName = resultSet.getString(2) + resultSet.getString(3);
      // System.out.println(fullName);
//        int count = 0;
//       while(resultSet.next()){
//           count++;
//          System.out.println(count +". " +resultSet.getString(2)+ " " + resultSet.getString("last_name"));
//      }
        /**
         * ResultSetMetaData--> It holds data about data;(how many columns do you have,Data about table)
         *
         */
        ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println(metaData.getColumnCount());
        System.out.println("Table name:" + metaData.getTableName(1));

        for(int i=1; i<metaData.getColumnCount(); i++){
            System.out.println("Table:"+ metaData.getTableName(i)+". Column number:"+i+". Colum name:" + metaData.getColumnName(i));

        }


    }
}
