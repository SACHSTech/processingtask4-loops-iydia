import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Assignment: 5.5 - Processing Task 4 - Loops
   * Author: Lydia He
   * Date: Tue Mar 29, 2022
   * Task: Using loop patterns to draw sequences of objects
   */
  
  public void settings() {
	// put your size call here
    width = 600;
    height = 600;
    size(width, height);
  }

  public void setup() {
    background(255, 255, 255);
  }
  
  public void draw() {
    // quadrant 1
    stroke(0);
    strokeWeight(1);
    for (int lineX = 0; lineX <= width*100/222; lineX += width/20) {
      line(lineX, 0, lineX, height/2);
    }
    for (int lineY = 0; lineY <= height/2; lineY += height/20) {
      line(0, lineY, width/2, lineY);
    }
    
    // quadrant 2
    for (int circleY = height/10; circleY < height*100/210; circleY += height*100/1176) {
      for (int circleX = width*100/170; circleX < width*100/102; circleX += width*100/1176) {
        fill(212, 15, 125);
        ellipse(circleX, circleY, width*100/1904, height*100/1904);
      }
    }

    // quadrant 3
    int hue = 0;
    for (int gradX = 0; gradX <= height/2; gradX++) {
      stroke(hue);
      line(gradX, height, gradX, height/2);
      hue += 1.9;
    }
    
    // quadrant 4
    stroke(0);
    int newWidth = width*3/4;
    int newHeight = height*3/4;
    translate(newWidth, newHeight);
    for (int i = 0; i < 5; i++) {
      // petals
      stroke(0);
      fill(220, 93, 52);
      ellipse(0, 0, width*1/22, height*1/3);
      rotate(radians(45));

      //core
      stroke(37, 109, 45);
      fill(37, 109, 45);
      ellipse(0, 0, width*1/11, height*1/11);
    }
  }
}
