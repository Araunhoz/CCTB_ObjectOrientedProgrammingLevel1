public class MobilePhoneTest {
	
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        // Functional Testing
        System.out.println("--------- Functional Testing ---------");
        phone.setDetails("Xiaomi", 599.99);
        phone.displayDetails(); 

        // Boundary Testing
        System.out.println("\n--------- Boundary Testing ---------");
        phone.setDetails("Motorola".repeat(1000), 1000.99);
        phone.displayDetails(); // Expected: long brand name

        phone.setDetails("Samsung", -400.00);
        phone.displayDetails(); // Expected: Handle negative price

        phone.setDetails("Apple", 8000000.00);
        phone.displayDetails(); // Expected: Handle high price

        // Usability Testing
        System.out.println("\n--------- Usability Testing ---------");
        phone.setDetails("Asus", 1299.99);
        phone.displayDetails(); // Expected: Clear and understandable output

        // Negative Testing
        System.out.println("\n--------- Negative Testing ---------");
        phone.setDetails("", 999.99);
        phone.displayDetails(); // Expected: Handle empty brand

        phone.setDetails("Acer", 0);
        phone.displayDetails(); // Expected: Handle zero price
    }
}
