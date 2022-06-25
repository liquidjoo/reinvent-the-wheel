package liquidjoo.reinventthewheel.study;


public class Car {

    private String name;
    private int price;

    public Car() {

    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @PrintView
    public void printView() {
        System.out.println("자동차 정보를 출력 합니다.");
    }

    public void testGetName() {
        System.out.println("테스트 자동차 입니다.");
    }

    public void testGetPrice() {
        System.out.println("테스트 자동차의 가격은 0원 입니다.");
    }
}
