package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup(){
		
		size(400, 450);
		background(200, 200, 200);
		stroke(0);
		img = loadImage("http://s2.pticica.com/foto/0001258392_l_0_dwl2d5.jpg", "jpg");
		img.resize(width, 0);
		image(img, 0, 0);
	}
	
	public void draw(){
		
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(6*(width/7), height/7, width/8, height/9);	
	}

	public int[] sunColorSec(float seconds){
		
		int[] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30 - seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
		
	}
}
