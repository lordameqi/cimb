// // class Enoloyee{

// //     constructor(name){
// //         this.name = name;
// //     }
// //     dowork(){
// //         return 'complete'; 
// //     }

// //     getName(){
// //         return this.name;
// //     }

    
// // }

// class Person{

//     constructor(name){
//         this.name = name;
//     }
  
//     getName(){
//         return this.name;
//     }  
// }

// class Employee extends Person{
//     constructor(name, title){
//         super(name);
//         this.title = title;
//     }

//     getTitleandName(){
//        // return [this.title, this.name].join(" ");
//         return this.title+ " " +this.name;
//     }

//     doWorknih(){
//         return this.name+" sedang bekerja";
//     }
// }
// let scott = new Employee("veve");
// let scott2 = new Employee("veve","pelajar");
// console.log(scott.getName());
// console.log(scott.doWorknih());

// console.log(scott2.getTitleandName());

class Employee{
    dowork(){
        console.log("Im Sorry");
    }
}

export default Employee;