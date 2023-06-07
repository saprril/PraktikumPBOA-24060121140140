/*
* Nama File    : MainDAO.java
* Nama Pembuat : Fauzan Ramadhan Putra
* NIM          : 24060121140140
* Deskripsi    : File Main untuk menjalankan program
* Tanggal      : 03 Juni 2023
*/

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}