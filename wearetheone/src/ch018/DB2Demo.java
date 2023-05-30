package ch018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB2Demo {
    public static Connection makeConnection() {
//        String url = "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        Connection connection = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("oracle.jdbc.OracleDriver");

            System.out.println("데이터베이스 연결 중...");
            connection = DriverManager.getConnection(url, "system", "1234");
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = makeConnection();
        Statement statement = connection.createStatement();
        String sql = "insert into person (name, phone, email) values" + "('임꺽정', '010-1234-9876', 'lim@four.com')";

        if (statement.executeUpdate(sql) == 1) {
            System.out.println("레코드 추가 성공");
        } else {
            System.out.println("레코드 추가 실패");
        }

        connection.close();
        statement.close();
    }
}
