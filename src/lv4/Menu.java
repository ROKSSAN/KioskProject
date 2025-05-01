package lv4;
import java.util.List;

public class Menu {
    private String categoryName;           // "Burgers", "Drinks"
    private List<MenuItem> menuItems;      // 카테고리에 속한 메뉴list

    //constructor
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    //getter
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    public void showMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
        }
        System.out.println("0. 뒤로가기");
    }
}
