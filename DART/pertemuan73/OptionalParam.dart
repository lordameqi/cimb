void main() {
  const students = ['airel','joey','lana'];
  print(findStudentIndex(students));
  print(findStudentIndex([],'lana'));
  print(findStudentIndex(students, 'airel'));  
}

  String findStudentIndex(List<String> datas,[String? student]){
    if(student == null){
      return "Student name required";
    }
    if(datas.isEmpty){
      return "data cannot be empty";
    }
    int? index;
    
    for (var i = 0; i < datas.length; i++) {
      if (datas[i].toLowerCase() == student.toLowerCase()) {
        index= i;
      }
    }
    return index != null ? 'student exist on index ${index}': 'student not found';
  }
