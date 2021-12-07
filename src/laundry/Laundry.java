/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author Yosia
 */
public class Laundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
    }
    
    
}
