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
class DVD extends Item{
    String NameofDVD;
    int noofDVDs=0;
    String Composer;
    int issuedDVDCount=0;
    void add(String NameofDVD, String composer, int noofDVDs,int issuedDVDCount){
        System.out.println("Added DVD Successfully");
        noofDVDs++;
    }
    @Override
    void checkout() {
        System.out.println("Checked out Successfully");
        noofDVDs--;
        issuedDVDCount++;
    }

    @Override
    void returnItem() {
            System.out.println("DVD returned Successfully");
            noofDVDs++;
            issuedDVDCount--;
        }

    @Override
    void displayDetails() {

    }
}
public class TestLibrarySystem
{
    public static void main(String[] args){
        String avail;
        Book b=new Book();
        DVD d=new DVD();
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
                    b.add(b.title, b.author, b.year);
                    break;
                case 2:
                    System.out.print("Enter NameofDVD:");
                    d.NameofDVD = s.next();
                    System.out.print("Enter composer:");
                    d.Composer=s.next();
                    System.out.print("no of DVDs:");
                    d.noofDVDs = s.nextInt();
                    System.out.print("issued DVD count:");
                    d.issuedDVDCount= Integer.parseInt(s.next());
                    b.add(d.NameofDVD, String.valueOf(d.noofDVDs),d.issuedDVDCount);
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
                    System.out.println("Enter the title of the item you want to check out:");
                    b.title = s.next();
                    if(b.noofBooks>0)
                    {
                        //System.out.println("Item checkout Successfully");
                        b.noofBooks--;
                        b.issuedBooksCount++;
                    }
                    else {
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


            }
        }

    }

    }
