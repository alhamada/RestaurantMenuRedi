import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int select;
        int amount;
        MenuItem menuItem = new MenuItem();

        MainCourse mainCourse = new MainCourse();
        mainCourse.MainCourseDisplay();

        Drinks drinks = new Drinks();
        drinks.DrinksInit();

        Desserts desserts = new Desserts();
        desserts.Initialization();

        ArrayList<MenuItem> order = new ArrayList<>();

        while (true) {

            System.out.println("Enter Number of Operation: ");
            Scanner OptionNumber1 = new Scanner(System.in);
            select = OptionNumber1.nextInt();

            if(select == 999) {
                break;
            }

            Scanner OptionNumber2 = new Scanner(System.in);
            System.out.println("Enter Amount of Dishes: ");
            amount = OptionNumber2.nextInt();

            if (select > menuItem.a) {

                Desserts selectDesserts = new Desserts(select, amount);
                order.add(selectDesserts);
//                selectDesserts.Ordername();
            } else if (select > 5) {

                Drinks selectDrinks = new Drinks(select, amount);
                //selectDrinks.Ordername();
                order.add(selectDrinks);

            } else {

                MainCourse selectMainCourse = new MainCourse(select, amount);
               // selectMainCourse.Ordername();
                order.add(selectMainCourse);
            }

        }


        for (MenuItem item : order) {
            item.Ordername();
        }

    }

}