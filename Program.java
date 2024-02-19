import java.util.ArrayList;
import java.util.List;

public class Program{

public static void main(String [] args){
    // полиморфизм

    Product milk1 = new BottleOfMilk("ПРОСТОквашино", "МОЛОКО",108, 0.9, 1.5);
    Product milk2 = new BottleOfMilk("Молочник", "Milk_Brand", 55, 0.4, 2.5);
    Product water1 = new BottleOfWater("Источник", "Исток",28, 1);
    Product water2 = new BottleOfWater("Архыз", "Кавказ",  38, 1.4);
    Product water3 = new BottleOfWater("Байкал", "Алтай", 88, 0.7);
    Product milk3 = new BottleOfMilk("My-Milk", "I milk", 140, 1.5, 6);  
    Product water = new Product("Water",33);
    Product chokolate = new Chocolate("Sneackers", "mars", 65, 95, "nuts");
    System.out.println(chokolate.toString());             

    List<Product> products = new ArrayList<>();
    products.add(milk1);
    products.add(milk2);
    products.add(water1);
    products.add(water2);
    products.add(water3);
    products.add(milk3);
    products.add(water);
    products.add(chokolate);

    System.out.println(products.toString());
}
}