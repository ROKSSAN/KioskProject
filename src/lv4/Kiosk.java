package lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    // constructor
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 메인 흐름 시작
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 카테고리 보여주기
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            // 2. 사용자 입력 받기
            System.out.print("번호를 입력하세요: ");
            int menuChoice = scanner.nextInt();

            // 3. 종료 처리
            if (menuChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 4. 잘못된 입력 처리
            if (menuChoice < 1 || menuChoice > menus.size()) {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                continue;
            }

            // 5. 메뉴 선택 → 인덱스 -1 로 접근
            Menu selectedMenu = menus.get(menuChoice - 1);

            // 6. 선택한 카테고리의 메뉴 보여주기
            System.out.println("[ " + selectedMenu.getCategoryName() + " MENU ]");
            selectedMenu.showMenuItems(); // → 내부에서 번호 + 메뉴 출력 + 0. 뒤로가기

            // 7. 항목 선택
            System.out.print("메뉴 번호를 선택하세요: ");
            int itemChoice = scanner.nextInt();

            if (itemChoice == 0) continue;

            List<MenuItem> items = selectedMenu.getMenuItems();
            if (itemChoice < 1 || itemChoice > items.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            MenuItem chosenItem = items.get(itemChoice - 1);
            System.out.println("선택한 메뉴: " + chosenItem.getName());
            System.out.println();
        }

        scanner.close();
    }
}
