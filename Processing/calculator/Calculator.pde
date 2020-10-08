class Claculator {
  String[][] text = new String[][]{{"%", "CE", "C", "<-X"}, {"1/x", "x^2", "x^1/2", "/"}, {"7", "8", "9", "*"}, {"4", "5", "6", "-"}, {"1", "2", "3", "+"}, {"+/-", "0", ".", "="}};
  void button() {
    for (int x=0; x<width/100; x++) {
      for (int y=0; y<(height/50)-2; y++) {
        fill(1);
        strokeWeight(5);
        stroke(127);
        rect(x*100, (y+2)*50, 100, 50, 10);

        fill(255);
        textMode( MODEL );
        text( text[y][x] , x*100+50, (y+2)*50+25);
      }
    }
  }
}


Claculator calculator = new Claculator();

void setup() {
  size(400, 400);
  calculator.button();

}

void draw() {
}
