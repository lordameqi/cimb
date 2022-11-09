void main() {
  print(greet("Rachmad"));
  print(introduce("dw",2));
  var a = 1;
  // a = 'ss';
}

String greet(String name){
  return "how are you ${name} tampan?";
}

String introduce(String ha, int hu){
  var result = 'hi, i`m ${ha}, and i`ve ${hu} years of experience';
  return result;
}