package belajar.payroll;

import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class MainAbsen {
    public static void main(String[] xx) throws Exception {
        String namafilePegawai = ("D:/aplikasi-payroll/data/tarif.txt");
        String namafileAbsen = ("D:/aplikasi-payroll/data/absen-11.txt");
        
        PegawaiDao pd = new PegawaiDao(namafilePegawai);
        AbsenDao ad = new AbsenDao(namafileAbsen, pd);
        List<Absen> daftarAbsen = ad.semuaData();
        
        for(Absen px : daftarAbsen){
            System.out.println("========================");
            System.out.println("Nomer Pegawai: "+px.getPegawai().getNomer());
            System.out.println("Nama Pegawai : "+px.getPegawai().getNama());
            System.out.println("Gaji Pokok   : "+px.getPegawai().getGaji());
            System.out.println("Jam Datang   : "+px.getDatang());
            System.out.println("Jam Pulang   : "+px.getPulang());
			System.out.println("========================");
        }
    }
}
