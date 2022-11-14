package barang;

import java.util.Scanner;

public class isi extends kumpulan{
        Scanner input = new Scanner(System.in);
        @Override
        public void setIsi() {
            System.out.print("Masukkan Nama Anda : ");
            String nama = input.next();
            System.out.print("Masukkan NISN Anda : ");
            int nisn = input.nextInt();
            System.out.print("Masukkan Kelas Anda : ");
            int kelas = input.nextInt();
            System.out.print("Masukkan Alamat Anda : ");
            String alamat = input.next();
            System.out.print("Masukkan No. Telepon Anda : ");
            int no_tlp = input.nextInt();
            System.out.println("" +
                    "-----------------------------------");
        }
}
