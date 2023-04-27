package DZ1;

public class Cola extends Product {
   
    private double Volume;
    private String Taste;
    private double Price;

    public double getVolume() {
        return  Volume;
    }
    public String getTaste() {
        return Taste;
    }
   
    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.Price = price;
        }
        else {
            System.out.println("Цена некорректна");
        }
    }
    public Cola (double inputVolume, String inputTaste, double inputPrice){
        this.Volume = inputVolume;
        this.Price = inputPrice;
        this.Taste = inputTaste;
       
    }


    String displayInfo() {

        return String.format("обьем: %s - вкус: %s - цена: %f денег", Volume, Taste, Price);

    }

}
