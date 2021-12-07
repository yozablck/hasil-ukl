/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.util.ArrayList;

/**
 *
 * @author Yosia
 */
public class JenisLaundry {
    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();
 private ArrayList<Integer> durasi = new ArrayList<Integer>();

 public JenisLaundry() {
 this.namaJenisLaundry.add("Cuci Kering Reguler");
 this.durasi.add(3);
 this.harga.add(6000);
 this.namaJenisLaundry.add("Cuci Kering Kilat");
 this.durasi.add(2);
 this.harga.add(7500);
 this.namaJenisLaundry.add("Cuci Kering Express");
 this.durasi.add(1);
 this.harga.add(9000);
 }
 public int getJmlJenisLaundry(){
 return this.namaJenisLaundry.size();
 }
 public void setNamaJenisLaundry(String namaJenisLaundry ){
 this.namaJenisLaundry.add(namaJenisLaundry);
 }
 public String getNamaJenisLaundry(int idJenisLaundry){
 return this.namaJenisLaundry.get(idJenisLaundry);
 }

 public void setDurasi(int durasi ){
 this.durasi.add(durasi);
 }
 public int getDurasi(int idJenisLaundry){
 return this.durasi.get(idJenisLaundry);
 }
 public void editDurasi(int idJenisLaundry, int durasi){
 this.durasi.set(idJenisLaundry, durasi);;
 }
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idJenisLaundry){
 return this.harga.get(idJenisLaundry);
 }
    
}
