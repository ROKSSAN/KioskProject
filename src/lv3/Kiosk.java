package lv3;

import java.util.*;

public class Kiosk {
    private List<MenuItem> burgers;
    private List<MenuItem> drinks;
    private List<MenuItem> desserts;

    public Kiosk(List<MenuItem> burgers, List<MenuItem> drinks, List<MenuItem> desserts) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.desserts = desserts;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

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

            if (mainChoice == 1) selectedMenu = burgers;
            else if (mainChoice == 2) selectedMenu = drinks;
            else if (mainChoice == 3) selectedMenu = desserts;
            else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.println();
            for (int i = 0; i < selectedMenu.size(); i++) {
                System.out.println((i + 1) + ". " + selectedMenu.get(i));
            }
            System.out.println("0. 뒤로가기");

            System.out.print("메뉴 번호를 선택하세요: ");
            int menuChoice = scanner.nextInt();

            if (menuChoice == 0) continue;

            if (menuChoice >= 1 && menuChoice <= selectedMenu.size()) {
                MenuItem item = selectedMenu.get(menuChoice - 1);
                System.out.println("선택한 메뉴: " + item.getName());
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
