import model.Produk;

public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("coffee", "this is coffee", 15000, 10 );
        Produk produk2 = new Produk("milk",  "this is fresh milk", 25000, 10 );
        Produk produk3 = new Produk("apple juice", "this is juice",  10000, 20 );

        produk1.getProdukInfo();
        produk2.getProdukInfo();
        produk3.getProdukInfo();
    }
}