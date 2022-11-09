void main(){
  List<int> a = [1,1,2,3,5,8,13,21,34,55,89];
  List<int> b = [1,2,3,4,5,6,7,8,9,10,11,12,13];

  List<int> campuran = [...a,...b];

  var unique = campuran.toSet().toList();
  // print(unique);
  for (int i = 0; i < unique.length; i++) {
    campuran.remove(unique[i]);
  }
  print(campuran.toSet().toList());
  print(campuran.toSet().toList());
}