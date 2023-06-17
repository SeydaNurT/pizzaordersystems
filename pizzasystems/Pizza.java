package pizzasystems;
import java.util.ArrayList;
import java.util.List;
 


class Pizza extends Food {
    private String type;
    private String size;
    private List<String> toppings;

    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public double getPrice() {
        double pizzaPrice = 0;
        switch (type) {
            case "Margarita":
                pizzaPrice = 100;
                break;
            case "Pepperoni":
                pizzaPrice = 120;
                break;
            case "Hawaiian":
                pizzaPrice = 130;
                break;
            case "Three Cheese":
                pizzaPrice = 110;
                break;
        }
        double toppingPrice = toppings.size() * 10;
        double sizeMultiplier = 1;
        switch (size) {
            case "Small":
                sizeMultiplier = 0.8;
                break;
            case "Medium":
                sizeMultiplier = 1.0;
                break;
            case "Large":
                sizeMultiplier = 1.2;
                break;
        }
        return pizzaPrice * sizeMultiplier + toppingPrice;
    }

    public int getCalories() {
        int pizzaCalories = 0;
        switch (type) {
            case "Margarita":
                pizzaCalories = 800;
                break;
            case "Pepperoni":
                pizzaCalories = 1100;
                break;
            case "Hawaiian":
                pizzaCalories = 850;
                break;
            case "Three Cheese":
                pizzaCalories = 950;
                break;
        }
        int toppingCalories = toppings.size() * 100;
        return pizzaCalories + toppingCalories;
    }
}

