/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmdl4sd;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    String nim;

    public Mahasiswa(String nm, String kl, String mat, String nim) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        this.nim = nim; // perlu menggunakan this untuk menghindari ambigu dengan parameter nim
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", "2828888"));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", "2828812"));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", "2828817"));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println(" Data Mahasiswa : " + data.nama + "\n Kelas : " + data.kelas + "\n Mata Kuliah : " + data.matkulPraktikum + "\n Nim : " + data.nim); // perlu menambahkan spasi pada string output
        }
    }
}
