package pizzasystems;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;


class Order {
    private List<Topping> toppings;
    private Pizza p; 
    public Order() {
        this.toppings = new ArrayList<>();
    }

    public String calculatePrice(String size, String pname, ArrayList<Topping> topping) {
    	String result = new String();
    	toppings = topping;
    	p = new Pizza(pname, size);
    	double totalPrice = p.getPrice();
        for (var item : toppings) {
            totalPrice += item.getPrice();
        }
        result = "" + totalPrice; 
        return result; 
    }
    
    public double calculateCalorie() {
    	double result = p.getCalories(); 
    	for(var item : toppings) {
    		result += item.getCalories();
    	}
    	return result; 
    }
    public void Display(String str, JTextArea area) {
    	String res = "";
    	String call = "";
    	res += p.getType() + " " + p.getPrice() + " TL\n";
    	double totalPrice = p.getPrice();
    	var len = p.getType().length() + 1;
    	
    	for(var item : toppings) {
    		res += item.getType();
    		totalPrice += item.getPrice();
    		for(int i = 0; i < len - item.getType().length(); i++) 
    		{
    			res += " ";
    		
    		}
    		res += item.getPrice() + " TL\n";
    	}
    	
    	for(int i = 0; i < len * 2; i++) 
		{
			res += "-";
		
		}
    	res += "\nTotal: ";
    	for(int i = 0; i < len - "Total:".length() - 1; i++) 
		{
			res += " ";
		
		}
    	res += totalPrice + " TL";
    	call += "\n\nCalorie: " + p.getCalories() + " + ";
    	
    	for(var item : toppings) {
    		call += item.getCalories() + " + ";
    	}
    	res += call.substring(0, call.length() - 2) + " = " + calculateCalorie() + " kcal";
    	area.setText(res);
    }
}

