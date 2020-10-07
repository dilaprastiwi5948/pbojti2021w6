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
public class Dosen extends Pegawai{
    public int jumlahSKS, tarifSKS;
    
    public  Dosen(){
        
    }
    public Dosen(String nama, String alamat, String nip, int gaji, int jumlahSKS, int tarifSKS){
        super(nama,alamat,nip);
        this.jumlahSKS = jumlahSKS;
        this.tarifSKS = tarifSKS;
    }
    public void tampilDosen(){
        super.tampilDataPegawai();
        System.out.println("Jumlah SKS\t: "+jumlahSKS);
        System.out.println("Tarif SKS\t: "+tarifSKS);
        System.out.println("Gaji Dosen Total : "+(jumlahSKS*tarifSKS+super.gaji));
    }
}
