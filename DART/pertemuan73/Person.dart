void main(List<String> args) {
  var p1 = Person(name: "veve",age: 12, Gender: 'Male');

  print(p1.toString());
  print("p1 Name: ${p1.name}, Age : ${p1.age}, Gender: ${p1.Gender}");
  p1.greet();
  var p2 = Person(name: 'yudz',age: 27,Gender: "male");


  print("p2 Name: ${p2.name}, Age : ${p2.age}, Gender: ${p2.Gender}");
  p2.greet();
}

class Person {
  String? name;
  int? age;
  String? Gender;


  Person({this.name, this.age, this.Gender});

  void completeProfile(){
    print('name : ${this.name} , age : ${this.age}, gender: ${this.Gender}');
  }

  void greet(){
    print("Hi, i'm ${this.name}, nice tumit yu");
  }

  @override
  String toString() {
    return 'Person{name: $name, age: $age, Gender: $Gender}';
  }

}