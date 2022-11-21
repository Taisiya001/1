package Java_program;


import java.util.List;

public class HotDrinkMachine {
    private final List<HotDrink> list; 

    public HotDrinkMachine(List<HotDrink> list2){
        this.list = list2;
    }
    public Product getProduct(String name){
        for(Product product: list){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product not found", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for(Product product: list){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == (volume) && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Product not found", name));
    }
}


