package pizzasystems;

class Topping extends Food {
    private String type;

    public Topping(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        double toppingPrice = 0;
        switch (type) {
            case "Olive":
                toppingPrice = 10;
                break;
            case "Corn":
                toppingPrice = 12;
                break;
            case "Chicken":
                toppingPrice = 20;
                break;
            case "Tomato":
                toppingPrice = 15;
                break;
        }
        return toppingPrice;
    }

    public int getCalories() {
        int toppingCalories = 0;
        switch (type) {
            case "Olive":
                toppingCalories = 100;
                break;
            case "Corn":
                toppingCalories = 80;
                break;
            case "Chicken":
                toppingCalories = 200;
                break;
            case "Tomato":
                toppingCalories = 50;
                break;
        }
        return toppingCalories;
    }
}

