void main(){
  var p1 = Persona();
  p1.persona_full_name = 'veve kordan';
  p1.persona_age =110;

  print('p1 full name; ${p1.persona_full_name}');
  print('p1 age: ${p1.person_age}');
}

class Persona{
  String _fullname = '';
  double _age = 0;

  set persona_full_name(String name){
    var nameSplit = name.split(' ');
    var capitalizedName = '';

    nameSplit.forEach((element) {
      capitalizedName += '${element[0].toUpperCase()}${element.substring(1,element.length)}';
      if(element != nameSplit[nameSplit.length - 1]) capitalizedName+= ' ';
    });
    this._fullname= capitalizedName;
  }

  String get persona_full_name{
    return this._fullname;
  }

  set persona_age(double personAge){
    if(personAge < 0 || personAge > 100){
      print('age has to be more than 0 and cannot more than 100');
    }else{
      this._age = personAge;
    }
  }

  double get person_age{
    return this._age;
  }



}