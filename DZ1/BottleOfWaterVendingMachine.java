package DZ1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine  {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume, int fat){

        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName() == name && ((BottleOfMilk)product).getVolume() == volume &&
                        ((BottleOfMilk)product).getFat() == fat){
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;


    }

    public Cola getCola( String name, String taste, Double volume){

        for (Product product : products){
            if (product instanceof Cola){
                if (product.getName() == name && ((Cola)product).getTaste() == taste &&
                        ((Cola)product).getVolume() == volume){
                    return (Cola) product;
                }
            }
        }
        return null;
    }
}


