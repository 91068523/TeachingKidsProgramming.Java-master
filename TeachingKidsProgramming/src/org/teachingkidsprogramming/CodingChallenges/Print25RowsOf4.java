package org.teachingkidsprogramming.CodingChallenges;

public class Print25RowsOf4
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 25; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        System.out.print(((i * 4) + j + 1) + " ");
      }
      System.out.println();
    }
  }
}
