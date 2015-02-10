import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	background(0);
	size(800,800);
	noFill();
	fractal(400,400,400);

}
public void draw()
{

}
public void fractal(int x, int y, int len)
{
	ellipse(x,y,len * 2, len * 2);
	if(len > 10)
	{
		//fractal(x-len/2,y,len/2);
		//fractal(x+len/2,y,len/2);
		stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		fractal(x-4*len/9,y-4*len/9,len/2);
		stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		fractal(x-4*len/9,y+4*len/9,len/2);
		stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		fractal(x+4*len/9,y-4*len/9,len/2);
		stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		fractal(x+4*len/9,y+4*len/9,len/2);
		//fractal(x,y-len/2,len/2);
		//fractal(x,y+len/2,len/2);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
