package com.mahasiswa.view;

import com.mahasiswa.controller.MahasiswaController;
import com.mahasiswa.model.MahasiswaDAO;
import java.util.Scanner;

public class MahasiswaView {

    public static void main(String[] args) {
        MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
        MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaDAO);
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        while(true){
            System.out.println("Menu :");
            System.out.println("1. Tampilkan Semua Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Cek Koneksi Database");
            System.out.println("6. Keluar");
            System.out.println("PILIH OPSI: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan){
                case 1:
                    mahasiswaController.displayAllMahasiswa();
                    break;
                case 2:
                    System.out.println("Masukan NPM: ");
                    String npm = scanner.next();
                    System.out.println("Masukan Nama: ");
                    String nama = scanner.next();
                    System.out.println("Masukan Semester: ");
                    int semester = scanner.nextInt();
                    System.out.println("Masukan IPK: ");
                    float ipk = scanner.nextFloat();
                    
                    mahasiswaController.addMahasiswa(npm, nama, semester, ipk);
                    break;
                case 3:
                    System.out.println("Masukan ID Mahasiswa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Masukan NPM: ");
                    String npmBaru = scanner.next();
                    System.out.println("Masukan Nama: ");
                    String namaBaru = scanner.next();
                    System.out.println("Masukan Semester");
                    int semesterBaru = scanner.nextInt();
                    System.out.println("Masukan IPK: ");
                    float ipkBaru = scanner.nextFloat();
                    
                    mahasiswaController.updateMahasiswa(id, npmBaru, namaBaru, semesterBaru, ipkBaru);
                    break;
                case 4:
                    System.out.println("Masukan ID Mahasiswa yg Ingin Dihapus: ");
                    int idHapus = scanner.nextInt();
                    mahasiswaController.deleteMahasiswa(idHapus);
                    break;
                case 5:
                    mahasiswaController.checkDatabaseConnection();
                    break;
                case 6:
                    mahasiswaController.closeConnection();
                    System.out.println("Program selesai");
                    return;
                default:
                    System.out.println("Input Tidak Valid");
            }
        }
    }
}