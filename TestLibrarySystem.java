import java.util.Scanner;

import static java.lang.System.exit;

abstract class Item {
    abstract void checkout();
    abstract void returnItem();
    abstract void displayDetails();
    String title;
    String author;
    int year;
    boolean available;


}
class Book extends Item{
    String NameofBook;
    int noofBooks=0;
    String Publisher;
    int issuedBooksCount=0;
    void add(String Title, String Author, int year){
        System.out.println("Added Book Successfully");
        noofBooks++;
    }
    @Override
    void checkout() {
        System.out.println("Checked out Successfully");
        noofBooks--;
        issuedBooksCount++;
    }
    @Override
   void returnItem() {
        System.out.println("Book returned Successfully");
        noofBooks++;
        issuedBooksCount--;
   }

    @Override
    void displayDetails() {

    }
}
/*class DVD extends Item{
    String NameofDVD;
    int noofDVDs;
    int TotalDvds;
    boolean DVDAvailable;
    void add(String NameofDVD,int noofDVDs){
        System.out.println("Added Book Successfully");
    }


    @Override
    void returnItem() {
    }
}*/
public class TestLibrarySystem
{
    public static void main(String[] args){
        String avail;
        Book b=new Book();
        System.out.println("Welcome to the Library Management System!\n\n\n ");
        System.out.println(" 1.Add Book \n" +
                "2. Add DVD \n" +
                "3. Display Available Items \n" +
                "4. Check Out Item \n" +
                "5. Return Item \n" +
                "6. Exit \n\n ");
        while(true) {
            System.out.print("please enter your choice");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title:");
                    b.title = s.next();
                    System.out.print("Enter author:");
                    b.author = s.next();
                    System.out.print("Enter publication year:");
                    b.year = s.nextInt();
                    b.add(b.title, b.author, b.year);3
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Available Items:");
                    if(b.noofBooks>0){
                        b.available=true;
                    avail="yes";}
                    else{
                        b.available=false;
                        avail="No";
                        }
                    System.out.println("title:"+b.title+"author:"+b.author+"year:"+b.year+"available:"+avail);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    exit(0);
                    break;


            }
        }
        /*Book b=new Book();
        b.displayDetails();
        b.returnItem();*/
       // String author = b.Author;
        //DVD d=new DVD();
       // d.displayDetails();

    }

    }
