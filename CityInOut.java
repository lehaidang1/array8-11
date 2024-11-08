package MangList;

import java.util.ArrayList;

public class CityInOut {

    public static void main(String[] args) {
        ArrayList<String> citys = new ArrayList<>();
        citys.add(" Da Nang ");
        citys.add(" Ho Chi Minh ");
        citys.add(" Ha Noi ");
        citys.add(" Quang Nam ");
        citys.add(" Hai Phong ");

        System.out.println(" tên từng thành phố là: ");
        for (String thanhpho : citys) {
            System.out.println(thanhpho);
        }

    }

}
