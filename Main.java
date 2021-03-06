import java.util.Scanner;
class Main 
{
  //The main executing method
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    //Asks the user for their information
    System.out.println("Do you want Ice Cream? (true or false)");
    boolean wantsIceCream = scan.nextBoolean();
    if(wantsIceCream)
    { //will happen if the user says true
      //first step in getting ice cream. will ask you for the flavor you want.
      System.out.println("The flavors we have are vanilla, chocolate, and mint.");
      System.out.println("Enter what flavor you want.");
      String chosenFlavor = scan.next();
      System.out.println("That will cost " + iceCreamCost(chosenFlavor));
      
      //second step in geting ice cream. calculates the cost and ask user for the amount of money they have.
      double cost = iceCreamCost(chosenFlavor);
      System.out.println("Enter the amount of money you have.");
      double customersMoney = scan.nextDouble();
      boolean canYouPay = calculatePayment(customersMoney, cost);
      
      if(canYouPay)
      { //will happen if you can buy ice cream
        System.out.println("Yes, You Can Buy Ice Cream!");
        System.out.println("Bye! Enjoy Your Ice Cream!");
      }
      else
      { //will happen if you can't buy ice cream
        System.out.println("No, You Can't Buy Ice Cream.");
        System.out.println("Bye!");
      }
      
    }
    else
    { //will happen if the user says false
      System.out.println("Bye!");
    }

    
  }

  //This method converts the ice cream chosen into a price
  static double iceCreamCost(String chosen)
  {
    double cost = 0;
    
    if(chosen.equals("vanilla"))
    {
      cost = 1.00;
    }
    else if(chosen.equals("chocolate"))
    {
      cost = 1.50;
    }
    else if(chosen.equals("mint"))
    {
      cost = 2.00;
    }
    else
    {
      System.out.println("Sorry we do not have that flavor. Please come back again!");
    }
    
    return cost;
  }

  //This method will calculate the cost with tax and compare it to how much money you have to see you can buy the ice cream.
  static boolean calculatePayment(double money, double cost)
  {
    boolean canYouBuy;

    System.out.println("Tax is 6%");
    double total = cost + (cost * 0.06);
    System.out.println("Total Cost Will Be " + total);
    double finalCalc = money - total;
    System.out.println(money + " - " + total + " = " + finalCalc);

    canYouBuy = 0 < finalCalc;

    return canYouBuy;
  }
}