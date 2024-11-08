package MangList;

import java.util.ArrayList;

public class UpdateIndex3to100 {

    public static void main(String[] args) {
        ArrayList<Integer> update = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            update.add(i);
        }
        update.set(2, 100);
        System.out.println(" mang sau khi cap nhat la: " + update);
    }

}
