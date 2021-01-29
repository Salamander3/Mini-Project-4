import java.util.Scanner;
class Main 
{
  //The main executing method
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    //Asks the user for their information
    System.out.println("Do you want Ice Cream");
    boolean wantsIceCream = scan.nextBoolean();
    if(wantsIceCream)
    {
      System.out.println("The flavors we have are vanilla, choclate, and strawberry");
      System.out.println("Enter what flavor you want.");
      choosenFlavor = scan.nextLine();
    }
    else
    {
      System.out.println("Bye!");
    }

    
  }

  //This method randomizes the number the user enters
  static String iceCreamChecker(String chosen)
  {
    String flavor;
    if(chosen == "vanilla")
    {
      flavor = "vanilla";
    }
    if(chosen == "chocolate")
    {
      flavor = "chocolate";
    }
    if(chosen == "strawberry")
    {
      flavor = "strawberry";
    }
    else
    {
      System.out.println("Sorry we do not have that flavor. Please come back again!");
    }
    return flavor;
  }

  //This method
  static boolean method2()
  {
    boolean

    return
  }
}