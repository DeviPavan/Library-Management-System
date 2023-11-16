package Application3;
import java.util.ArrayList;
import java.util.List;

  class Cart {
     //collection
    List<Product> al;
      public Cart() {
          this.al = new ArrayList<>();
      }
      public void addProduct(Product product, int quantity) {
          for (Product product1 : al) {
              if (product1.getproductID() == product.getproductID()) {
                  // Product already in cart, update quantity
                  System.out.println("Product already in cart. Updating quantity.");
                  return;
              }
          }
          al.add(new Product(product.getproductID(), product.getProductName(), product.getProductPrice(), product.getProductQuantity()));
          System.out.println("Product added to the cart.");
      }
      public void removeProduct(int productId) {
          for (Product product : al) {
              if (product.getproductID() == productId) {
                  al.remove(product);
                  System.out.println("Product removed from the cart.");
                  return;
              }
          }
          System.out.println("Product not found in the cart.");
      }
      public void viewCart() {
          if (al.isEmpty()) {
              System.out.println("Empty Cart");
          } else {
              System.out.println("Cart Contents:");
              for (Product product : al) {
                  System.out.println(product);
              }
              System.out.println("Total Cost: $" + calculateTotalCost());
          }
      }
      double calculateTotalCost() {
          double totalCost = 0.0;
          for (Product product : al) {
              totalCost += product.getProductPrice() * product.getProductQuantity();
          }
          return totalCost;
      }

      public void clearCart() {

      }
  }





    /*Product[] arr,arr_cart;
    void cart(){
        arr=new Product[3];
        arr_cart=new Product[10];
        arr[0]=new Product(1,"Laptop",1000.4f,20);
        arr[1]=new Product(2,"SmartPhone",2000.4f,30);
        arr[2]=new Product(3,"HeadPhones",500.4f,10);
for(Product product:arr){
    System.out.println("Product ID: \" + product.getProductId() + \", Quantity: \" + product.getQty());\n");
}
        al = new ArrayList<Product>();
        al.add(new Product(1,"Laptop",1000.8f,25));
        al.add(new Product(2,"Pen",2000.8f,40));
        addProductToCart(arr_cart,1,2);

    }
     void addProductToCart(Product[] cart,int productId, int productquantity){

         for(Product product_cart : cart) {

             if (product_cart.getproductID() == productId){
                 product_cart.setProductQuantity(product_cart.getProductQuantity() + productquantity);
                 return;
             }
         }
         for(int i=0;i<cart.length;i++){
             if(cart[i]== null){
                 cart[i]= new Product(productId, getProductName(productId),getProductCost(productId),productquantity);
             }
         }

     }
     public String getProductName(int productId){

         for(Product p1 : arr){

             if(p1.getproductID()==productId){
                 return p1.getProductName();
             }
         }

         return "No Product Found";
     }

     public float getProductCost(int productId){

         for(Product p1 : arr){

             if(p1.getproductID()==productId){
                 return p1.getProductPrice();
             }
         }

         return 0.0f;
     }
 }
*/










    /* public Cart() {
         this.al = new ArrayList<>();
         this.totalCost = 0;
     }
      void addProduct(Product al) {
         al.add(al);
         totalCost ++;//= al.getProductPrice();
          System.out.println(totalCost);
     }
     public void removeProduct(Product al) {
         if (al.remove(al)) {
             totalCost--; //= al.getProductPrice();
         }
     }
     public double calculateTotalCost() {
         return totalCost;
     }
     public List<Products> getProducts() {
         return new ArrayList<>(al);
     }

     public void add(List<Products> al) {
     }
 }
*/
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
