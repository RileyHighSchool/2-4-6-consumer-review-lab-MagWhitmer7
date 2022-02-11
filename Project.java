import java.util.Scanner;

public class Project 
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String input = sc.nextLine();
    String output = ("");

    for (int i = 0; i < input.length(); i ++)
      {
        String letter = input.substring (i, i + 1);
        
        if (letter.equals("b") 
            || letter.equals("d") 
            || letter.equals("p") 
            || letter.equals("q"))
          {
            double rand = Math.random();
            if (rand < 0.25)
            {
              output += "b";
            }
            else if (rand < 0.5)
            {
              output += "d";
            }
            else if (rand < 0.75)
            {
              output += "p";
            }
            else
            {
              output += "q";
            }
          }
          else 
          {
          output += letter;
          }
      }
      System.out.println(output);
  }
}
