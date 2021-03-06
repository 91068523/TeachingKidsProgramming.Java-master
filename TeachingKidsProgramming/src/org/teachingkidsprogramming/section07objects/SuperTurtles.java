package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    makeSlowTurtle();
    makeCrazyTurtle();
  }
  private void makeCrazyTurtle()
  {
    Turtle crazyTurtle = new Turtle();
    mtw.addAndShowTurtle(crazyTurtle);
    //crazyTurtle.drawLightning(55);
    //    crazyTurtle.setY(350);
    //    crazyTurtle.setX(50);
    //    for (int i = 0; i < 8; i++)
    //    {
    //      crazyTurtle.turn(15);
    //      crazyTurtle.move(55);
    //      crazyTurtle.setPenWidth(i++);
    //    }
  }
  private void makeSlowTurtle()
  {
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    //slowTurtle.drawTriangle(-50);
    mySlowTriangle(slowTurtle);
  }
  private void mySlowTriangle(Turtle slowTurtle)
  {
    for (int i = 0; i < 3; i++)
    {
      slowTurtle.turn(360 / 3);
      slowTurtle.move(-50);
    }
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    //speedyTurtle.drawTriangle(100);
    myFastTriangle(speedyTurtle);
  }
  private void myFastTriangle(Turtle speedyTurtle)
  {
    for (int i = 0; i < 3; i++)
    {
      speedyTurtle.turn(360 / 3);
      speedyTurtle.move(100);
    }
  }
  private void myLightningBolt(Turtle crazyTurtle)
  {
    crazyTurtle.setY(350);
    crazyTurtle.setX(50);
    for (int i = 0; i < 8; i++)
    {
      crazyTurtle.turn(15);
      crazyTurtle.move(55);
      crazyTurtle.setPenWidth(i++);
    }
  }
}
