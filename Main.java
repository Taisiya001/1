package Java_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> list = new ArrayList<HotDrink>(Arrays.asList(new HotDrink("Kola", 10.5, 10, 50),new HotDrink("Sprite",20.5,2, 100)));
        HotDrinkMachine machine = new HotDrinkMachine(list);
        String key = "Sprite";
        System.out.println(machine.getProduct(key));

    }
    
}

