package org.teachingkidsprogramming.CodingChallenges;

import java.util.Scanner;

public class DivisibilityBy2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer (must be greater than 0): ");
    int num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Invalid input. Must be 1 or greater. ");
      System.exit(0);
    }
    if (num % 2 == 0)
    {
      System.out.println("yes!");
    }
    else
    {
      System.out.println("nope!");
    }
  }
}
