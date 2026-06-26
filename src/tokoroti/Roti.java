package tokoroti;

public class Roti {

    private int id;
    private String namaRoti;
    private String jenisRoti;
    private int harga;
    private int stok;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaRoti() {
        return namaRoti;
    }

    public void setNamaRoti(String namaRoti) {
        this.namaRoti = namaRoti;
    }

    public String getJenisRoti() {
        return jenisRoti;
    }

    public void setJenisRoti(String jenisRoti) {
        this.jenisRoti = jenisRoti;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}