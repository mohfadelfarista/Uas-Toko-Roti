package tokoroti;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/toko_roti";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                System.out.println("Koneksi Gagal : " + e.getMessage());
            }
        }

        return koneksi;
    }
}