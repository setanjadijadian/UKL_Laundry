/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;

/**
 *
 * @author ASUSVivoBook
 */
public class Jenis { //Array
    private ArrayList<String> jenis = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public int size(){
        return this.jenis.size();
    }
    
    //(Inheritance)
    public Jenis(){
        this.jenis.add("Cuci Kering");
        this.harga.add(3000);
        this.durasi.add( 1 );
        
        this.jenis.add("Cuci Basah");
        this.harga.add(4000);
        this.durasi.add( 1 );
        
        this.jenis.add("Cuci Setrika");
        this.harga.add(6000);
        this.durasi.add( 1 );
        
        this.jenis.add("Cuci Karpet");
        this.harga.add(10000);
        this.durasi.add( 2 );
    }
    
    public void setLaundry(String jenis){
        this.jenis.add(jenis);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public String getLaundry(int id){
        return this.jenis.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public int getDurasi(int id){
        return this.durasi.get(id);
    }
}
