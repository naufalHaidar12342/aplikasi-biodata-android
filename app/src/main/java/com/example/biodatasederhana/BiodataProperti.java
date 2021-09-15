package com.example.biodatasederhana;

public class BiodataProperti {
    private String nama;
    private String nim;
    private String shortDesc;
    private String hobi;
    private String alamat;
    private String kontak;
    private String email;


    public BiodataProperti(String nama, String nim, String shortDesc, String hobi, String alamat, String kontak, String email) {
        this.nama = nama;
        this.nim = nim;
        this.shortDesc = shortDesc;
        this.hobi = hobi;
        this.alamat = alamat;
        this.kontak = kontak;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
