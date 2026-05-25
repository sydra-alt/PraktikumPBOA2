/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PersonDAO;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        String name = person.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo",
            "root",
            "Sap123rs"
        );

        String query =
            "INSERT INTO person(name) VALUES('" + name + "')";

        Statement s = con.createStatement();

        s.executeUpdate(query);

        con.close();
    }
}
