package MangList;

import java.util.ArrayList;

public class NumbersAddRemove {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            numbers.add(i + 1);
        }
        // remove số 5 phải dùng ((Integer) 5) vù 5 là số
        // không được dùng numbers.remove("5") vì sẽ coi 5 là chuỗi
        numbers.remove((Integer) 5);

        System.out.println(" acc so con lai la: " + numbers);

    }

}