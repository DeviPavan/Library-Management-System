package Application3;

public class ShoppingCart {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product(1,"Laptop", 1200.0F,100);
        Product phone = new Product(2,"Phone", 800.0F,200);
        Product headphones = new Product(3,"Headphones", 100.0F,300);

// creating a shopping cart
        Cart cart = new Cart();
        // Adding products to the cart
              cart.addProduct(laptop);
              cart.addProduct(phone);
              cart.addProduct(headphones);
        // Displaying the available contents of the cart
        System.out.println("Products in the cart:");
        for (Product product : cart.getProducts()) {
            System.out.println(product);
        }
        // Calculate and display the total cost
        System.out.println("Total cost: $" + cart.calculateTotalCost());

        // Remove a product from the cart
        cart.removeProduct(phone);

        // Display the updated contents of the cart
        System.out.println("\nProducts in the cart after removing a product:");
        for (Product product : cart.getProducts()) {
            System.out.println(product);
        }
        // Calculate and display the updated total cost
        System.out.println("Total cost after removing a product: $" + cart.calculateTotalCost());
    }
}
