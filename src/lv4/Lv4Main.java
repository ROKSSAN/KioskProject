package lv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv4Main {
    public static void main(String[] args) {
        // MenuItem 생성
        List<MenuItem> burgers = Arrays.asList(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        );

        List<MenuItem> drinks = Arrays.asList(
                new MenuItem("Coke", 2.5, "콜라"),
                new MenuItem("Lemonade", 3.0, "상큼한 레모네이드")
        );

        List<MenuItem> desserts = Arrays.asList(
                new MenuItem("Ice Cream", 4.0, "바닐라 아이스크림"),
                new MenuItem("Cookie", 2.0, "초코칩 쿠키")
        );

        // Menu 객체 생성 (카테고리 메뉴판)
        List<Menu> menus = Arrays.asList(
                new Menu("Burgers", burgers),
                new Menu("Drinks", drinks),
                new Menu("Desserts", desserts)
        );

        // Kiosk 실행
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
