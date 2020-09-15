import java.util.Scanner;

/**
 *This program calculates the discounts for customers
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to type in amount of money spent
    System.out.println("Enter the amount you spent");
    
    //get integer from user 
    double amount = input.nextDouble();
    

  

    //calculate the deal
    if (amount < 40 ){
      //discount amount
      double discount = amount * 0.10;

      //saved amount
      System.out.println("Your discounted amount is " + discount);

      double total = amount-discount;

      //Final amount
      System.out.println("Your final price is " + total);



    }
    //calculate the deal
      else if(amount < 80 ){
      //discount amount
      double discount = amount * 0.20;

      //saved amount
      System.out.println("Your discounted amount is " + discount);

      double total = amount-discount;

      //Final amount
      System.out.println("Your final price is " + total); 

    
    

    
    }

    //calculate the deal
      else if(amount < 120 ){
      //discount amount
      double discount = amount * 0.30;

      //saved amount
      System.out.println("Your discounted amount is " + discount);

      double total = amount-discount;

      //Final amount
      System.out.println("Your final price is " + total); 

    
    

    
    }

    //calculate the deal
     else if(amount > 120){
      //discount amount
      double discount = amount * 0.40;

      //saved amount
      System.out.println("Your discounted amount is " + discount);

      double total = amount-discount;

      //Final amount
      System.out.println("Your final price is " + total); 

    
    

    
    }
  }
}
