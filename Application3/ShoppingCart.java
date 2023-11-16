package Application3;
import java .util.Arrays;
import java.util.ArrayList;
import java.util.InputMismatchException;
//import java.util.IndexOutOfBoundsException;
import java.util.Scanner;
import java.util.List;

public class ShoppingCart {
    public static <InputMismatchException extends Throwable> void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        List<Product> availableProducts = creatingSampleProductsList();

        System.out.println("Welcome to the Simple Shopping App!");
        int choice;
        do {
            displayMenu();
            choice = getUserChoice(scanner);

            try {
                switch (choice) {
                    case 1:
                        viewProducts(availableProducts);
                        break;
                    case 2:
                        addProductToCart(scanner, availableProducts, cart);
                        break;
                    case 3:
                        removeProductFromCart(scanner, cart);
                        break;
                    case 4:
                        cart.viewCart();
                        break;
                    case 5:
                        checkout(cart, scanner);
                        break;
                    case 6:
                        System.out.println("Exiting the Simple Shopping App. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid product ID. Please enter a valid product ID.");
                scanner.nextLine(); // Clears the buffer
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. Remove Product from Cart");
        System.out.println("4. View Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice: ");
    }


    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }
    private static void viewProducts(List<Product> availableProducts) {
        System.out.println("\nAvailable Products:");
        for (Product product : availableProducts) {
            System.out.println(product);
        }
    }
    private static void addProductToCart(Scanner scanner, List<Product> available_Products, Cart cart) {
        viewProducts(available_Products);
        System.out.print("\nEnter Product ID to add to cart: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        Product selected_Product = findingProductById((productId), available_Products);
        if (selected_Product != null) {
            cart.addProduct(selected_Product, quantity);
        } else {
            System.out.println("Invalid product ID. Product not found.");
        }
    }
    private static void removeProductFromCart(Scanner scanner, Cart cart) {
        System.out.print("\nEnter Product ID to remove from cart: ");
        int productId = scanner.nextInt();
        cart.removeProduct(productId);
    }
    private static void checkout(Cart cart, Scanner scanner) {
        cart.viewCart();
        double totalCost = cart.calculateTotalCost();
        System.out.println("\nCheckout");
        System.out.println("Total Cost: $" + totalCost);
        System.out.print("\nEnter payment amount: ");
        double payment_Amount = scanner.nextDouble();

        if (payment_Amount >= totalCost) {
            System.out.println("Payment successful! Thank you for shopping.");
            cart.clearCart();
        } else {
            System.out.println("Insufficient funds..your Transaction got cancelled.");
        }
    }

    private static Product findingProductById(int productId, List<Product> products) {
        for (Product product : products) {
            if (product.getproductID() == productId) {
                return product;
            }
        }
        return null;
    }

    private static List<Product> creatingSampleProductsList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 800.0f,100));
        products.add(new Product(2, "Smartphone", 300.0f,200));
        products.add(new Product(3, "Headphones", 50.0f,200));
        return products;
    }
}








        /*// Creating an array(static) for the shopping cart
        Product[] product_cart = new Product[3];
        Product laptop = new Product(1, "Laptop", 1200.0F, 100);
        Product phone = new Product(2, "Phone", 800.0F, 200);
        Product headphones = new Product(3, "Headphones", 100.0F, 300);
        //add (Dynamic) products to cart
        product_cart[0] = laptop;
        product_cart[1] = phone;
        product_cart[2] = headphones;

        Product product_obj = new Product(1, "Laptop", 1200.0F, 100);
        Cart cart_obj = new Cart();
        System.out.println("Welcome to the Simple Shopping App! \n\n\n ");
        System.out.println(" 1.View Products  \n" +
                "2. Add Product to Cart  \n" +
                "3. Remove Product from Cart  \n" +
                "4. View Cart  \n" +
                "5. Checkout  \n" +
                "6. Exit \n\n ");
        while (true) {
            System.out.print("please enter your choice");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter your choice:");
                        product_obj.productID = s.nextInt();
                        System.out.print("Enter product quantity:");
                        product_obj.productQuantity = s.nextInt();
                        cart_obj.addProductToCart(cart_obj.getProducts());
                        break;
                        case 2:
                            System.out.print("Enter your choice:");
                            d.NameofDVD = s.next();
                            System.out.print("Enter composer:");
                            d.Composer = s.next();
                            System.out.print("no of DVDs:");
                            d.noofDVDs = s.nextInt();
                            System.out.print("issued DVD count:");
                            d.issuedDVDCount = Integer.parseInt(s.next());
                            b.addProductToCart(d.NameofDVD, String.valueOf(d.noofDVDs), d.issuedDVDCount);
                            break;
                        case 3:
                            System.out.println("Available Items:");
                            if (b.noofBooks > 0) {
                                b.available = true;
                                avail = "yes";
                            } else {
                                b.available = false;
                                avail = "No";
                            }
                            System.out.println("title:" + b.title + "author:" + b.author + "year:" + b.year + "available:" + avail);
                            break;
                        case 4:
                            System.out.println("Enter the title of the item you want to check out:");
                            b.title = s.next();
                            if (b.noofBooks > 0) {
                                //System.out.println("Item checkout Successfully");
                                b.noofBooks--;
                                b.issuedBooksCount++;
                            } else {
                                System.out.println("Item checkout Successfully");
                            }
                            break;
                        case 5:
                            System.out.println("Enter the title of the item you want to return");
                            b.title = s.next();
                            b.noofBooks++;
                            b.issuedBooksCount--;
                            System.out.println("Item returned successfully!");
                            break;
                        case 6:
                            exit(0);
                            break;

                    } finally {

                    }
            }
        }*/

/*
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
}*/
