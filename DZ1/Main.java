package DZ1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Ок", "11", -100);
        System.out.println(product3.displayInfo());

        //product3.setPrice(-50.5);
       //product3.name = "____";
       // product3.price = -50.5;

        System.out.println(product3.displayInfo());
        
        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 2, 10);

        Cola cola1 = new Cola(1.5, "Классическая", 100);
        Cola cola2 = new Cola(0.5, "Ванильная", 60);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(cola2);
        products.add(cola1);


        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

    }


}