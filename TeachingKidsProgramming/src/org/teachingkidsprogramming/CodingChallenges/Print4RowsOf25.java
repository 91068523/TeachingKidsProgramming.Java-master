package org.teachingkidsprogramming.CodingChallenges;

public class Print4RowsOf25
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 25; j++)
      {
        System.out.print(((i * 25) + j + 1) + " ");
      }
      System.out.println();
    }
  }
}