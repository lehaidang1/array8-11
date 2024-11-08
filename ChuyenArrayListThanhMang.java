package MangList;

import java.util.ArrayList;

public class ChuyenArrayListThanhMang {

    public static void main(String[] args) {
        ArrayList<Integer> chuyen = new ArrayList<>();
        chuyen.add(5);
        chuyen.add(3);
        chuyen.add(4);
        chuyen.add(2);
        chuyen.add(8);
        //  chuyển ArrayList => Mang
        Integer[] mang = chuyen.toArray(new Integer[0]);

        System.out.print(" cac phan tu cua mang: ");
        // đọc lại các phần tử của mảng

        for (Integer num : mang) {
            System.out.print(num + " ");
        }
    }
}
