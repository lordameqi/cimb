

void main() {
  // int sum = 1 + 2;
  // int substract = 10 - 5;
  // int multiply = 10 * 10;
  // double divide = 20 / 10;
  // int divide2 = 20 ~/ 10;
  // print("sum = $sum");
  // print("substract = $substract");
  // print("multiply = $multiply");
  // print("divide = $divide");
  // print("divide2 = $divide2");

  // var n1  =20;
  // var n2  =10;
  // print("Dart Relational Operator");
  // var res = n1 > n2;
  // print("n1 greater than n2 : $res");

  // res = n1 >= n2;
  // print("n1 greater than equal to n2 : $res");

  // res = n1 <= n2;
  // print("n1 lesser than or equal to n2 : $res");

  // res = n1 != n2;
  // print("n1 not equal to n2 $res");

  // res = n1 == n2;
  // print("n1 equal to n2 : $res");

  var num = 12;
  // print("num is an int? = ${num is int}");
  // print("num is not an int? = ${num is! int}");
  // print("num is an String? = ${num is String}");
  // print("num is not an String? = ${num is! String}");

  // if(num >= 17){
  //   print("you already have driving license");
  // }else{
  //   print("still not yet");
  // }
  // String result;
  // if(num >= 90){
  //   result = 'A';
  // }else if(num >= 80){
  //   result = 'B';
  // }else if(num >= 70){
  //   result = 'C';
  // }else{
  //   result = 'D';
  // }
  // print(result);

  // String? name;
  // String myName = name ?? 'Airel';
  // print(myName);

  // int counter = 0;
  // List<String> students =  ['a','b','c','d','e'];
  // while(counter < students.length){
  //   print("${students[counter]} at position ${counter + 1}");
  //   counter++;
  // }

  // do{
  //   print('counter ${counter + 1}');
  //   counter++;
  // }while(counter < 5);

  // print(counter);
  // for (var i = 0; i < students.length; i++) {
  //   print('${students[i]} at position ${i + 1}');
  // }

  // List<Map<String, Object>> studentDatas = [
  //   for(int i =0; i < students.length; i++){
  //     "identitas": i+1,
  //     "nama": students[i]
  //   }
  // ];

  // print(studentDatas);
  // List<int> nums = [1,2,3,4,5,6,7,8,9,10];
  // for (var i = 0; i < nums.length; i++) {
  //   if ((i+1) > (nums.length/2)) {
  //     break;
  //   }
  //   print(nums[i]);
  // }

  // int i = 0;
  // while(i<10){
  //   i++;
  //   if(i % 2 != 0){
  //     continue;
  //   }
  //   print(i);
  // }

  // List<String> students = ['airel','lana', 'wiliam', 'mike'];
  // for(var a in students){
  //     print(a);
  // }

  List<int> nums = [1,2,3,4,5];
  List<String> newNums = ['#0', for(var i in nums) "#$i"];
  print(newNums);
}