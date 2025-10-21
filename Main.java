import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1

    for (int i = 1; i <= 25; i += 2)
    {
      System.out.println(i + " ");
    }

    //Problem 2
    System.out.println("Problem 2: ");
    int counter = 0;
    for (int i = 17; i <= 73; i++)
    {
      
      if (counter % 10 == 9)
      {
      System.out.println(i + " ");
      }
      else
      {
        System.out.print(i + " ");
      }
      counter++;
    }


  }
}
