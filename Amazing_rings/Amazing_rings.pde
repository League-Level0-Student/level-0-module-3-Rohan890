int ytwospeed = 1;
int yspeed = 1;
int y = 300;
int ytwo = 300;
void draw(){
background(255,255,255);
  y+= yspeed;
for(int x=0; x<300; x+=13){
ellipse(y,300,300-x,300-x);
}if(y==601){
yspeed= -1;
}
ytwo-= ytwospeed;
for(int x=0; x<300; x+=13){
ellipse(ytwo,300,300-x,300-x);
}
if(ytwo==0){
ytwospeed = -1;
}
}
void setup(){
size(800,600);
noFill();
}