package lv3;

public class RestaurantMain {
    public static void main(String[] args) {
        Menu menu =new Menu();
        menu.show_dishes();
        menu.choice_dishes_main_body();
        System.out.println("还点吗");
        menu.choice_dishes_main_body();

    }
}
