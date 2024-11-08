package MangList;

import java.util.ArrayList;

public class CoHayKhong {

    public static void main(String[] args) {
        ArrayList<String> ngonngu = new ArrayList<>();
        ngonngu.add(" Python ");
        ngonngu.add(" C++ ");
        ngonngu.add(" Java ");
        ngonngu.add(" JavaScript ");

        if (ngonngu.contains(" Python ")) {
            System.out.println(" Python co trong danh sach. ");
        } else {
            System.out.println(" Python khong co trong danh sach. ");
        }

    }
}
