abstract class Item {
    void checkout(){
        System.out.println("Checking out....");
    }
    abstract String returnItem();
   // void returnItem()
   static {
        System.out.println("Return Item Details....");
    }
    public void displayDetails(){
        System.out.println("Details....");
    }
    String Title;
    String Author;
    int year;
    boolean available;

    // void checkOut()
    //void returnItem()
    void display() {

    }
}
class Book extends Item{
    String NameofBook;
    int noofBooks;

    @Override
    String returnItem() {
        return null;
    }
}
class DVD extends Item{
    String NameofDVD;
    int noofDVDs;

    @Override
    String returnItem() {
        return null;
    }
}
