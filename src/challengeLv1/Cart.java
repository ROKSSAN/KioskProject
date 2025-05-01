package challengeLv1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 🟨 필드
    private List<MenuItem> items;

    // 🟦 생성자
    public Cart() {
        this.items = new ArrayList<>();
    }

    // 🟩 메서드: 메뉴 항목 추가
    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item.getName() + " 이(가) 장바구니에 추가되었습니다.");
    }

    // 🟩 메서드: 장바구니 출력 및 총액 계산
    public static void showCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("[ Orders ]");
        double total = 0.0;
        for (MenuItem item : items) {
            System.out.println(item); // toString 사용
            total += item.getPrice();
        }

        System.out.println("\n[ Total ]");
        System.out.printf("W %.1f\n", total);
    }

    // 🟩 메서드: 비었는지 확인
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // 🟩 메서드: 장바구니 비우기
    public void clear() {
        items.clear();
        System.out.println("장바구니가 초기화되었습니다.");
    }
}
