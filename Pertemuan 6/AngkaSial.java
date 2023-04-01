/*
 * Nama File    : AngkaSial.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Tanggal      : 01 April 2023
 */

public class AngkaSial {

   public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException("AWASS!! ANGKA SIAL");
        }
        System.out.println(angka+" bukan angka sial");
   }

   public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
   } 
}

// PERTANYAAN
// tidak bisa dieksekusi karena class angkasial exception belum dibuat
// oleh karena itu perlu adanya pembuatan class angka sial exception yang merupakan
// turunan dari class exception