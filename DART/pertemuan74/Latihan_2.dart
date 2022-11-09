import 'dart:io';

void main(){
  print("Masukkan kata panjang = ");
  String? s = stdin.readLineSync().toString();

  print(Pembalik(s));



}

String Pembalik (String a){

  List<String> strarray = a.split(" ");

  var reversedList = new List.from(strarray.reversed);

  return reversedList.join(' ');
}


