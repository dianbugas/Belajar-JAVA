package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
        // instansisasi atau membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "dian";
        mahasiswa1.NIM = "012312312";
        mahasiswa1.jurusan = "tekdasd";
        mahasiswa1.IPK = 2.3;
        mahasiswa1.umur = 23;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "diandas";
        mahasiswa2.NIM = "012312312dasd";
        mahasiswa2.jurusan = "tekdasddas";
        mahasiswa2.IPK = 2.32;
        mahasiswa2.umur = 233;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}