package tokoroti;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RotiDAO {

    Connection conn;

    public RotiDAO() {
        conn = koneksi.getConnection();
    }

    // SIMPAN
    public void simpan(Roti roti) {

        try {

            String sql = "INSERT INTO roti(nama_roti, jenis_roti, harga, stok) VALUES(?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, roti.getNamaRoti());
            pst.setString(2, roti.getJenisRoti());
            pst.setInt(3, roti.getHarga());
            pst.setInt(4, roti.getStok());

            pst.executeUpdate();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    // UBAH
    public void ubah(Roti roti) {

        try {

            String sql = "UPDATE roti SET nama_roti=?, jenis_roti=?, harga=?, stok=? WHERE id_roti=?";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, roti.getNamaRoti());
            pst.setString(2, roti.getJenisRoti());
            pst.setInt(3, roti.getHarga());
            pst.setInt(4, roti.getStok());
            pst.setInt(5, roti.getId());

            pst.executeUpdate();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    // HAPUS
    public void hapus(int id) {

        try {

            String sql = "DELETE FROM roti WHERE id_roti=?";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, id);

            pst.executeUpdate();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}