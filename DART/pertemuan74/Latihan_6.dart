import 'dart:io';

void main(){


  drawBoard(3);
}

void drawBoard(int a ){

  String rowLines = " ---";
  String colLines = "|   ";
  for(int i = 0; i < a; i++){

    print(rowLines * a);
    print(colLines  * (a + 1));
  }
}