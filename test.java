/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConn2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
 
      // Lấy ra đối tượng Connection kết nối vào DB.
      Connection connection = MySqlConn2.ConnectionUtils.getMyConnection();
 
      // Tạo đối tượng Statement.
      Statement statement = connection.createStatement();
 
      String sql = "SELECT M FROM symptom_disease_relation";
 
      // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
      ResultSet rs = statement.executeQuery(sql);
 
      // Duyệt trên kết quả trả về.
      while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
          //String name = rs.getString(1);
          //int age = rs.getInt(2);
          //String ingamename = rs.getString(3);
          float m = rs.getFloat(1);
          System.out.println("--------------------");
          System.out.println("M:" + m);
      }
      // Đóng kết nối
      connection.close();
  }
}
