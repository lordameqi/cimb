void main(List<String> args) {
  List<int> numbers = [2,5,8,10,33,99,2];
  int find = findOddNumbers(numbers, (int num){
      return num % 2!= 0;
  });
  print("total odd number : $find");
}

int findOddNumbers(List<int> number, Function callback){
  int totalOddNum = 0;
  for (var i in number) {
    if(callback(i)) totalOddNum++;
  }
  return totalOddNum;
}