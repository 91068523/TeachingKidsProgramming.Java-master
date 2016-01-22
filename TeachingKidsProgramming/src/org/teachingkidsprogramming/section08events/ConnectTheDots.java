package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Pinks;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);;
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);;
    Tortoise.setSpeed(10);
    //
    clearTheScreen();
    //
    prepareColorPalette();
  }
  private void clearTheScreen()
  {
    Tortoise.clear();
    new Text("Right click to clear").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Greens.Green);
    ColorWheel.addColor(Blues.Blue);
    ColorWheel.addColor(Purples.Purple);
    ColorWheel.addColor(Pinks.Pink);
    ColorWheel.addColor(Greens.Teal);
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    clearTheScreen();
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //
    addDot(x, y);
  }
  private void addDot(int x, int y)
  {
    addACircle(x, y);
    //
    Tortoise.moveTo(x, y);
  }
  private void addACircle(int x, int y)
  {
    Circle c = new Circle(7, ColorWheel.getNextColor());
    //           Change the circle to be 40% opaque --#9
    c.setTransparency(40);
    c.setCenter(x, y);
    c.addTo(Tortoise.getBackgroundWindow());
  }
}
