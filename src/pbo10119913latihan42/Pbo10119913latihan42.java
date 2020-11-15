/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan42;

import java.util.Scanner;

/**
 *
 @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class Pbo10119913latihan42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input.nextInt();
        System.out.println("Saldo anda sekarang : "+tabungan.ambilUang(jumlah));
    }
    
}