/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack4;

import java.util.Scanner;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public class Hack4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        
        Manager manager = new Manager();
        System.out.print("Masukkan NIK : ");
        manager.setNik(sc1.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(sc2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(sc3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(sc4.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(sc5.nextInt());

        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + manager.getNik());
        System.out.println("NAMA\t: " + manager.getNama());
        System.out.println("GOLONGAN: " + manager.getGolongan());
        System.out.println("JABATAN\t: " + manager.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN\t: " 
                + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " 
                + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " 
                + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());

    }

}
