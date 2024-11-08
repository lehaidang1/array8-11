package MangList;

import java.util.ArrayList;
import java.util.Collections;

public class SapXepTangDan {

    public static void main(String[] args) {
        ArrayList<Integer> sapxep = new ArrayList<>();
        sapxep.add(5);
        sapxep.add(3);
        sapxep.add(4);
        sapxep.add(2);
        sapxep.add(8);
        // Collections.sort() dùng để sắp xếp theo thứ tự thấp đến cao
        // Collections.sort(sapxep, Collections.ReverseOrder());dùng để sắp xếp theo thứ tự cao đến thấp.

        Collections.sort(sapxep);
        System.out.println(" sau khi sap xep la: " + sapxep);
    }

}
