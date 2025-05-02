package lv3;

import java.util.ArrayList;
import java.util.List;

public class Lv3Main {
    public static void main(String[] args) {
        // MenuItem 리스트 생성
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));

        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Coke", 2.5, "콜라"));
        drinks.add(new MenuItem("Lemonade", 3.0, "상큼한 레모네이드"));

        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("Ice Cream", 4.0, "바닐라 아이스크림"));
        desserts.add(new MenuItem("Cookie", 2.0, "초코칩 쿠키"));

        // Kiosk 객체 생성 후 start() 메서드 호출
        Kiosk kiosk = new Kiosk(burgers, drinks, desserts);
        kiosk.start();
    }
}
