package ch018;

import java.sql.*;

public class DB3Demo {
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
        StringBuilder sql = new StringBuilder();
        sql.append("insert into person (name, phone, email)");
        sql.append("values (?, ?, ?)");
        PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
        preparedStatement.setString(1, "배장화");
        preparedStatement.setString(2, "010-2222-2222");
        preparedStatement.setString(3, "bae@two.com");
        preparedStatement.execute();
    }
}
