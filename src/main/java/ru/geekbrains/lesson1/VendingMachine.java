package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    // public BottleOfMilk getBottleOfMilk(String name, double volume){
    //     for (Product product: products) {
    //         if (product instanceof BottleOfMilk){
    //             BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
    //             if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
    //                 return bottleOfMilk;
    //             }
    //         }
    //     }
    //     return null;
    // }

    public ChocolateBar getChocolateBar(String name, double weight){
        for (Product product: products) {
            if (product instanceof ChocolateBar){
                ChocolateBar chocolateBar = (ChocolateBar)product;
                if (chocolateBar.getName().equals(name) && chocolateBar.getWeight() == weight){
                    return chocolateBar;
                }
            }
        }
        return null;
    }

}
