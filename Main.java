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
    {
      System.out.println("The flavors we have are vanilla, choclate, and mint.");
      System.out.println("Enter what flavor you want.");
      String chosenFlavor = scan.next();
      System.out.println("That will cost " + iceCreamCost(chosenFlavor));
    }
    else
    {
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
  static boolean method2()
  {
    boolean canYouBuy;
    canYouBuy = false;
    return canYouBuy;
  }
}