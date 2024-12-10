public class MobilePhone {
	
    private String brand;
    private double price;

    // Method to set the brand and price
    public void setDetails(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display the brand and price
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}
