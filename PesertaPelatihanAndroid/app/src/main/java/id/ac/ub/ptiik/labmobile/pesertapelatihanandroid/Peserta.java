package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.graphics.drawable.Drawable;

public class Peserta {

    public String nama;
    public String angkatan;
    public String email;
    public String tempatTanggalLahir;
    public String pinBB;
    public String idLine;
    public String instagram;
    public String path;
    public String twitter;
    public Drawable foto;

    public Peserta(String nama, String angkatan, String email, Drawable foto){
        this.nama = nama;
        this.angkatan = angkatan;
        this.email = email;
        this.foto = foto;
    }

}
