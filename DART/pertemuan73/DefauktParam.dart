void main(List<String> args) {
  param_test(12);
  param_test(123, np1: 10);
  param_test(123,np2: 20);
  param_test(123, np1: 30,np2: 40);  
}
void param_test(p1,{int np1 = 25, int? np2}){
  print("#####################");
  print("Param value is : $p1");
  print("Named param 1 value is : ${np1}");
  print("named param 2 vlaue is : ${np2}");
}