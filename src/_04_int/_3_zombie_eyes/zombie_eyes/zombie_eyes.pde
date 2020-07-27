
void setup() {
size(600,600);
}
void draw() {
PImage face = loadImage("zombieEyes.png");
face.resize(600,600);
image(face,0,0);
//Left Eye
fill(mouseX,mouseY,mouseX);
ellipse(252,155,20,20);
//Right Eye
ellipse(375,161,20,20);
fill(0,0,0);
ellipse(252,155,10,10);
ellipse(375,161,10,10);
}
