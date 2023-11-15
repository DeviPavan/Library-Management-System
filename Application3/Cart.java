package Application3;
import java.util.ArrayList;
import java.util.List;

 class Cart {
    List<Product> products;
    double totalCost;

     public Cart() {
         this.products = new ArrayList<>();
         this.totalCost = 0;
     }
      void addProduct(Product product) {
         products.add(product);
         totalCost += product.getProductPrice();
     }
     public void removeProduct(Product product) {
         if (products.remove(product)) {
             totalCost -= product.getProductPrice();
         }
     }
     public double calculateTotalCost() {
         return totalCost;
     }
     public List<Product> getProducts() {
         return new ArrayList<>(products);
     }

 }


    //This is collection of products
   /* ArrayList<ArrayList<Product>> al;
    List<Product> cart(){
        Product[] arr = new Product[3];
        arr[0] = new Product(1,"Laptop",1000, 20);
        arr[1] = new Product(2,"Smartwatch", 2000,30);
        arr[2] = new Product(3,"Headphones", 100,40);
        System.out.println(arr);

        // Now you can access the elements in the array
        for (Product al : arr) {
            System.out.println("Product ID: " + al.getproductID() + ", Quantity: " + al.getProductQuantity());
}

        void addProduct(Product ) {
        al.add(al);
        totalCost++;
        return totalCost;
    }

    public void removeProduct(Product al) {
        if (product.remove(product)) {
            totalCost--;
        }

    }
    public double calculateTotalCost(){
        return totalCost;
    }
    public <product> List<product>etProducts(){
        return (List<product>) new ArrayList<>(al);
    }
}*/
