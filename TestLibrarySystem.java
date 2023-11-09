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
       System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Year: "+year);
        System.out.println("yes it is Available");
    }
    String Title="OOPS through JAVA";
    String Author="Herbert schildt";
    int year=2000;
    boolean available;


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
public class TestLibrarySystem
{
    public static void main(String[] args){
        Book b=new Book();
        b.displayDetails();
        b.returnItem();
       // String author = b.Author;
        DVD d=new DVD();
        d.displayDetails();

    }

    }
