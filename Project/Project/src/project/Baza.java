/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author korisnik
 */
public class Baza {
    private static java.sql.Connection conn = null;
private static String url = "jdbc:mysql://localhost/farm";
private static String username = "root";
private static String password = "";

public static void addUser(Vlasnik vlasnik) {
try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/farm","root","");

Statement st = (Statement) conn.createStatement();
st.execute("INSERT INTO vlasnici (ime,prezime,adresa,telefon,godine) "
+ "" + "VALUES ('" + vlasnik.getIme() + "','" + vlasnik.getPrezime()
+
"','" + vlasnik.getAdresa() + "','" + vlasnik.getTelefon() +
"'," + vlasnik.getGodine() + ")");
conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}

public static void deleteUser(Vlasnik vlasnik){
    try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/farm","root","");

Statement st = (Statement) conn.createStatement();
st.execute("INSERT INTO vlasnici (ime,prezime,adresa,telefon,godine) "
+ "" + "VALUES ('" + vlasnik.getIme() + "','" + vlasnik.getPrezime()
+
"','" + vlasnik.getAdresa() + "','" + vlasnik.getTelefon() +
"'," + vlasnik.getGodine() + ")");
conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}


public void obrisiVlasnika(String ime, String prezime) {
    
    
    String query = "DELETE FROM vlasnici WHERE ime = ? AND prezime = ?"; 
    try (PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(query)) {
        stmt.setString(1, ime);
        stmt.setString(2, prezime);
        stmt.executeUpdate(); 
    } catch (SQLException e)
    { e.printStackTrace(); } }
}



