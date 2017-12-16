void setup(){
  size(500,500);
  fill(232,224,152);
  ellipse(250,200,300,300);
  fill(206,8,25);
  ellipse(250,200,250,250);
  fill(247,195,5);
  ellipse(250,200,220,220);
}
void draw() {
 PImage olive = loadImage("olive.ppm.gif");
      if(mousePressed){
        image(olive, mouseX, mouseY, 10,10);
      }
    PImage pineapple = loadImage("pineapple.ppm.gif");
    if(mousePressed && (mouseButton == RIGHT)){
      image(pineapple, mouseX, mouseY, 10,10);
    }
      
  
  
  
  
}