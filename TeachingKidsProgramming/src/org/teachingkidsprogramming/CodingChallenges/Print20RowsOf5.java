package org.teachingkidsprogramming.CodingChallenges;

public class Print20RowsOf5
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 20; i++)
    {
      for (int j = 0; j < 5; j++)
      {
        System.out.print(((i * 5) + j + 1) + " ");
      }
      System.out.println();
    }
  }
}
