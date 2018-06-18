import java.util.Scanner;


public class NumberstoWordMain {
	public static void main(final String[] args) {
        NumberstoWord obj=new NumberstoWord();
        String choice = "";
        int n;
         @SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
         while (choice != "0"){
             System.out.println("");
             System.out.println("Enter number between 0-999 to convert into word");
             System.out.println(" Enter (0) Exit");
             n =scan.nextInt();
             choice=Integer.toString(n);
             
             if (choice.equals("0")) {
                 System.out.println("Exit");
                 break;
             } else if ( n < 0){
                 System.out.println("Invalid");
            }
             else System.out.println("'" + obj.numtowordconvert(n) + "'");    
         }
     
     }

}
