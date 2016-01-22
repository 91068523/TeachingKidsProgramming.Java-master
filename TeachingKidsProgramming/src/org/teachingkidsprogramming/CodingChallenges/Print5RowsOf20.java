package org.teachingkidsprogramming.CodingChallenges;

public class Print5RowsOf20
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 20; j++)
      {
        System.out.print(((i * 20) + j + 1) + " ");
      }
      System.out.println();
    }
  }
}
