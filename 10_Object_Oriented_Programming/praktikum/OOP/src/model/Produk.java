package model;
public class Produk {
    String nama;
    String deskripsi;
    int harga;
    int jumlah_stok_produk;

    public Produk(String nama, String deskripsi, int harga, int jumlah_stok_produk) {
        setNama(nama);
        setDeskripsi(deskripsi);
        setHarga(harga);
        setJumlah_stok_produk(jumlah_stok_produk);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setJumlah_stok_produk(int jumlah_stok_produk) {
        this.jumlah_stok_produk = jumlah_stok_produk;
    }

    public String getNama() {
        return nama;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public int getHarga() {
        return harga;
    }
    public int getJumlah_stok_produk() {
        return jumlah_stok_produk;
    }
    public void getProdukInfo() {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("Nama : " + getNama());
        System.out.println("Deskripsi : " + getDeskripsi());
        System.out.println("Harga : " + getHarga());
        System.out.println("Jumlah Stok : " + getJumlah_stok_produk());
        System.out.println("===");
    }
}


