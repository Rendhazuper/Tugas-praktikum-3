/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;
import java.util.*;

/**
 *
 * @author GAMES
 */
public class Kendaraan {
   Scanner input = new Scanner(System.in);
   
   String brand,jenis;
   int tahun,cc; 
   
   
   void data(){
       System.out.println("MASUKAN DATA KENDARAAN ANDA");
       System.out.print("Jenis Kendaraan : ");
       jenis = input.nextLine();
       System.out.print("Nama Brand : ");
       brand = input.nextLine();
       System.out.print("cc :");
       cc = input.nextInt();
       System.out.print("Tahun Keluaran :");
       tahun = input.nextInt();
       
   }
}
