    import java.util.Scanner;
    public class Scanclass {
        public static void main(String args[]){

            //creating object of scanner class
            Scanner s=new Scanner(System.in);

            System.out.print("Enter your grade: ");

            char grade=s.next().charAt(0);

            System.out.println("Grade: "+grade);
        }


    }

