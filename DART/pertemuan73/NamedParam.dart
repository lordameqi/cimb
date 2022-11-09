void main(List<String> args) {
  List<Map<String, Object>> student = [
    {
      "name": "airel",
      "score" : 20 
    },
    {
      "name" : "veve",
      "score" : 82
    }
  ];
  for (var i in student ) {
    var result = checkGrade(name: (i["name"] as String), score: (i["score"] as int));
    print(result);
  }
}

String checkGrade({String? name, int? score}){
    var result = (score as int) >= 80 ? "$name lulus" : "$name tidak lulus";
    return result;
}