
void setup() {
    size(500,500);
}
void draw() {
    //dough
    fill(205,181,134);
    ellipse(250,250,250,250);
    //tomato sauce
    fill(200,0,0);
    ellipse(250,250,225,225);
    //pepperonis
    fill(100,0,0);
    float xRandom1 = random(151);
    float xRandom2 = random(151);
    float xRandom3 = random(151);
    float xRandom4 = random(151);
    float xRandom5 = random(151);
    xRandom1 = xRandom1+180;
    xRandom2 = xRandom2+180;
    xRandom3 = xRandom3+180;
    xRandom4 = xRandom4+180;
    xRandom5 = xRandom5+180;
    float yRandom1 = random(151);
    float yRandom2 = random(151);
    float yRandom3 = random(151);
    float yRandom4 = random(151);
    float yRandom5 = random(151);
    yRandom1 = yRandom1+180;
    yRandom2 = yRandom2+180;
    yRandom3 = yRandom3+180;
    yRandom4 = yRandom4+180;
    yRandom5 = yRandom5+180;
    ellipse(xRandom5,yRandom5,20,20);
    ellipse(xRandom1,yRandom1,20,20);
    ellipse(xRandom2,yRandom2,20,20);
    ellipse(xRandom3,yRandom3,20,20);
    ellipse(xRandom4,yRandom4,20,20);
    
    
    
}
