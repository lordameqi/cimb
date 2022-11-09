void main(){
  print('print ke 1');
  Future.delayed(
      Duration(seconds: 1),
          () => print('asas')
  );
  print('print ke 2');
  print('print ke 3');

}