/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author WINDOWS 10
 */
public class Pegawai extends DaftarGaji{
    public String nama, alamat, nip;
    
    public Pegawai() {
        
    }
    
    public Pegawai(String nama, String alamat, String nip) {
        this.nama = nama;
        this.alamat = alamat;
        this.nip = nip;
    }
    
    public void tampilDataPegawai() {
        System.out.println("NIP\t\t: "+nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        super.printGaji();
    }
}
