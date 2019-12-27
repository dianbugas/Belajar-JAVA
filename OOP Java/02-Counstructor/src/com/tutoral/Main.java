package com.tutoral;

//class tanpa construktor / class polos 
class Polos {
    String dataString;
    int dataInteger;
}

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // construktor di panggil pada saat objek pertama kali di panggil
    // Mahasiswa() {
    // System.out.println("ini adalah construktor");
    // }

    // contruktor parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

// class dgn construktor ->> cara kita mengkomposisikan sebuah objek
// INTINYA CONSTRUKTOR ADALAH SEBUAH METHOD ATAU SEBUAH PROSEDUR YG PERTAMAKALI
// YANG AKAN DI PANGGIL
public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("dian", "423423", "DASDSADasd");
        Mahasiswa mahasiswa2 = new Mahasiswa("eeee", "5555555", "aaaa");

        // new Mahasiswa();

        // Polos objekPolos = new Polos();
        // objekPolos.dataInteger = 0;
        // objekPolos.dataString = "polos";

        // System.out.println(objekPolos.dataInteger);
        // System.out.println(objekPolos.dataString);
    }
}
