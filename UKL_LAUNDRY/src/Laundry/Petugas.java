/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import Laundry.User;
import java.util.ArrayList;

/**
 *
 * @author ASUSVivoBook
 */
//polimorfisme =  implements
public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
     private ArrayList<Integer> jabatan = new ArrayList<Integer>();
     //enkapsulation =  private 
     //inheritance = this
     //poli... = Overriding
    
    public Petugas(){
        //add = menambahkan data
        this.namaPetugas.add("Mariposa");
        this.alamat.add("Pixie Holow");
        this.telepon.add("081********");
        this.jabatan.add( 0 );
        
        this.namaPetugas.add("Mimi Peri");
        this.alamat.add("Kayangan");
        this.telepon.add("081*********");
        this.jabatan.add( 1 );
        
        this.namaPetugas.add("Badarawuhi");
        this.alamat.add("Desa Penari");
        this.telepon.add("081*********");
        this.jabatan.add( 2 );
        
        this.namaPetugas.add("Billie Nganjuk");
        this.alamat.add("Nganjuk");
        this.telepon.add("081*********");
        this.jabatan.add( 3 );
        
    }
//set = mengganti
    //get = mendapatkan data
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
   

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public int getjabatan(int id) {
        return this.jabatan.get(id);
    }
    @Override
    public void setJabatan(int jabatan) {
          this.jabatan.add(jabatan);
    }

    @Override
    public Integer getJabatan (int id) {
        return this.jabatan.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getjabatan(i));
        }
    }

    

   
    
}
