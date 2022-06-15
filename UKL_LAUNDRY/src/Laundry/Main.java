/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import Laundry.Transaksi;
import Laundry.Jenis;
import Laundry.Client;
import java.util.Scanner;

/**
 *
 * @author ASUSVivoBook
 */
public class Main {
    static Client client = new Client();
    static Petugas petugas = new Petugas();
    static Transaksi transaksi = new Transaksi();
    static Jenis jenis= new Jenis();
    static Scanner input = new Scanner(System.in);
    static boolean tetap = true;
    static String key;
    
    public static void main(String[] args){
        System.out.println("Apakah anda sudah memiliki akun? (yes/no)");
        String jawab = input.next();
        if(jawab.equalsIgnoreCase("yes")){
             System.out.println("\t");
             System.out.println("==========================================");
             System.out.println("------> Daftar ID <------");//
             System.out.println("Fadil : 12345");
             System.out.println("Ice   : 12233");
             System.out.println("Kha   : 54321");
             System.out.println("==========================================");
             System.out.print("Masukkan ID Anda : ");
             int id = input.nextInt();
             System.out.println("Selamat Datang "+client.getNama(transaksi.getClient(id)));
             System.out.print("ID anda : "+id);
             System.out.println("==========================================");
             menu(id);
        }
        else if(jawab.equalsIgnoreCase("no")){
             System.out.println("\t");
             System.out.println("==========================================");
            System.out.print("Masukkan Nama : ");
            String nama = input.next();
            client.setNama(nama);
            System.out.print("Masukkan ID untuk anda : ");
            int Id = input.nextInt();
            transaksi.setIDClient(Id);
            System.out.print("Masukkan Alamat : ");
            String alamat = input.next();
            client.setAlamat(alamat);
            System.out.print("Masukkan Nomor Telepon : ");
            String telepon = input.next();
            client.setTelepon(telepon);
            System.out.print("Masukkan saldo yang ingin anda tambahkan : ");
            int saldo = input.nextInt();
            client.addSaldo(saldo);
            System.out.print("Terimakasih telah mendaftar : "+nama);
            int id = transaksi.getIDClient(client.getId(nama));
            System.out.print("ID anda : "+id);
            System.out.print("==========================================");
            menu(id);
        } 
        else  {
             System.out.println("\t");
            System.out.println("!!EROR!!");
            System.out.println("==========================================");
            System.out.println("\t");
            
       }       
    }  
    
    
    public static void tampilLaundry(){
        int n = jenis.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("        "+jenis.getLaundry(i));
            System.out.println("Harga  = "+jenis.getHarga(i)+ " Ribu" );
            System.out.println("Durasi = "+jenis.getDurasi(i)+ " Jam");
            System.out.println("ID     = "+transaksi.getIDJenisLaundry(i));
        }
    }
    
    public static void menu(int id){
        while(tetap){
            System.out.println("\t");
            System.out.println("-- Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Laundry");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    tampilLaundry();
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                    break;
                case 2:
                    petugas.tampilPetugas();
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                    break;
                case 3:
                    client.tampilClient();
                    System.out.println("Ketik apapun dan enter untuk keluar");
                    key = input.next();
                    break;
                       
                case 4:
                    tampilLaundry();
                    System.out.print("Masukkan Id laundry : ");
                    int laundry = input.nextInt();
                    
                    System.out.print("Masukkan banyak laundry anda (Kg) : ");
                    int banyak = input.nextInt();
                    transaksi.setBanyak(banyak);
                    int harga = jenis.getHarga(transaksi.getIDJenisLaundry(laundry))*banyak;
                    int total ;
                    total = client.getSaldo(transaksi.getClient(id))-harga;
                    if(client.getSaldo(transaksi.getClient(id))>=harga){
                        System.out.println("---------> TOTAL <---------");
                        System.out.println("Petugas       =  "+petugas.getNama(transaksi.getIDJenisLaundry(laundry)));
                        System.out.println("Jenis Laundry =  "+jenis.getLaundry(laundry)); //jenis laundry
                        System.out.println("Total Harga   =  "+harga + " Ribu "); //harga
                        System.out.println("Jumlah        =  "+banyak+ "  Kg    "); //banyak
                        System.out.println("Durasi        =  "+jenis.getDurasi(laundry)+ " Jam ");//out put waktu
                        System.out.println("Sisa Saldo    =  "+total + " Ribu "); //sisa saldo
                        client.setSaldo(transaksi.getClient(id), client.getSaldo(transaksi.getClient(id))-harga);//untuk merubah nominal saldo di list client
                        System.out.println("Terimakasih telah menggunkaan jasa kami");
                        System.out.println("---------------------------");
                        System.out.println("\t"); 
                        System.out.println("Ketik apapun dan enter untuk kembali");
                        key = input.next();
                    }
                    else{
                        System.out.println("> Saldo anda tidak cukup <");
                        System.out.println("Ketik apapun dan enter untuk kembali");
                        key = input.next();
                    }   break;
                case 5:
                    System.out.println("Terimakasih Sudah memakai Layanan Kami");
                    tetap = false;
                    break;
                    
                default:
                    System.out.println("Inputan tidak sesuai");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                    break;
            }
        }
    }
}
   

