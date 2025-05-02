package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 햄버거
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));

        // 음료
        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Coke", 2.5, "콜라"));
        drinks.add(new MenuItem("Lemonade", 3.0, "상큼한 레모네이드"));

        // 디저트
        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("Ice Cream", 4.0, "바닐라 아이스크림"));
        desserts.add(new MenuItem("Cookie", 2.0, "초코칩 쿠키"));

        // 메뉴 종류 선택
        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");

            System.out.print("번호를 입력하세요: ");
            int mainChoice = scanner.nextInt();

            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            List<MenuItem> selectedMenu = null;

            if (mainChoice == 1) {
                selectedMenu = burgers;
            } else if (mainChoice == 2) {
                selectedMenu = drinks;
            } else if (mainChoice == 3) {
                selectedMenu = desserts;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            // 선택한 메뉴 리스트 출력
            System.out.println();
            for (int i = 0; i < selectedMenu.size(); i++) {
                System.out.println((i + 1) + ". " + selectedMenu.get(i));
            }
            System.out.println("0. 뒤로가기");

            System.out.print("메뉴 번호를 선택하세요: ");
            int menuChoice = scanner.nextInt();

            if (menuChoice == 0) {
                continue; // 메인 메뉴로 돌아가기
            }

            if (menuChoice >= 1 && menuChoice <= selectedMenu.size()) {
                MenuItem chosenItem = selectedMenu.get(menuChoice - 1);
                System.out.println("선택한 메뉴: " + chosenItem.getName());
            } else {
                System.out.println("잘못된 입력입니다. 메인 메뉴로 돌아갑니다.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
