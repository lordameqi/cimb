import 'dart:math';
import 'dart:io';

void main(){
  Random random = new Random.secure();
  int randomNumber = random.nextInt(100);
// print(randomNumber);
  int n;
  print("Masukkan nilai yg menurut anda benar = ");
  String? s = stdin.readLineSync();
  if (s != null){
    n = int.parse(s);
    // print(n);
    if(n > randomNumber){
      print('too high');
    }else if(n < randomNumber){
      print("too low");
    }else{
      print("exactly right");
    }
  }

}