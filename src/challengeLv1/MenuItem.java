package challengeLv1;

//class 정의하기
public class MenuItem {
    private String name;
    private double price;
    private String description;

    //생성자 constructor
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //getter 매서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //출력을 위한 toString
    @Override //자식클래스가 부모클래스를 재정의
    public String toString() {
        return name + " | W " + price + " | " + description;
    }

}

