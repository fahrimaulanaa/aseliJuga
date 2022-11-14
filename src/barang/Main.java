package barang;
 class kt{
    public static void keterangan(){
        System.out.println("Sukses Menyimpan Data");
    }
 }

public class Main {
    public static void main(String[] args) {
        isi data = new isi();
        hasil hasil = new hasil();
        data.setIsi();
        hasil.sethasil();
        kt.keterangan();
    }
}
