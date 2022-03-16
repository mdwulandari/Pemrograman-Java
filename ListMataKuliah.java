import java.util.*;

public class ListMataKuliah{
    public static void main(String[] args){
        //menggunakan array list
        List<String> list = new ArrayList<String>();
        list.add("Algoritma");
        list.add("Pemorograman");
        list.add("Konsep Basis Data");
        list.add("Pengantar TI");
        list.add(1, "Teknologi Basis Data");
        list.add("Teknologi Basis Data"); //objek lainnya masih bisa terus ditambahkan ke List

        System.out.println(list);
    }
}
