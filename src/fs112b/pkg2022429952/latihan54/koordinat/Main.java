/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs112b.pkg2022429952.latihan54.koordinat;

/**
 * @author
 * NAMA     : Eggi Firman Saputra
 * KELAS    : PBO/ FS112B
 * NIM      : 2022429952
 * Deskripsi Program : Menggunakan konstruktor berparameter yang isinya setNamaVariabel,
 * jadi, isinya bukan " this.namaVariabel=parameterInput " tapi -> " setNamaVariabel(parameterInput); "
 * supaya fungsi setter-nya terpakai
 *
 */
public class Main {
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warnaKoordinat.getX()+", y : "+warnaKoordinat.getY());
    }
}
