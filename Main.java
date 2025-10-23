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

    //problem 3
    System.out.println("Problem 3");
    Scanner sc = new Scanner(System.in);
    int n;
    int counter1 = 0;

    System.out.println("Enter a number between 0 and 50: ");
    n = sc.nextInt();

    if (n <= 0 || n >= 50)
    {
      System.out.println("error");

    }
    else if (n > 0 && n < 50)
    {
       for (int a = n; a <= 50; a++)
    {
      
      if (counter1 % 5 == 4)
      {
      System.out.println(a + " ");
      }
      else
      {
        System.out.print(a + " ");
      }
      counter1++;

    }

  }
// Problem 4

System.out.println("Problem 4");
int num;
System.out.println("Enter a number greater than 0");
num = sc.nextInt();

if (num <= 0)
{
  System.out.println("error");

}
else 
{
for (int b = num; b >= 0; b-- )
{
  if (b % 3 == 0)
  {
    System.out.print(b + " ");
  }
 
}
}

}


}