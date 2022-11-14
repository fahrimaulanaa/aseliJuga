package barang;

public class hasil extends kumpulan {
    @Override
    public void sethasil(){
        System.out.println("Nama Siswa     :" + super.nama);
        System.out.println("NISN           :" + super.NISN);
        System.out.println("Kelas          :" + super.kelas);
        System.out.println("Alamat         :" + super.alamat);
        System.out.println("No. Telepon    :" + super.no_tlp);
        System.out.println("-----------------------");
    }

}
