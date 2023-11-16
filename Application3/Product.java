package Application3;

class Product {
    int productID;
    String productName;
    float productPrice;
    int productQuantity;

    public Product(int productID, String productName, float productPrice, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getproductID() {

        return productID;
    }

    public void setproductID(int productID) {

        productID = productID;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        productName = productName;
    }

    public float getProductPrice() {

        return productPrice;
    }

    public void setProductPrice(float productPrice) {

        productPrice = productPrice;
    }

    public int getProductQuantity() {

        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {

        productQuantity = productQuantity;
    }

    public String toString() {
        return "Product{" + "name='" + productName + '\'' + ",productPrice=" + productPrice + '\'' + "productQuantity=" + productQuantity + '\'' + "productName=" + productName + '}';

    }

}



