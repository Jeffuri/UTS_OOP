/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author Jefri
 */
public class Data {
    private String nim;
    private String nama;
    private String kelas;
    private String jurusan;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        jurusan = "";
    }

    public Data(String nim, String nama, String kelas, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getnim() {
        return nim;
    }

    public String getnama() {
        return nama;
    }

    public String getkelas() {
        return kelas;
    }

    public String getjurusan() {
        return jurusan;
    }
}
