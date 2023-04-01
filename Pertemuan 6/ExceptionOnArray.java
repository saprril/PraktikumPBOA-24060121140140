/*
 * Nama File    : ExceptionOnArray.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 * Tanggal      : 01 April 2023
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try {
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}