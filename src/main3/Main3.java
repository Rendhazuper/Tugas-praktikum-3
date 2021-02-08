/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

/**
 *
 * @author GAMES
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan vehi = new Kendaraan();
        
        vehi.data();
        
        System.out.println("=======================================================");
        System.out.println("DATA KENDARAAN ANDA");
        System.out.println("Jenis Kendaraan : "+vehi.jenis);
       
       System.out.println("Nama Brand : "+vehi.brand);
       
       System.out.println("cc :"+vehi.cc);
       
       System.out.println("Tahun Keluaran :"+vehi.tahun);
        System.out.println("=======================================================");
       
    }
    
}
