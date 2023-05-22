import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialiasi ArayList yang hanya dapat berisi objek
        // string
        ArrayList<String> strings = new ArrayList<String>();

        // menambah elemen
        strings.add( "praktikum" );
        strings.add( "collection" );
        strings.add( "dan generics" );

        // menghapus elemen
        strings.remove( "praktikum" );

        // iterasi keseluruhan ArrayList
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}