/*
 * Nama File    : Pegawai.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Superclass Pegawai
 * Tanggal      : 10 Mei 2023
 */


public class Pegawai{
	private String nama;
	private int gajiPokok = 5000000;

	public void setNama(String nama){
		this.nama = nama;
	}

	public void tampilData(){
		System.out.println("Nama : " + this.nama + ", Gaji pokok : " + gajiPokok);
	}

}
