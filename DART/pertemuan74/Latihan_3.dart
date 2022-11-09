void main(){
  List<int> ha = [1,4,9,16,25,36,49,64,81,100];

  List<int> hi = [];

  for(var a in ha){
    if(a % 2 == 0){
      hi.add(a);
    }

  }
  print(hi);
}