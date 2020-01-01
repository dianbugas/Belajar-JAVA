package com.tutoral;

class Mahasiswa {
    // data member
    String nama;
    String NIM;

    // construktor sebenarnya merupakan method khusus
    Mahasiswa(String inputNama, String inputNIM) {
        nama = inputNama;
        NIM = inputNIM;
    }

    // Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }

    // method tanpa return dan dengan menggunakan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    String sayHi(String message) {
        return message + "juga, nama saya adalah" + this.nama;
    }
}

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("dian", "02112");
        // METHOD
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("hai dian");
        System.out.println(data);

        Dosen dosen1 = new Dosen("dian");
        dosen1.nama;
    }
}