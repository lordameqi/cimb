void main(){
List<int> initial = [9,2,6,8,5,3,2,9,7,1];
someFunction(initial);

}

void someFunction(List<int> angka) {
  // do something
  print(angka.toSet().toList());
}

