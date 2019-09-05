/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challange.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yeremia Rizky
 */
public class Challange2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
             
        
      //Deklarasi
      int Tugas, Laporan, Ujian, Akhir;
      int a, b, c, d;
     
      
      //Membuat scanner baru
      Scanner baca = new Scanner(System.in);
      
      
      //Input
      System.out.println("====================");
      System.out.println("Nama Siswa: Yeremia Rizky P");
      System.out.println("Kelas:X RPL 2");
      System.out.println("====================");
      System.out.println("=> NILAI <=");
      System.out.print("input nilaitugas :");
      Tugas = baca.nextInt();
      
      System.out.print("input nilailaporan :");
      Laporan = baca.nextInt();
      
      System.out.print("input nilaiujian :");
      Ujian = baca.nextInt();
      
      
      //Proses
      a = ( Tugas * 30 / 100);
      b = ( Laporan * 20 / 100);
      c = ( Ujian * 50 / 100);
      d = ( a + b + c);
      
      //Output
      System.out.println ("== Nilai Anda Setelah Proses ==");
      System.out.println("Jumlah nilai tugas :" + a );
      System.out.println("Jumlah nilai laporan :" + b );
      System.out.println("Jumlah nilai ujian:" + c );
      System.out.println("Jumlah nilai akhir:" + d );
      

      
      //penggolongan
      
      System.out.println("== Hasil Nilai Anda ==");
      
       if (d <=55){
           System.out.println("Nilai anda adalah E,Maaf Anda tidak lulus, tingkatkan belajar anda");
      }
       
       else if (d <=74){
           System.out.println("Nilai anda adalah D,Maaf Anda tidak lulus, tingkatkan belajar anda");
      }
       
       else if (d <= 85){
           System.out.println("Nilai anda adalah C,Selamat Anda lulus dengan cukup, tingkatkan lagi prestasimu");
      }
        
        else if (d <= 92){
             System.out.println("Nilai anda adalah B,Selamat Anda lulus dengan cukup, pertahankan lagi prestasimu");
      }
       
         else if (d <= 100){
             System.out.println("Nilai anda adalah A,Selamat Anda lulus, Excellent");
      }
         
      
    }  
        
}        
                    
    
    
}
